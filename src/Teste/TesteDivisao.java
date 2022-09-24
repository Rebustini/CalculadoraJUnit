package teste;

import calculadora.Divisao;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class TesteDivisao {
	
	//Cenario de teste 3: Divisão de dois valores
	
		@SuppressWarnings("deprecation")
		@Test
		public void TesteDivisão() {
		Divisao div = new Divisao();
		int dividsao = div.divisao(10,5);
		
		Assert.assertEquals(2, dividsao);
		
		}
	
	
}
