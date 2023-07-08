package br.com.fiap.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.connection.ConnectionFactory;
import br.com.fiap.model.EspecialidadeModel;

public class EspecialidadeDAO {
	private Connection conexao;

	public EspecialidadeDAO() throws SQLException {
		this.conexao = ConnectionFactory.conectar();
	}

	public void insert(EspecialidadeModel especialidade) {
		String sql = "insert into sgr_especi(nr_codigo, nm_especialidade) values (?,?)";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, especialidade.getNr_codigo());
			stmt.setString(2, especialidade.getNm_especialidade());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<EspecialidadeModel> selectAll() {
		List<EspecialidadeModel> especialidades = new ArrayList<EspecialidadeModel>();
		String sql = "select * from sgr_especi order by nr_codigo";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				EspecialidadeModel especialidade = new EspecialidadeModel();
				especialidade.setNr_codigo(rs.getInt("nr_codigo"));
				especialidade.setNm_especialidade(rs.getString("nm_especialidade"));
				especialidades.add(especialidade);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return especialidades;
	}

	public EspecialidadeModel selectById(int nr_especialidade) {
		EspecialidadeModel especialidade = null;
		String sql = "select * from sgr_especi where nr_codigo = ?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, nr_especialidade);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				especialidade = new EspecialidadeModel();
				especialidade.setNr_codigo(rs.getInt("nr_codigo"));
				especialidade.setNm_especialidade(rs.getString("nm_especialidade"));
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return especialidade;
	}

	public void delete(int nr_especialidade) {
		String sql = "delete from sgr_especi where nr_codigo = ?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, nr_especialidade);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(EspecialidadeModel especialidade) {
		String sql = "update sgr_especi set nm_especialidade = ? where nr_codigo=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, especialidade.getNm_especialidade());
			stmt.setLong(2, especialidade.getNr_codigo());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}