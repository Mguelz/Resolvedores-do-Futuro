package br.com.fiap.testes;

import java.util.List;

import br.com.fiap.controller.VeiculoController;
import br.com.fiap.model.VeiculoModel;

public class VeiculoTeste {
	public static void main(String[] args) {
		VeiculoController veiculoController = new VeiculoController();

		// TODO testar o cadastro de veiculo
//		VeiculoModel veiculo = new VeiculoModel();
//		veiculo.setNumeroChassi("ABC123XYZ");
//		veiculo.setPlaca("ABC1234");
//		veiculo.setModelo("Modelo X");
//		veiculo.setCarroZero(true);
//		veiculo.setDataFabricacao("2022-01-01");
//		veiculo.setFabricante("Fabricante A");
//		veiculo.setCombustivel("Gasolina");
//		veiculo.setGaragem((byte) 1);
//		veiculo.setIsencao(false);
//		veiculo.setKitgas(false);
//		veiculo.setUtilizacao("Particular");
//		veiculo.setValorPreco(50000.00);
//		veiculo.setCpfCliente(123456789);
//		veiculo.setIdCliente(1);
//		veiculoController.cadastrarVeiculo(veiculo);
//		System.out.println("Veiculo cadastrado!");

		// TODO (nao esta listando) Listar todos os veiculos
		List<VeiculoModel> veiculos = veiculoController.listarVeiculos();
		System.out.println("Lista de veiculos:");
		for (VeiculoModel x : veiculos) {
			System.out.println("Chassi: " + x.getNumeroChassi());
			System.out.println("Placa: " + x.getPlaca());
			System.out.println("Modelo: " + x.getModelo());
			System.out.println("Fabricante: " + x.getFabricante());
			System.out.println("Preço: " + x.getValorPreco());
			System.out.println("ID Cliente: " + x.getIdCliente());
			System.out.println();
		}

		// TODO (nao esta listando) listar por veiculo por chassi
//		String chassi = "ABC123XYZ";
//		VeiculoModel veiculoEncontrado = veiculoController.buscarVeiculoPorChassi(chassi);
//		if (veiculoEncontrado != null) {
//			System.out.println("Veículo encontrado:");
//			System.out.println("Placa: " + veiculoEncontrado.getPlaca());
//			System.out.println("Modelo: " + veiculoEncontrado.getModelo());
//			System.out.println("Fabricante: " + veiculoEncontrado.getFabricante());
//			System.out.println("Preço: " + veiculoEncontrado.getValorPreco());
//			System.out.println("ID Cliente: " + veiculoEncontrado.getIdCliente());
//			System.out.println();
//		}

		// TODO testar o update de veiculo
//		veiculo.setModelo("Modelo Y");
//		veiculoController.atualizarVeiculo(veiculo);
//		System.out.println("Veículo atualizado com sucesso!");

		// TODO testar o delete de veiculo
//		veiculoController.excluirVeiculo(chassi);
//		System.out.println("Veículo excluído!");

	}
}
