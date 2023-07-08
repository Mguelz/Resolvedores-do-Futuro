package br.com.fiap.testes;

import java.sql.Date;
import java.util.List;

import br.com.fiap.controller.ClienteController;
import br.com.fiap.model.ClienteModel;

public class ClienteTeste {
	public static void main(String[] args) {
		ClienteController clienteController = new ClienteController();

        // TODO testar cadastro de cliente
//        ClienteModel cliente = new ClienteModel();
//        cliente.setCpf(xxxxxxxxx);
//        cliente.setNomeCliente("João da Silva");
//        cliente.setCorretorId(1);
//        cliente.setDataNascimento(Date.valueOf("xx/xx/xx"));
//        cliente.setEmail("xxxxx@gmail.com");
//        cliente.setEstadoCivil("x");
//        cliente.setGenero("x");
//        cliente.setTempoHabilitacao(x);
//        cliente.setDependente(x);
//        clienteController.cadastrarCliente(cliente);
//        System.out.println("Cliente cadastrado!");

        // Listar todos os clientes
//        List<ClienteModel> clientes = clienteController.listarTodosClientes();
//        System.out.println("Lista de clientes: CPF / NOME");
//        for (ClienteModel c : clientes) {
//            System.out.println("CPF: " + c.getCpf() + " --> Nome: " + c.getNomeCliente());
//        }

        // Buscar cliente por CPF
//        long cpf = 12345678901L; // o L é para o java reconhecer como um long
//        ClienteModel clienteEncontrado = clienteController.buscarPorCPF(cpf);
//        if (clienteEncontrado != null) {
//            System.out.print("Cliente encontrado: " + clienteEncontrado.getNomeCliente());
//        }

//        // TODO testar update de cliente
//        cliente.setNomeCliente("João da Silva Santos");
//        cliente.setEmail("joao.santos@example.com");
//        clienteController.atualizarCliente(cliente);
//        System.out.println("Cliente atualizado com sucesso!");
//
//        // TODO testar delete de cliente
//        clienteController.excluirCliente(cpf);
//        System.out.println("Cliente excluído com sucesso!");

    }
}
