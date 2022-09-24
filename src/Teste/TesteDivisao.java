package Teste;

import Calculadora.Divisao;

public class TesteDivisao {
	
	public static void main(String[] args) {
		
		//Cenario de teste 1: Divisão de dois valores
		
				Divisao dividir = new Divisao();
				int Divisao = dividir.divisao(10,5);
				System.out.println("Valor da Divisão entre 10 e 5 é = " + Divisao);
				
				//Cenario de teste 2: Divisão de dois valores sendo um deles com o valor 0
				
				//ERROR: Cenario de teste 2 ocorreu um erro devido a operação ter dividido um valor por zero, na matemática existe uma regra na qual é impossível dividir um número por zero.
				
				//SOLUÇÃO: Para que não haja problema ao rodar o programa, a solução seria uma mensagem de alerta impossibilitando a execução da operação. 
				
				Divisao = dividir.divisao(40,0);
				System.out.println("Valor da Divisão entre 40 e 0 é = " + Divisao);
				
				//Cenario de teste 3: Divisão de dois valores 0
				
				//ERROR: Cenario de teste 3 ocorreu um erro devido a operação ter dividido um valor por zero, na matemática existe uma regra na qual é impossível dividir um número por zero.
				
				//SOLUÇÃO: Para que não haja problema ao rodar o programa, a solução seria uma mensagem de alerta impossibilitando a execução da operação. 
				
				Divisao = dividir.divisao(0,0);
				System.out.println("Valor da Divisão entre 0 e 0 é = " + Divisao);
				
				//Cenario de teste 4: Divisão de dois valores sendo um valor negativo
				
				Divisao = dividir.divisao(45,-10);
				System.out.println("Valor da Divisão entre 45 e -10 é = " + Divisao);
				
				//Cenario de teste 5: Divisão de dois valores negativos
				
				Divisao = dividir.divisao(-12,-6);
				System.out.println("Valor da Divisão entre -12 e -6 é = " + Divisao);
	}
}
