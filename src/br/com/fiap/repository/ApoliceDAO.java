package br.com.fiap.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.connection.ConnectionFactory;
import br.com.fiap.model.Apolice;

public class ApoliceDAO {
	private Connection conexao;

	public ApoliceDAO() throws SQLException {
		this.conexao = ConnectionFactory.conectar();
	}

	// insert
	public void insert(Apolice apolice) {
		String sql = "insert into SGR_APOLICE (ID_APOLICE, DT_EMISSAO, VL_PREMIO, SGR_VEICULO_DS_CHASSI, SGR_VEICULO_SGR_CLIENTE_NR_CPF, SGR_VEICULO_SGR_CLIENTE_NR_ID ) values (?,?,?,?,?,?)";

		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			// complemento da query
			stmt.setLong(1, apolice.getIdApolice());
			stmt.setDate(2, apolice.getDataEmissao());
			stmt.setDouble(3, apolice.getValorPremio());
			stmt.setString(4, apolice.getChassi());
			stmt.setLong(5, apolice.getCpfCliente());
			stmt.setLong(5, apolice.getIdVeiculo());
			
			
			// executar a query
			stmt.execute();
			// fechar a operação
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// selectById

	public Apolice selectById(long idApolice) {
		Apolice apolice = null;
		String sql = "select * from TB_SGR_APOLICE where id_apolice=?";

		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, idApolice);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) { // enquanto tiver dados na tabela
				apolice = new Apolice();
				apolice.setIdApolice(rs.getLong("id_apolice"));
				apolice.setDataEmissao(rs.getDate("dt_emissao"));
				apolice.setValorPremio(rs.getDouble("vl_premio"));
				apolice.setCpfCliente(rs.getLong("SGR_VEICULO_SGR_CLIENTE_NR_CPF"));
				apolice.setIdVeiculo(rs.getLong("SGR_VEICULO_SGR_CLIENTE_NR_ID"));
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return apolice;

	}

	// update
	public void update(Apolice apolice) {
		String sql = "update TB_SGR_APOLICE set DT_EMISSAO=?, VL_PREMIO=?, SGR_VEICULO_SGR_CLIENTE_NR_CPF=?, SGR_VEICULO_SGR_CLIENTE_NR_ID=?  where id_apolice=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setDate(1, apolice.getDataEmissao());
			stmt.setDouble(2, apolice.getValorPremio());
			stmt.setLong(3, apolice.getCpfCliente());
			stmt.setLong(4, apolice.getIdVeiculo());
			stmt.setLong(5, apolice.getIdApolice());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	// delete

	public void delete(long IdApolice) {
		String sql = "delete from TB_SGR_APOLICE where id_apolice=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, IdApolice);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	public List<Apolice> selectAll() {
		List<Apolice> apolices = new ArrayList<Apolice>();
		String sql = "select * from sgr_apolice order by id_apolice";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Apolice apolice = new Apolice();
				apolice.setIdApolice(rs.getLong("id_apolice"));
				apolice.setDataEmissao(rs.getDate("dt_apolice"));
				apolice.setValorPremio(rs.getDouble("vl_seguro"));
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return apolices;

}
}//TODO NECESSÁRIO FAZER SELECT ALL