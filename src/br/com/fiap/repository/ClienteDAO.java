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
		String sql = "insert into tb_sgr_cliente(nr_cpf_cliente, dt_nasc_cliente, nm_cliente, ds_email, ds_endereco, ds_estado_civil, ds_genero, ds_celular, nr_tempo_habilitacao) values (?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, cliente.getCpf());
			stmt.setDate(2, cliente.getDataNascimento());
			stmt.setString(3, cliente.getNome());
			stmt.setString(4, cliente.getEmail());
			stmt.setString(5, cliente.getEndereco());
			stmt.setString(6, cliente.getEstadoCivil());
			stmt.setString(7, cliente.getGenero());
			stmt.setString(8, cliente.getCelular());
			stmt.setInt(9, cliente.getTempoHabilitacao());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Cliente> selectAll() {
		List<Cliente> clientes = new ArrayList<Cliente>();
		String sql = "select * from tb_sgr_cliente order by nr_cpf_cliente";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setCpf(rs.getInt("nr_cpf_cliente"));
				cliente.setDataNascimento(rs.getDate("dt_nasc_cliente"));
				cliente.setNome(rs.getString("nm_cliente"));
				cliente.setEmail(rs.getString("ds_email"));
				cliente.setEndereco(rs.getString("ds_endereco"));
				cliente.setEstadoCivil(rs.getString("ds_estado_civil"));
				cliente.setGenero(rs.getString(("ds_genero")));
				cliente.setCelular(rs.getString("ds_celular"));
				cliente.setTempoHabilitacao(rs.getInt("nr_tempo_habilitacao"));
				clientes.add(cliente);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clientes;
	}

	public Cliente selectById(long nr_cpf_cliente) {
		Cliente cliente = null;
		String sql = "select * from tb_sgr_cliente where nr_cpf_cliente=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, nr_cpf_cliente);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				cliente = new Cliente();
				cliente.setCpf(rs.getLong("nr_cpf_cliente"));
				cliente.setDataNascimento(rs.getDate("dt_nasc_cliente"));
				cliente.setNome(rs.getString("nm_cliente"));
				cliente.setEmail(rs.getString("ds_email"));
				cliente.setEndereco(rs.getString("ds_endereco"));
				cliente.setEstadoCivil(rs.getString("ds_estado_civil"));
				cliente.setGenero(rs.getString("ds_genero"));
				cliente.setGenero(rs.getString("ds_celular"));
				cliente.setTempoHabilitacao(rs.getInt("nr_tempo_habilitacao"));
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cliente;
	}

	public void delete(long nr_cpf_cliente) {
		String sql = "delete from tb_sgr_cliente where nr_cpf_cliente=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, nr_cpf_cliente);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(Cliente cliente) {
		String sql = "update tb_sgr_cliente set dt_nasc_cliente=?, nm_cliente=?, ds_email=?, ds_endereco=?, ds_estado_civil=?, ds_genero=?, ds_celular=?, nr_tempo_habilitacao=? where nr_cpf_cliente=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setDate(1, cliente.getDataNascimento());
			stmt.setString(2, cliente.getNome());
			stmt.setString(3, cliente.getEmail());
			stmt.setString(4, cliente.getEndereco());
			stmt.setString(5, cliente.getEstadoCivil());
			stmt.setString(6, cliente.getGenero());
			stmt.setString(7, cliente.getCelular());
			stmt.setInt(8, cliente.getTempoHabilitacao());
			stmt.setLong(9, cliente.getCpf());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
