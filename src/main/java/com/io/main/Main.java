package com.io.main;

import java.math.BigDecimal;

import com.io.dominio.Dolar;
import com.io.dominio.Euro;
import com.io.dominio.LibraEsterlina;
import com.io.dominio.PesoArgentino;
import com.io.dominio.PesoChileno;
import com.io.dominio.Real;
import com.io.impl.ConversorImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	BigDecimal valor = new BigDecimal(1.00);
    	Euro euro = new Euro(valor);
    	Real real = new Real();
    	Dolar dolar = new Dolar();
    	LibraEsterlina lb = new LibraEsterlina();
    	PesoArgentino pa = new PesoArgentino();
    	PesoChileno pc = new PesoChileno();
    	ConversorImpl conversorImpl = new ConversorImpl();
    	
    	
//    	System.out.println("euro em reais : " + conversorImpl.converter(euro, real));
//    	System.out.println("euro em dolar : " + conversorImpl.converter(euro, dolar));
//    	System.out.println("euro em libras : " + conversorImpl.converter(euro, lb));
//    	System.out.println("euro em peso argentino : " + conversorImpl.converter(euro, pa));
//    	System.out.println("euro em peso chileno : " + conversorImpl.converter(euro, pc));
    	
    	String moeda1 = euro.getClass().toString();
    	String moeda2 = euro.getClass().toString();
    	
    	if(moeda1.equals(moeda2)) {
    		System.out.println("as moedas são iguais");
    	}else {
    		System.out.println("as moedas são diferentes");
    	}

	}

}
