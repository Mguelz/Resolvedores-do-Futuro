package br.com.fiap.testes;

import java.util.List;

import br.com.fiap.controller.EspecialidadeController;
import br.com.fiap.model.EspecialidadeModel;

public class EspecialidadeTeste {

	public static void main(String[] args) {
		EspecialidadeController especialidadeController = new EspecialidadeController();

        // TODO testar o cadastro de especialidade
//        EspecialidadeModel especialidade = new EspecialidadeModel();
//        especialidade.setNr_especialidade(1);
//        especialidade.setNm_especialidade("x");
//        especialidadeController.cadastrarEspecialidade(especialidade);
//        System.out.println("Especialidade cadastrada!");

        // Listar todas as especialidades
//        List<EspecialidadeModel> todasAsEspecialidades = especialidadeController.listarTodasEspecialidades();
//        System.out.println("Lista de especialidades:");
//        for (EspecialidadeModel e : todasAsEspecialidades) {
//            System.out.println("Codigo: " + e.getNr_codigo());
//            System.out.println("Nome: " + e.getNm_especialidade());
//            System.out.println();
//        }

        // Buscar especialidade por ID
//        int nrEspecialidade = 1;
//        EspecialidadeModel especialidadeEncontrada = especialidadeController.buscarEspecialidadePorId(nrEspecialidade);
//        if (especialidadeEncontrada != null) {
//            System.out.println("Especialidade encontrada:");
//            System.out.println("Codigo: " + especialidadeEncontrada.getNr_codigo());
//            System.out.println("Nome: " + especialidadeEncontrada.getNm_especialidade());
//            System.out.println();
//        }

        // TODO testar o update de especialidade
//        especialidade.setNm_especialidade("x");
//        especialidadeController.atualizarEspecialidade(especialidade);
//        System.out.println("Especialidade atualizada!");

        // TODO testar o delete de especialidade
//        especialidadeController.excluirEspecialidade(nrEspecialidade);
//        System.out.println("Especialidade excluída com sucesso!");

	}
}
