package br.com.fiap.testes;

import java.sql.Date;
import java.util.List;

import br.com.fiap.controller.ClienteController;
import br.com.fiap.model.ClienteModel;

public class ClienteTeste {
	public static void main(String[] args) {
		ClienteController clienteController = new ClienteController();
//
//        // TODO testar cadastro de cliente
          ClienteModel cliente = new ClienteModel();
        // cliente.setCpf(34567890123L);
//        cliente.setNomeCliente("Roberto Tavares");
//        cliente.setCorretorId(1);
//        cliente.setDataNascimento(Date.valueOf("1963-08-09"));
//        cliente.setEmail("roberto17@gmail.com");
//        cliente.setEstado("São Paulo");
//        cliente.setEstadoCivil("casado");
//        cliente.setGenero("masculino");
//        cliente.setTempoHabilitacao(7);
//        cliente.setDependente(1);
//        cliente.setCelularCliente("(11)98040-2519");
//        cliente.setSenha("robertinho17");
//      //  clienteController.cadastrarCliente(cliente);
//        System.out.println("Cliente cadastrado!");

		// Listar todos os clientes
//  List<ClienteModel> clientes = clienteController.listarTodosClientes();
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

		// TODO testar update de cliente
          cliente.setCpf(56789012365L);
		cliente.setSenha("paodealho");
		cliente.setEstado("São Paulo");
		cliente.setCelularCliente("(11)99915-3386");
		 
		
		//cliente.setEmail("joao.santos@example.com");
		System.out.println("Cliente atualizado com sucesso!");
//
//        // TODO testar delete de cliente
//        clienteController.excluirCliente(cpf);
//        System.out.println("Cliente excluído com sucesso!");

	}
}
