package teste;

import calculadora.Subtracao;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class TesteSubtracao {
	
	//Cenario de teste 2: Subtração de dois valores 
	
		@SuppressWarnings("deprecation")
		@Test
		public void TesteSubtração() {
		Subtracao sub = new Subtracao();
		int subtracao = sub.subtracao(40,20);
		
		Assert.assertEquals(20, subtracao);
		
		}
	
	
}
