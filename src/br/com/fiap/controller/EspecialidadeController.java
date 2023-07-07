package br.com.fiap.controller;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.model.Especialidade;
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

	public void cadastrarEspecialidade(Especialidade especialidade) {
		especialidadeDAO.insert(especialidade);
	}

	public void atualizarEspecialidade(Especialidade especialidade) {
		especialidadeDAO.update(especialidade);
	}

	public void excluirEspecialidade(int cdEspecialidade) {
		especialidadeDAO.delete(cdEspecialidade);
	}

	public List<Especialidade> listarEspecialidades() {
		return especialidadeDAO.selectAll();
	}

	public Especialidade buscarEspecialidadePorId(int cdEspecialidade) {
		return especialidadeDAO.selectById(cdEspecialidade);
	}
}
