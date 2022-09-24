package teste;

import calculadora.Multiplicacao;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class TesteMultiplicacao {
	
	//Cenario de teste 4: Multiplicação de dois valores
	
	@SuppressWarnings("deprecation")
	@Test
	public void TesteMultiplicação() {
	Multiplicacao mult = new Multiplicacao();
	int multiplicacao = mult.multiplicacao(2,5);
	
	Assert.assertEquals(10, multiplicacao);
	
	}

	
	
}
