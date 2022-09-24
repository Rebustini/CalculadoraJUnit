package Teste;

import Calculadora.Multiplicacao;

public class TesteMultiplicacao {
	
	public static void main(String[] args) {
		
		//Cenario de teste 1: Multiplicacao de dois valores
		
				Multiplicacao multiplicar = new Multiplicacao();
				int Multiplicacao = multiplicar.multiplicacao(2,5);
				System.out.println("Valor da Multiplicacao entre 2 e 5 é = " + Multiplicacao);
				
				//Cenario de teste 2: Multiplicacao de dois valores sendo um deles com o valor 0
				
				Multiplicacao = multiplicar.multiplicacao(12,0);
				System.out.println("Valor da Multiplicacao entre 12 e 0 é = " + Multiplicacao);
				
				//Cenario de teste 3: Multiplicacao de dois valores 0
				
				Multiplicacao = multiplicar.multiplicacao(0,0);
				System.out.println("Valor da Multiplicacao entre 0 e 0 é = " + Multiplicacao);
				
				//Cenario de teste 4: Multiplicacao de dois valores sendo um valor negativo
				
				Multiplicacao = multiplicar.multiplicacao(39,-6);
				System.out.println("Valor da Multiplicacao entre 39 e -6 é = " + Multiplicacao);
				
				//Cenario de teste 5: Multiplicacao de dois valores negativos
				
				Multiplicacao = multiplicar.multiplicacao(-44,-75);
				System.out.println("Valor da Multiplicacao entre -44 e -75 é = " + Multiplicacao);
	}

}
