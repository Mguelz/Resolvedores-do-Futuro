package br.com.fiap.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.connection.ConnectionFactory;
import br.com.fiap.model.Veiculo;

public class VeiculoDAO {
	private Connection conexao;
	public VeiculoDAO() throws SQLException {
		this.conexao = ConnectionFactory.conectar();
	}
	//Insert
	public void insert(Veiculo veiculo) {
		String sql = "insert into TB_SGR_VEICULO(DS_CHASSI, DS_PLACA, "
				+ "DS_MODELO, NR_CARRO_ZERO, DT_FABRICACAO, DS_FABRICACANTE, DS_COMBUSTIVEL,"
				+ " NR_GARAGEM, BL_ISENCAO, BL_KITGAS, DS_UTILIZACAO )"
				+ " values (?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1,veiculo.getNumeroChassi());
			stmt.setString(2, veiculo.getPlaca());
			stmt.setString(3, veiculo.getModelo());
			stmt.setBoolean(4, veiculo.getCarroZero());
			stmt.setString(5, veiculo.getDataFabricacao());
			stmt.setString(6, veiculo.getFabricante());
			stmt.setString(7, veiculo.getCombustivel());
			stmt.setByte(8,veiculo.getGaragem());
			stmt.setBoolean(9, veiculo.getIsencao());
			stmt.setBoolean(10, veiculo.getKitgas());
			stmt.setString(11, veiculo.getUtilizacao());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//SelectAll
	public List<Veiculo> selectAll() {
		List<Veiculo> veiculos = new ArrayList<Veiculo>();
		String sql = "select * from TB_SGR_VEICULO order by DS_CHASSI";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Veiculo veiculo = new Veiculo();
				veiculo.setNumeroChassi(rs.getString("DS_CHASSI"));
				veiculo.setPlaca(rs.getString("DS_PLACA"));
				veiculo.setModelo(rs.getString("DS_MODELO"));
				veiculo.setDataFabricacao(rs.getString("DT_FABRICACAO"));
				veiculo.setFabricante(rs.getString("DS_FABRICACANTE"));
				veiculo.setCombustivel(rs.getString("DS_COMBUSTIVEL"));
				veiculo.setGaragem(rs.getByte("NR_GARAGEM"));
				veiculo.setIsencao(rs.getBoolean("BL_ISENCAO"));
				veiculo.setKitgas(rs.getBoolean("BL_KITGAS"));
				veiculo.setUtilizacao(rs.getString("DS_UTILIZACAO"));
				
				veiculos.add(veiculo);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return veiculos;
	}
	//selectByChassis
	public Veiculo selectByChassis(String chassis) {
		Veiculo veiculo = null;
		String sql = "select * from TB_SGR_VEICULO where DS_CHASSI= ?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, chassis);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				veiculo = new Veiculo();
				veiculo.setNumeroChassi(rs.getString("DS_CHASSI"));
				veiculo.setPlaca(rs.getString("DS_PLACA"));
				veiculo.setModelo(rs.getString("DS_MODELO"));
				veiculo.setDataFabricacao(rs.getString("DT_FABRICACAO"));
				veiculo.setFabricante(rs.getString("DS_FABRICACANTE"));
				veiculo.setCombustivel(rs.getString("DS_COMBUSTIVEL"));
				veiculo.setGaragem(rs.getByte("NR_GARAGEM"));
				veiculo.setIsencao(rs.getBoolean("BL_ISENCAO"));
				veiculo.setKitgas(rs.getBoolean("BL_KITGAS"));
				veiculo.setUtilizacao(rs.getString("DS_UTILIZACAO"));
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return veiculo;
	}
	//delete
	public void delete(String chassis) {
		String sql = "delete from TB_SGR_VEICULO where DS_CHASSI=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, chassis);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//update
	public void update(Veiculo veiculo) {
		String sql = "update TB_SGR_VEICULO set DS_PLACA = ?, DS_MODELO = ?, DT_FABRICACAO = ?,"
				+ " DS_FABRICACANTE = ?, DS_COMBUSTIVEL = ?, NR_GARAGEM = ?, "
				+ "BL_ISENCAO = ?, BL_KITGAS = ?, DS_UTILIZACAO = ? where DS_CHASSI = ?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, veiculo.getPlaca());
			stmt.setString(2, veiculo.getModelo());
			stmt.setString(3, veiculo.getDataFabricacao());
			stmt.setString(4, veiculo.getFabricante());
			stmt.setString(5, veiculo.getCombustivel());
			stmt.setLong(6, veiculo.getGaragem());
			stmt.setBoolean(7, veiculo.getIsencao());
			stmt.setBoolean(8, veiculo.getKitgas());
			stmt.setString(9, veiculo.getUtilizacao());
			stmt.setString(10, veiculo.getNumeroChassi());
			

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
