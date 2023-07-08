package br.com.fiap.controller;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.model.ClienteModel;
import br.com.fiap.repository.ClienteDAO;

public class ClienteController {
	private ClienteDAO clienteDAO;

	public ClienteController() {
		try {
			clienteDAO = new ClienteDAO();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void cadastrarCliente(ClienteModel cliente) {
		clienteDAO.insert(cliente);
	}

	public void atualizarCliente(ClienteModel cliente) {
		clienteDAO.update(cliente);
	}

	public void excluirCliente(long cpf) {
		clienteDAO.delete(cpf);
	}

	public List<ClienteModel> listarTodosClientes() {
		return clienteDAO.selectAll();
	}

	public ClienteModel buscarPorCPF(long cpf) {
		return clienteDAO.selectById(cpf);
	}
}
