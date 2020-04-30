package com.challenge.desafio;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.challenge.annotation.Somar;
import com.challenge.annotation.Subtrair;
import com.challenge.interfaces.Calculavel;

public class CalculadorDeClasses implements Calculavel {
	
	@Override
	public BigDecimal somar(Object o) {
		return calculate(o, Somar.class);
	}

	@Override
	public BigDecimal subtrair(Object o) {
		return calculate(o, Subtrair.class);
	}

	@Override
	public BigDecimal totalizar(Object o) {
		return somar(o).subtract(subtrair(o));
	}
	
	private BigDecimal calculate(Object o, 
			Class<? extends Annotation> annotationClass) {
		Predicate<Field> isAnnotationPresent = f -> f.isAnnotationPresent(annotationClass);
		Predicate<Field> isAssignableToBigDecimal = f -> BigDecimal.class.isAssignableFrom(f.getType());
		
		return Stream.of(o.getClass().getDeclaredFields())
			.filter(isAnnotationPresent.and(isAssignableToBigDecimal))
			.map(f -> getValue(f, o))
			.reduce(BigDecimal.ZERO, BigDecimal::add);
	}
	
	private BigDecimal getValue(Field f, Object o) {
		try {
			f.setAccessible(true);
			return (BigDecimal) f.get(o);
		} catch (IllegalAccessException e) {
			return BigDecimal.ZERO;
		}
	}
}
