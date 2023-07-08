package br.com.fiap.controller;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.model.VeiculoModel;
import br.com.fiap.repository.VeiculoDAO;

public class VeiculoController {
    private VeiculoDAO veiculoDAO;

    public VeiculoController() {
        try {
            veiculoDAO = new VeiculoDAO();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void cadastrarVeiculo(VeiculoModel veiculo) {
        veiculoDAO.insert(veiculo);
    }

    public void atualizarVeiculo(VeiculoModel veiculo) {
        veiculoDAO.update(veiculo);
    }

    public void excluirVeiculo(String chassi) {
        veiculoDAO.delete(chassi);
    }

    public List<VeiculoModel> listarVeiculos() {
        return veiculoDAO.selectAll();
    }

    public VeiculoModel buscarVeiculoPorChassi(String chassi) {
        return veiculoDAO.selectByChassi(chassi);
    }
}