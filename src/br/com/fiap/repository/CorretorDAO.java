package br.com.fiap.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.connection.ConnectionFactory;
import br.com.fiap.model.CorretorModel;
import br.com.fiap.model.EspecialidadeModel;

public class CorretorDAO {
	private Connection conexao;

	public CorretorDAO() throws SQLException {
		this.conexao = ConnectionFactory.conectar();
	}

	// insert
	public void insert(CorretorModel corretor) {
		String sql = "INSERT INTO sgr_corretor (nr_id, nm_corretor, ds_endereco, ds_celular, sgr_especi_nr_codigo) VALUES (?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, corretor.getId());
			stmt.setString(2, corretor.getNome());
			stmt.setString(3, corretor.getEndereco());
			stmt.setString(4, corretor.getCelular());
			stmt.setInt(5, corretor.getEspecialidade().getNr_codigo()); // pegando a chave primaria da tabela especialidade
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// selectAll
	public List<CorretorModel> selectAll() {
		List<CorretorModel> corretores = new ArrayList<>();
		String sql = "SELECT * FROM sgr_corretor";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				CorretorModel corretor = new CorretorModel();
				corretor.setId(rs.getInt("nr_id"));
				corretor.setNome(rs.getString("nm_corretor"));
				corretor.setEndereco(rs.getString("ds_endereco"));
				corretor.setCelular(rs.getString("ds_celular"));
				EspecialidadeDAO especialidadeDAO = new EspecialidadeDAO();
				EspecialidadeModel especialidade = especialidadeDAO.selectById(rs.getInt("sgr_especi_nr_codigo"));
				corretor.setEspecialidade(especialidade);
				corretores.add(corretor);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return corretores;
	}

	// selectById
	public CorretorModel selectById(int id) {
		CorretorModel corretor = null;
		String sql = "SELECT * FROM sgr_corretor WHERE nr_id = ?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				corretor = new CorretorModel();
				corretor.setId(rs.getInt("nr_id"));
				corretor.setNome(rs.getString("nm_corretor"));
				corretor.setEndereco(rs.getString("ds_endereco"));
				corretor.setCelular(rs.getString("ds_celular"));
				EspecialidadeDAO especialidadeDAO = new EspecialidadeDAO();
				EspecialidadeModel especialidade = especialidadeDAO.selectById(rs.getInt("sgr_especi_nr_codigo"));
				corretor.setEspecialidade(especialidade);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return corretor;
	}

	// update
	public void update(CorretorModel corretor) {
		String sql = "UPDATE sgr_corretor SET nm_corretor = ?, ds_endereco = ?, ds_celular = ?, sgr_especi_nr_codigo = ? WHERE nr_id = ?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, corretor.getNome());
			stmt.setString(2, corretor.getEndereco());
			stmt.setString(3, corretor.getCelular());
			stmt.setInt(4, corretor.getEspecialidade().getNr_codigo()); // pegando a chave primaria da tabela especialidade 
			stmt.setInt(5, corretor.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// delete
	public void delete(int id) {
		String sql = "DELETE FROM sgr_corretor WHERE nr_id = ?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}