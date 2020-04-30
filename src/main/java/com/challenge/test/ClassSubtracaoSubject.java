package com.challenge.test;

import java.math.BigDecimal;

import com.challenge.annotation.Subtrair;

public class ClassSubtracaoSubject {

	@Subtrair
	public BigDecimal valor1;
	
	@Subtrair
	public BigDecimal valor2;
	
	public ClassSubtracaoSubject(BigDecimal valor1, BigDecimal valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

}
