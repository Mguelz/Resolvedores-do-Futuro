package br.com.fiap.controller;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.model.EspecialidadeModel;
import br.com.fiap.repository.EspecialidadeDAO;

public class EspecialidadeController {
	private EspecialidadeDAO especialidadeDAO;

	public EspecialidadeController() {
		try {
			especialidadeDAO = new EspecialidadeDAO();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void cadastrarEspecialidade(EspecialidadeModel especialidade) {
		especialidadeDAO.insert(especialidade);
	}

	public void atualizarEspecialidade(EspecialidadeModel especialidade) {
		especialidadeDAO.update(especialidade);
	}

	public void excluirEspecialidade(int nrEspecialidade) {
		especialidadeDAO.delete(nrEspecialidade);
	}

	public List<EspecialidadeModel> listarTodasEspecialidades() {
		return especialidadeDAO.selectAll();
	}

	public EspecialidadeModel buscarEspecialidadePorId(int nrEspecialidade) {
		return especialidadeDAO.selectById(nrEspecialidade);
	}
}
