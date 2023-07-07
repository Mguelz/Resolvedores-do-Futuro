package br.com.fiap.controller;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.model.Veiculo;
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

    public void cadastrarVeiculo(Veiculo veiculo) {
        veiculoDAO.insert(veiculo);
    }

    public void atualizarVeiculo(Veiculo veiculo) {
        veiculoDAO.update(veiculo);
    }

    public void excluirVeiculo(String chassi) {
        veiculoDAO.delete(chassi);
    }

    public List<Veiculo> listarVeiculos() {
        return veiculoDAO.selectAll();
    }

    public Veiculo buscarVeiculoPorChassi(String chassi) {
        return veiculoDAO.selectByChassis(chassi);
    }
}