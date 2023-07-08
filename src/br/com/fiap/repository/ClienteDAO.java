package br.com.fiap.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.connection.ConnectionFactory;
import br.com.fiap.model.Cliente;

public class ClienteDAO {
	private Connection conexao;

	public ClienteDAO() throws SQLException {
		this.conexao = ConnectionFactory.conectar();
	}

	public void insert(Cliente cliente) {
		String sql = "insert into sgr_cliente (nr_cpf, nm_cliente, sgr_corretor_nr_id, dt_nascimento, ds_email, ds_estado, ds_genero, nr_tempo, nr_dependente) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, cliente.getCpf());
			stmt.setString(2, cliente.getNomeCliente());
			stmt.setInt(3, cliente.getCorretorId());
			stmt.setDate(4, cliente.getDataNascimento());
			stmt.setString(5, cliente.getEmail());
			stmt.setString(6, cliente.getEstadoCivil());
			stmt.setString(7, cliente.getGenero());
			stmt.setInt(8, cliente.getTempoHabilitacao());
			stmt.setInt(9, cliente.getDependente());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Cliente> selectAll() {
		List<Cliente> clientes = new ArrayList<>();
		String sql = "select * from sgr_cliente";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setCpf(rs.getLong("nr_cpf"));
				cliente.setNomeCliente(rs.getString("nm_cliente"));
				cliente.setCorretorId(rs.getInt("sgr_corretor_nr_id"));
				cliente.setDataNascimento(rs.getDate("dt_nascimento"));
				cliente.setEmail(rs.getString("ds_email"));
				cliente.setEstadoCivil(rs.getString("ds_estado"));
				cliente.setGenero(rs.getString("ds_genero"));
				cliente.setTempoHabilitacao(rs.getInt("nr_tempo"));
				cliente.setDependente(rs.getInt("nr_dependente"));
				clientes.add(cliente);
			}

			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clientes;
	}

	public Cliente selectById(long nr_cpf) {
		Cliente cliente = null;
		String sql = "select * from sgr_cliente where nr_cpf = ?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, nr_cpf);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				cliente = new Cliente();
				cliente.setCpf(rs.getLong("nr_cpf"));
				cliente.setNomeCliente(rs.getString("nm_cliente"));
				cliente.setCorretorId(rs.getInt("sgr_corretor_nr_id"));
				cliente.setDataNascimento(rs.getDate("dt_nascimento"));
				cliente.setEmail(rs.getString("ds_email"));
				cliente.setEstadoCivil(rs.getString("ds_estado"));
				cliente.setGenero(rs.getString("ds_genero"));
				cliente.setTempoHabilitacao(rs.getInt("nr_tempo"));
				cliente.setDependente(rs.getInt("nr_dependente"));
			}

			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cliente;
	}

	public void update(Cliente cliente) {
		String sql = "update sgr_cliente set sgr_corretor_nr_id=?, nm_cliente=?, dt_nascimento=?, ds_email=?, ds_estado=?, ds_genero=?, nr_tempo=?, nr_dependente=? where nr_cpf=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, cliente.getCorretorId());
			stmt.setString(2, cliente.getNomeCliente());
			stmt.setDate(3, cliente.getDataNascimento());
			stmt.setString(4, cliente.getEmail());
			stmt.setString(5, cliente.getEstadoCivil());
			stmt.setString(6, cliente.getGenero());
			stmt.setInt(7, cliente.getTempoHabilitacao());
			stmt.setInt(8, cliente.getDependente());
			stmt.setLong(9, cliente.getCpf());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(long nr_cpf) {
		String sql = "delete from sgr_cliente where nr_cpf=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, nr_cpf);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
