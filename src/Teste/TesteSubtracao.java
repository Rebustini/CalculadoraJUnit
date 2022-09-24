package Teste;

import Calculadora.Subtracao;

public class TesteSubtracao {
	
	public static void main(String[] args) {
		
		//Cenario de teste 1: Subtracao de dois valores 
		
				Subtracao subtrair = new Subtracao();
				int Subtracao = subtrair.subtracao(40,20);
				System.out.println("Valor da Subtracao entre 40 e 20 é = " + Subtracao);
				
				//Cenario de teste 2: Subtracao de dois valores sendo um deles com o valor 0
				
				Subtracao = subtrair.subtracao(15,0);
				System.out.println("Valor da Subtracao entre 15 e 0 é = " + Subtracao);
				
				//Cenario de teste 3: Subtracao de dois valores 0
				
				Subtracao = subtrair.subtracao(0,0);
				System.out.println("Valor da Subtracao entre 0 e 0 é = " + Subtracao);
				
				//Cenario de teste 4: Subtracao de dois valores sendo um valor negativo
				
				Subtracao = subtrair.subtracao(-34,26);
				System.out.println("Valor da Subtracao entre -34 e 26 é = " + Subtracao);
				
				//Cenario de teste 5: Subtracao de dois valores negativos
				
				Subtracao = subtrair.subtracao(-52,-39);
				System.out.println("Valor da Subtracao entre -52 e -39 é = " + Subtracao);
				
				//Cenario de teste 6: Subtracao de dois valores sendo o primeiro menor que o segundo
				
				Subtracao = subtrair.subtracao(30,60);
				System.out.println("Valor da Subtracao entre 30 e 60 é = " + Subtracao);
	}

}
