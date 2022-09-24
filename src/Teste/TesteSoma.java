package Teste;

import Calculadora.Soma;

public class TesteSoma {
	
	public static void main(String[] args) {
	
	//Cenario de teste 1: Soma de dois valores  
	
			Soma somar = new Soma();
			int Soma = somar.adicao(10,20);
			System.out.println("Valor da Soma entre 10 e 20 é = " + Soma);
			
			//Cenario de teste 2: Soma de dois valores sendo um deles com o valor 0
			
			Soma = somar.adicao(5,0);
			System.out.println("Valor da Soma entre 5 e 0 é = " + Soma);
			
			//Cenario de teste 3: Soma de dois valores 0
			
			Soma = somar.adicao(0,0);
			System.out.println("Valor da Soma entre 0 e 0 é = " + Soma);
			
			//Cenario de teste 4: Soma de dois valores sendo um valor negativo
			
			Soma = somar.adicao(15,-9);
			System.out.println("Valor da Soma entre 15 e -9 é = " + Soma);
			
			//Cenario de teste 5: Soma de dois valores negativos
			
			Soma = somar.adicao(-25,-30);
			System.out.println("Valor da Soma entre -25 e -30 é = " + Soma);

	}
}
