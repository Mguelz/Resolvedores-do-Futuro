package br.com.fiap.controller;

public class AnoDoCarro {

	public double taxaAnoDoCarro(String anoDoCarro) {

		if (anoDoCarro.equals("2000")) {
			return 0.23;
		} else if (anoDoCarro.equals("2001")) {
			return 0.22;
		} else if (anoDoCarro.equals("2002")) {
			return 0.21;
		} else if (anoDoCarro.equals("2003")) {
			return 0.20;
		} else if (anoDoCarro.equals("2004")) {
			return 0.19;
		} else if (anoDoCarro.equals("2005")) {
			return 0.18;
		} else if (anoDoCarro.equals("2006")) {
			return 0.17;
		} else if (anoDoCarro.equals("2007")) {
			return 0.16;
		} else if (anoDoCarro.equals("2008")) {
			return 0.15;
		} else if (anoDoCarro.equals("2009")) {
			return 0.14;
		} else if (anoDoCarro.equals("2010")) {
			return 0.13;
		} else if (anoDoCarro.equals("2011")) {
			return 0.12;
		} else if (anoDoCarro.equals("2012")) {
			return 0.11;
		} else if (anoDoCarro.equals("2013")) {
			return 0.10;
		} else if (anoDoCarro.equals("2014")) {
			return 0.9;
		} else if (anoDoCarro.equals("2015")) {
			return 0.8;
		} else if (anoDoCarro.equals("2016")) {
			return 0.7;
		} else if (anoDoCarro.equals("2017")) {
			return 0.6;
		} else if (anoDoCarro.equals("2018")) {
			return 0.5;
		} else if (anoDoCarro.equals("2019")) {
			return 0.4;
		} else if (anoDoCarro.equals("2020")) {
			return 0.3;
		} else if (anoDoCarro.equals("2021")) {
			return 0.2;
		} else if (anoDoCarro.equals("2022")) {
			return 0.1;
		} else if (anoDoCarro.equals("2023")) {
			return 0.01;
		} else {

			return 0;
		}
	}

}
