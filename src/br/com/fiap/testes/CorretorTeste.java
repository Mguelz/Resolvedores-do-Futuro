package br.com.fiap.testes;

import java.util.List;

import br.com.fiap.controller.CorretorController;
import br.com.fiap.model.CorretorModel;
import br.com.fiap.model.EspecialidadeModel;

public class CorretorTeste {
	public static void main(String[] args) {
		CorretorController corretorController = new CorretorController();

//		 TODO testar o cadastro de corretor no banco
//		Corretor corretor1 = new Corretor();
//		corretor1.setId(x); // trocar o "x" pela id desejado
//		corretor1.setNome("Corretor x");
//		corretor1.setEndereco("Endereço x");
//		corretor1.setCelular("xxxxxxxxx");
//		
//		Especialidade especialidade1 = new Especialidade();
//		especialidade1.setCd_especialidade(x); // trocar o "x" pela especialidade
//		corretor1.setEspecialidade(especialidade1);
//		corretorController.cadastrarCorretor(corretor1);
//		
//		Corretor corretor2 = new Corretor();
//		corretor2.setId(x); // trocar o "x" pelo corretor correto
//		corretor2.setNome("Corretor x");
//		corretor2.setEndereco("Endereço x");
//		corretor2.setCelular("xxxxxxxxx");
//		
//		Especialidade especialidade2 = new Especialidade();
//		especialidade2.setCd_especialidade(x); // trocar o "x" pela especialidade
//		corretor2.setEspecialidade(especialidade2);
//		corretorController.cadastrarCorretor(corretor2);

		// Lista todos os corretores
		List<CorretorModel> todosOsCorretores = corretorController.listarCorretores();
		for (CorretorModel corretor : todosOsCorretores) {
			System.out.println("ID: " + corretor.getId() + " -- Nome: " + corretor.getNome());
		}

		// Lista o corretor pelo ID
		CorretorModel corretorPorId = corretorController.buscarCorretorPorId(1);
		System.out.println("Corretor encontrado: " + corretorPorId.getNome() + " --> ID: " + corretorPorId.getId());

		// TODO TESTAR o update do corretor
		corretorPorId.setNome("Corretor Atualizado");
		corretorPorId.setEndereco("Novo Endereço");
		corretorController.atualizarCorretor(corretorPorId);
		System.out.println("Corretor atualizado: " + corretorPorId);

		// TODO testar o delete de corretor
		corretorController.excluirCorretor(2);
		System.out.println("Corretor excluido!");

		// Testar novamente o método listarCorretores
		todosOsCorretores = corretorController.listarCorretores();
		System.out.println("Lista de corretores depois da exclusão:");
		for (CorretorModel corretor : todosOsCorretores) {
			System.out.println(corretor);
		}

	}
}
