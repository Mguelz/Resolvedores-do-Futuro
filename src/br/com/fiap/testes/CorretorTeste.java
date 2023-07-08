package br.com.fiap.testes;

import java.util.List;

import br.com.fiap.controller.CorretorController;
import br.com.fiap.model.CorretorModel;
import br.com.fiap.model.EspecialidadeModel;

public class CorretorTeste {
	public static void main(String[] args) {
		CorretorController corretorController = new CorretorController();

		// cadastro de corretor no banco
//		CorretorModel corretor1 = new CorretorModel();
//		corretor1.setId(11); // trocar o "x" pela id desejado
//		corretor1.setNome("Roberto A.");
//		corretor1.setEndereco("Acre");
//		corretor1.setCelular("(82) 1234-1234");
//		EspecialidadeModel especialidade1 = new EspecialidadeModel();
//		especialidade1.setNr_codigo(1); // trocar o "x" pela especialidade
//		corretor1.setEspecialidade(especialidade1);
//		corretorController.cadastrarCorretor(corretor1);
		
		// Lista todos os corretores
//		List<CorretorModel> todosOsCorretores = corretorController.listarCorretores();
//		for (CorretorModel corretor : todosOsCorretores) {
//			System.out.println("ID: " + corretor.getId() + " -- Nome: " + corretor.getNome());
//		}

		// Lista o corretor pelo ID
//		CorretorModel corretorPorId = corretorController.buscarCorretorPorId(1);
//		System.out.println("Corretor encontrado: " + corretorPorId.getNome() + " --> ID: " + corretorPorId.getId());
//
//		// update do corretor
//		corretorPorId.setCelular("(11)99090-9090");
//		corretorController.atualizarCorretor(corretorPorId);
//		System.out.println("Corretor atualizado: " + corretorPorId);

		// delete de corretor
//		corretorController.excluirCorretor(2);
//		System.out.println("Corretor excluido!");

		// Testar novamente o método listarCorretores
//		List<CorretorModel> todosOsCorretores = corretorController.listarCorretores();
//		todosOsCorretores = corretorController.listarCorretores();
//		System.out.println("Lista de corretores depois da exclusão:");
//		for (CorretorModel corretor : todosOsCorretores) {
//			System.out.println(corretor);
//		}

	}
}
