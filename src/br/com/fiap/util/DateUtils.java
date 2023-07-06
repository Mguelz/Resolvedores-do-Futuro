package br.com.fiap.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.sql.Date;  

public class DateUtils {
	public static void main(String[] args) throws Exception {
		String sDate1="31/12/1998";  
		Date date1= (Date) new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
		System.out.println(sDate1);
		
	}
	public Date converteData(String dataNasc) throws ParseException {
		java.util.Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataNasc);
		
	 return (Date) date;
	}	
}
