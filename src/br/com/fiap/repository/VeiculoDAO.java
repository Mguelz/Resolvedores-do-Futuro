package br.com.fiap.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.connection.ConnectionFactory;
import br.com.fiap.model.VeiculoModel;

public class VeiculoDAO {
	private Connection conexao;

	public VeiculoDAO() throws SQLException {
		this.conexao = ConnectionFactory.conectar();
	}

	// Insert
	public void insert(VeiculoModel veiculo) {
		String sql = "insert into SGR_VEICULO(DS_CHASSI, DS_PLACA, "
				+ "NM_MODELO, BL_CARROZERO, DT_FABRICACAO, NM_FABRICANTE,NM_COMBUSTIVEL,"
				+ " NR_GARAGEM, BL_ISENCAO, BL_KITGAS, DS_UTILIZACAO,VL_PRECO, SGR_CLIENTE_NR_CPF, SGR_CLIENTE_NR_ID )"
				+ " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, veiculo.getNumeroChassi());
			stmt.setString(2, veiculo.getPlaca());
			stmt.setString(3, veiculo.getModelo());
			stmt.setBoolean(4, veiculo.getCarroZero());
			stmt.setString(5, veiculo.getDataFabricacao());
			stmt.setString(6, veiculo.getFabricante());
			stmt.setString(7, veiculo.getCombustivel());
			stmt.setByte(8, veiculo.getGaragem());
			stmt.setBoolean(9, veiculo.getIsencao());
			stmt.setBoolean(10, veiculo.getKitgas());
			stmt.setString(11, veiculo.getUtilizacao());
			stmt.setDouble(12, veiculo.getValorPreco());
			stmt.setLong(13, veiculo.getCpfCliente());
			stmt.setLong(14, veiculo.getIdCliente());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// SelectAll
	public List<VeiculoModel> selectAll() {
		List<VeiculoModel> veiculos = new ArrayList<VeiculoModel>();
		String sql = "select * from SGR_VEICULO order by DS_CHASSI";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				VeiculoModel veiculo = new VeiculoModel();
				veiculo.setNumeroChassi(rs.getString("DS_CHASSI"));
				veiculo.setPlaca(rs.getString("DS_PLACA"));
				veiculo.setModelo(rs.getString("NM_MODELO"));
				veiculo.setCarroZero(rs.getBoolean("BL_CARROZERO"));
				veiculo.setDataFabricacao(rs.getString("DT_FABRICACAO"));
				veiculo.setFabricante(rs.getString("NM_FABRICANTE"));
				veiculo.setCombustivel(rs.getString("NM_COMBUSTIVEL"));
				veiculo.setGaragem(rs.getByte("NR_GARAGEM"));
				veiculo.setIsencao(rs.getBoolean("BL_ISENCAO"));
				veiculo.setKitgas(rs.getBoolean("BL_KITGAS"));
				veiculo.setUtilizacao(rs.getString("DS_UTILIZACAO"));
				veiculo.setCpfCliente(rs.getLong("SGR_CLIENTE_NR_CPF"));
				veiculo.setIdCliente(rs.getLong("SGR_CLIENTE_NR_ID"));
				veiculo.setValorPreco(rs.getDouble("VL_PRECO"));

				veiculos.add(veiculo);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return veiculos;
	}

	// selectByChassi
	public VeiculoModel selectByChassi(String chassis) {
		VeiculoModel veiculo = null;
		String sql = "select * from SGR_VEICULO where DS_CHASSI= ?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, chassis);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				veiculo = new VeiculoModel();
				veiculo.setNumeroChassi(rs.getString("DS_CHASSI"));
				veiculo.setPlaca(rs.getString("DS_PLACA"));
				veiculo.setModelo(rs.getString("NM_MODELO"));
				veiculo.setCarroZero(rs.getBoolean("BL_CARROZERO"));
				veiculo.setDataFabricacao(rs.getString("DT_FABRICACAO"));
				veiculo.setFabricante(rs.getString("NM_FABRICANTE"));
				veiculo.setCombustivel(rs.getString("NM_COMBUSTIVEL"));
				veiculo.setGaragem(rs.getByte("NR_GARAGEM"));
				veiculo.setIsencao(rs.getBoolean("BL_ISENCAO"));
				veiculo.setKitgas(rs.getBoolean("BL_KITGAS"));
				veiculo.setUtilizacao(rs.getString("DS_UTILIZACAO"));
				veiculo.setValorPreco(rs.getDouble("VL_PRECO"));
				veiculo.setCpfCliente(rs.getLong("SGR_CLIENTE_NR_CPF"));
				veiculo.setIdCliente(rs.getLong("SGR_CLIENTE_NR_ID"));

			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return veiculo;
	}

	// delete
	public void delete(String chassis) {
		String sql = "delete from SGR_VEICULO where DS_CHASSI=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, chassis);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// update
	public void update(VeiculoModel veiculo) {
		String sql = "update SGR_VEICULO set DS_PLACA = ?, NM_MODELO = ?, BL_CARROZERO = ?, DT_FABRICACAO = ?,NM_FABRICANTE=?, NM_COMBUSTIVEL = ?, NR_GARAGEM = ?,BL_ISENCAO = ?, BL_KITGAS = ?, DS_UTILIZACAO = ?, SGR_CLIENTE_NR_CPF = ?, SGR_CLIENTE_NR_ID = ?, VL_PRECO = ? where DS_CHASSI = ?";
//		String sql = "update SGR_VEICULO set DS_PLACA = ?, DS_MODELO = ?, DT_FABRICACAO = ?,"
//				+ " DS_FABRICACANTE = ?, DS_COMBUSTIVEL = ?, NR_GARAGEM = ?, "
//				+ "BL_ISENCAO = ?, BL_KITGAS = ?, DS_UTILIZACAO = ?, VL_PRECO = ?, SGR_CLIENTE_NR_CPF = ?, SGR_CLIENTE_NR_ID = ?  where DS_CHASSI = ?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, veiculo.getPlaca());
			stmt.setString(2, veiculo.getModelo());
			stmt.setBoolean(3, veiculo.getCarroZero());
			stmt.setString(4, veiculo.getDataFabricacao());
			stmt.setString(5, veiculo.getFabricante());
			stmt.setString(6, veiculo.getCombustivel());
			stmt.setLong(7, veiculo.getGaragem());
			stmt.setBoolean(8, veiculo.getIsencao());
			stmt.setBoolean(9, veiculo.getKitgas());
			stmt.setString(10, veiculo.getUtilizacao());
			stmt.setLong(11, veiculo.getCpfCliente());
			stmt.setLong(12, veiculo.getIdCliente());
			stmt.setDouble(13, veiculo.getValorPreco());
			stmt.setString(14, veiculo.getNumeroChassi());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
