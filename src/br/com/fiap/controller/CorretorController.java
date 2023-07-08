package br.com.fiap.controller;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.model.Corretor;
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

	public void cadastrarCorretor(Corretor corretor) {
		corretorDAO.insert(corretor);
	}

	public void atualizarCorretor(Corretor corretor) {
		corretorDAO.update(corretor);
	}

	public void excluirCorretor(int id) {
		corretorDAO.delete(id);
	}

	public List<Corretor> listarCorretores() {
		return corretorDAO.selectAll();
	}

	public Corretor buscarCorretorPorId(int id) {
		return corretorDAO.selectById(id);
	}
}
