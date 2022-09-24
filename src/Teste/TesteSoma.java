package teste;

import calculadora.Soma;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class TesteSoma {
	
	//Cenario de teste 1: Soma de dois valores
	
		@SuppressWarnings("deprecation")
		@Test
		public void TesteSoma() {
		Soma calc = new Soma();
		int soma = calc.adicao(10,20);
		
		Assert.assertEquals(30, soma);
		
		}
}
