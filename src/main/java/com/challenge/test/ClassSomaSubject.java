package com.challenge.test;

import java.math.BigDecimal;

import com.challenge.annotation.Somar;

public class ClassSomaSubject {

	@Somar
	private BigDecimal valor1;
	
	@Somar
	private BigDecimal valor2;
	
	@Somar
	private BigDecimal valor3;
	
	public ClassSomaSubject(BigDecimal valor1, BigDecimal valor2, BigDecimal valor3) {
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;
	}

}
