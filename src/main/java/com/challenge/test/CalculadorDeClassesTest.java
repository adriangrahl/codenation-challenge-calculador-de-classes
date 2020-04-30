package com.challenge.test;

import java.math.BigDecimal;

import com.challenge.desafio.CalculadorDeClasses;

public class CalculadorDeClassesTest {
	
	public static void main(String[] args) {
		
		ClassSomaSubject somaSubject = new ClassSomaSubject(BigDecimal.valueOf(1), BigDecimal.valueOf(1), BigDecimal.valueOf(1));
		ClassSubtracaoSubject subtracaoSubject = new ClassSubtracaoSubject(BigDecimal.valueOf(1), BigDecimal.valueOf(1));
		ClassTotalizacaoSubject totalizacaoSubject = new ClassTotalizacaoSubject(BigDecimal.valueOf(1), BigDecimal.valueOf(1));
		
		CalculadorDeClasses test = new CalculadorDeClasses();
		
		BigDecimal resultadoSoma = test.somar(somaSubject);
		BigDecimal resultadoSubtracao = test.subtrair(subtracaoSubject);
		BigDecimal resultadoTotalizacao = test.totalizar(totalizacaoSubject);
		
		System.out.println(resultadoSoma);
		System.out.println(resultadoSubtracao);
		System.out.println(resultadoTotalizacao);
	}
	
}
