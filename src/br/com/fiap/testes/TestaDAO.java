package br.com.fiap.testes;

import java.sql.SQLException;
import java.text.ParseException;

import br.com.fiap.controller.VeiculoController;
import br.com.fiap.model.VeiculoModel;


public class TestaDAO {
	public static void main(String[] args) throws SQLException, ParseException {
		VeiculoModel v1= new VeiculoModel("123123123", "placa", "modelo", true, "1990", "fabricante", "combustivel",(byte)1, true, false, "pessoal",1, 50000, 44140484841L);
		VeiculoController vc = new VeiculoController();
		vc.cadastrarVeiculo(v1);

//		ApoliceController ac = new ApoliceController();
//		Veiculo carro = new Veiculo("AB12345", "placa", "kkkkk", true, "2005", "fabricante", "combustivel", (byte) 1,
//				true, false, "utilizacao");
//		VeiculoDAO DAO = new VeiculoDAO();
//		
//		DAO.insert(carro);
//		System.out.println(DAO.selectByChassis("AB12345").getNumeroChassi());
		// ac.sellectById(1);
////		DAO.update(carro);
//		
//		List<Veiculo> veiculos = DAO.selectAll();
//			for (Veiculo veiculo : veiculos) {
//				System.out.println(veiculo.getNumeroChassi());
//				System.out.println(veiculo.getPlaca());
//			}		
//		DAO.delete("AB12345");

//		Fipe fipe = new Fipe(1,12000,"MARCA","modelo","2015");
//		FipeDAO daoF = new FipeDAO();
//		
//		//daoF.insert(fipe);
//		//System.out.println(daoF.selectById(1).getAnoModelo());
////		List<Fipe> fipe1 = daoF.selectAll();
////		for (Fipe fipe2 : fipe1) {
////			System.out.println(fipe.getMarca());
////		}
//	daoF.delete(1);
//		DateUtils dt1 = new DateUtils();
//	     long cpf = 1234567890;
//	        Date dataNascimento = Date.valueOf("1990-08-09");
//	        String nome = "Fulano";
//	        String email = "fulano@example.com";
//	        String endereco = "Rua A, 123";
//	        String estadoCivil = "Solteiro";
//	        String genero = "Masculino";
//	        String celular = "99231239";
//	        int tempoHabilitacao = 5;
//////	        
//	        Cliente cliente = new Cliente(cpf, dataNascimento, nome, email, endereco, estadoCivil, genero, celular, tempoHabilitacao);
//	        ClienteDAO cd1 = new ClienteDAO();
////        cd1.insert(cliente);
//	        List <Cliente> clientes = cd1.selectAll();
//	        for (Cliente cliente2 : clientes) {
//				System.out.println(cliente2.getCpf());
//			}
//	        
//	       cd1.delete(cpf);

//		Apolice ap = new Apolice(1, Date.valueOf("1990-10-10"), 12321 );
//		ApoliceDAO  apDAO= new ApoliceDAO();
//		
////	apDAO.insert(ap);
////		System.out.println(apDAO.selectById(1));
//		apDAO.delete(1);
//		

//		Corretor c1 = new Corretor(1, "O corretas", "Rua do limoeiro");
//		CorretorDAO cDAO = new CorretorDAO();
////		cDAO.insert(c1);
//	System.out.println(cDAO.selectById(1));
//		cDAO.delete(1);

//		Especialidade espec1 = new Especialidade(1, "Carro");
//		EspecialidadeDAO esDAO = new EspecialidadeDAO();
//		esDAO.insert(espec1);
//		System.out.println(esDAO.selectById(1));
//		List<Especialidade> especialidades = esDAO.selectAll();
//		for (Especialidade especialidade : especialidades) {
//			System.out.println(especialidade.getCd_especialidade());
//		}
//		esDAO.delete(1);

//		Especialidade especialidade = new Especialidade(1, "Carro");
//		List<Cliente> cliente = esDAO.selectAll();
//		for (Especialidade especialidade : especialidades) {
//			System.out.println(especialidade.getCd_especialidade());
//		}
		double seila = 0.6595;// 0.40690000000000004;
		double carro = 25_000;
		System.out.println(seila * carro);
	}
}
