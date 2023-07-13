package br.com.fiap.testes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.sql.Date;

import br.com.fiap.controller.ApoliceController;
import br.com.fiap.model.ApoliceModel;

public class ApoliceTeste {
	public static void main(String[] args) {
		double vlPremio = 2000;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
		LocalDateTime now = LocalDateTime.now();  
		long l = System.currentTimeMillis();
		Date dataEmissDate = new Date(l);
		System.out.println(dataEmissDate);
		ApoliceModel apmodel = new ApoliceModel((long)1,dataEmissDate,vlPremio, "STU987654321", 12345678901L,(byte)1);
		ApoliceController apc1 = new ApoliceController();
		System.out.println(apc1.buscarTodasApolices());

		System.out.println(apmodel.getDataEmissao());
	}
}
