package br.com.fiap.controller;

public class AnoDoCarro {

	public double aplicaTaxaAnoDoCarro(String anoDoCarro) {

		if (anoDoCarro.equals("2000")) {
			return 0.023;
		} else if (anoDoCarro.equals("2001")) {
			return 0.022;
		} else if (anoDoCarro.equals("2002")) {
			return 0.021;
		} else if (anoDoCarro.equals("2003")) {
			return 0.020;
		} else if (anoDoCarro.equals("2004")) {
			return 0.019;
		} else if (anoDoCarro.equals("2005")) {
			return 0.018;
		} else if (anoDoCarro.equals("2006")) {
			return 0.017;
		} else if (anoDoCarro.equals("2007")) {
			return 0.016;
		} else if (anoDoCarro.equals("2008")) {
			return 0.015;
		} else if (anoDoCarro.equals("2009")) {
			return 0.014;
		} else if (anoDoCarro.equals("2010")) {
			return 0.013;
		} else if (anoDoCarro.equals("2011")) {
			return 0.012;
		} else if (anoDoCarro.equals("2012")) {
			return 0.011;
		} else if (anoDoCarro.equals("2013")) {
			return 0.010;
		} else if (anoDoCarro.equals("2014")) {
			return 0.09;
		} else if (anoDoCarro.equals("2015")) {
			return 0.08;
		} else if (anoDoCarro.equals("2016")) {
			return 0.07;
		} else if (anoDoCarro.equals("2017")) {
			return 0.06;
		} else if (anoDoCarro.equals("2018")) {
			return 0.05;
		} else if (anoDoCarro.equals("2019")) {
			return 0.04;
		} else if (anoDoCarro.equals("2020")) {
			return 0.03;
		} else if (anoDoCarro.equals("2021")) {
			return 0.02;
		} else if (anoDoCarro.equals("2022")) {
			return 0.01;
		} else if (anoDoCarro.equals("2023")) {
			return 0.01;
		} else {
			return 0.0;
		}
	}

}
