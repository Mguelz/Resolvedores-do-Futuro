package br.com.fiap.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.connection.ConnectionFactory;
import br.com.fiap.model.Fipe;

public class FipeDAO {
	private Connection conexao;

	public FipeDAO() throws SQLException {
		this.conexao = ConnectionFactory.conectar();
	}

	public void insert(Fipe fipe) {
		String sql = "insert into tb_sgr_fipe(id_veiculo, ds_marca, ds_modelo, dt_ano_modelo, vl_preco_medio) values (?,?,?,?,?)";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, fipe.getId_veiculo());
			stmt.setString(2, fipe.getMarca());
			stmt.setString(3, fipe.getModelo());
			stmt.setString(4, fipe.getAnoModelo());
			stmt.setDouble(5, fipe.getPrecoMedio());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Fipe> selectAll() {
		List<Fipe> fipe = new ArrayList<Fipe>();
		String sql = "select * from tb_sgr_fipe order by id_veiculo";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Fipe fipe1 = new Fipe();
				fipe1.setId_veiculo(rs.getInt("id_veiculo"));
				fipe1.setMarca(rs.getString("ds_marca"));
				fipe1.setModelo(rs.getString("ds_modelo"));
				fipe1.setAnoModelo(rs.getString("dt_ano_modelo"));
				fipe1.setPrecoMedio(rs.getDouble("vl_preco_medio"));
				fipe.add(fipe1);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return fipe;
	}

	public Fipe selectById(int idVeiculo) {
		Fipe fipe = null;
		String sql = "select * from tb_sgr_fipe where id_veiculo=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, idVeiculo);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				fipe = new Fipe();
				fipe.setId_veiculo(idVeiculo);
				fipe.setMarca(rs.getString("ds_marca"));
				fipe.setModelo(rs.getString("ds_modelo"));
				fipe.setAnoModelo(rs.getString("dt_ano_modelo"));
				fipe.setPrecoMedio(rs.getDouble("vl_preco_medio"));
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return fipe;
	}

	public void delete(int idVeiculo) {
		String sql = "delete from tb_sgr_fipe where id_veiculo=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, idVeiculo);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(Fipe fipe) {
		String sql = "update tb_sgr_fipe set ds_marca=?, ds_modelo=?, dt_ano_modelo=?, vl_preco_medio=? where id_veiculo=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, fipe.getMarca());
			stmt.setString(2, fipe.getModelo());
			stmt.setString(3, fipe.getAnoModelo());
			stmt.setDouble(4, fipe.getPrecoMedio());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
