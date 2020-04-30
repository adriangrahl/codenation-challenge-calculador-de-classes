package com.challenge.test;

import java.math.BigDecimal;

import com.challenge.annotation.Somar;
import com.challenge.annotation.Subtrair;

public class ClassTotalizacaoSubject {

	@Somar
	public BigDecimal valor1;
	
	@Subtrair
	public BigDecimal valor2;
	
	public ClassTotalizacaoSubject(BigDecimal valor1, BigDecimal valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

}
