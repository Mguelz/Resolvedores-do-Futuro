package br.com.fiap.controller;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.model.CorretorModel;
import br.com.fiap.repository.CorretorDAO;

public class CorretorController {
	private CorretorDAO corretorDAO;

	public CorretorController() {
		try {
			corretorDAO = new CorretorDAO();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void cadastrarCorretor(CorretorModel corretor) {
		corretorDAO.insert(corretor);
	}

	public void atualizarCorretor(CorretorModel corretor) {
		corretorDAO.update(corretor);
	}

	public void excluirCorretor(int id) {
		corretorDAO.delete(id);
	}

	public List<CorretorModel> listarCorretores() {
		return corretorDAO.selectAll();
	}

	public CorretorModel buscarCorretorPorId(int id) {
		return corretorDAO.selectById(id);
	}
}
