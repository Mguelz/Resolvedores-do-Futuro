package br.com.fiap.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.connection.ConnectionFactory;
import br.com.fiap.model.Corretor;

public class CorretorDAO {
	private Connection conexao;

	public CorretorDAO() throws SQLException {
		this.conexao = ConnectionFactory.conectar();
	}

//métodos

	// insert
	public void insert(Corretor corretor) {
		String sql = "insert into TB_SGR_CORRETOR (ID_CORRETOR, DS_NOME, DS_ENDERECO) values (?,?,?)";

		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			// complemento da query
			stmt.setLong(1, corretor.getIdCorretor());
			stmt.setString(2, corretor.getNome());
			stmt.setString(3, corretor.getEndereco());
			// executar a query
			stmt.execute();
			stmt.close();
			// fechar a operação
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// selectById

	public Corretor selectById(long idCorretor) {
		Corretor corretor = null;
		String sql = "select * from TB_SGR_CORRETOR where id_corretor=?";

		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, idCorretor);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) { // enquanto tiver dados na tabela
				corretor = new Corretor();
				corretor.setIdCorretor(rs.getLong("id_corretor"));
				corretor.setNome(rs.getString("ds_nome"));
				corretor.setEndereco(rs.getString("ds_endereco"));
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return corretor;

	}

	// update
	public void update(Corretor corretor) {
		String sql = "update TB_SGR_CORRETOR set DS_NOME=?, DS_ENDERECO=?  where id_corretor=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, corretor.getNome());
			stmt.setString(2, corretor.getEndereco());
			stmt.setLong(3, corretor.getIdCorretor());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	// delete

	public void delete(long IdCorretor) {
		String sql = "delete from TB_SGR_CORRETOR where id_corretor= ?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, IdCorretor);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public List<Corretor> selectAll() {
		List<Corretor> corretores = new ArrayList<Corretor>();
		String sql = "select * from tb_sgr_corretor order by id_corretor";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Corretor corretor = new Corretor();
				corretor.setIdCorretor(rs.getLong("id_corretor"));
				corretor.setNome(rs.getString("ds_nome"));
				corretor.setEndereco(rs.getString("ds_endereco"));
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return corretores;
	}
}//TODO FAZER SELECT ALL