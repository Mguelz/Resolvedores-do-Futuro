package br.com.fiap.controller;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.model.Cliente;
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

	public void cadastrarCliente(Cliente cliente) {
		clienteDAO.insert(cliente);
	}

	public void atualizarCliente(Cliente cliente) {
		clienteDAO.update(cliente);
	}

	public void excluirCliente(long cpf) {
		clienteDAO.delete(cpf);
	}

	public List<Cliente> listarTodosClientes() {
		return clienteDAO.selectAll();
	}

	public Cliente buscarPorCPF(long cpf) {
		return clienteDAO.selectById(cpf);
	}
}
