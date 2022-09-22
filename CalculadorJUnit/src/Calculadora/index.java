package Calculadora;

public class index {
	
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
		
		System.out.println("--------------------------------------------------------------------------------------");
		
		//Cenario de teste 1: Subtração de dois valores 
		
		Subtração subtrair = new Subtração();
		int Subtração = subtrair.subtracao(40,20);
		System.out.println("Valor da Subtração entre 40 e 20 é = " + Subtração);
		
		//Cenario de teste 2: Subtração de dois valores sendo um deles com o valor 0
		
		Subtração = subtrair.subtracao(15,0);
		System.out.println("Valor da Subtração entre 15 e 0 é = " + Subtração);
		
		//Cenario de teste 3: Subtração de dois valores 0
		
		Subtração = subtrair.subtracao(0,0);
		System.out.println("Valor da Subtração entre 0 e 0 é = " + Subtração);
		
		//Cenario de teste 4: Subtração de dois valores sendo um valor negativo
		
		Subtração = subtrair.subtracao(-34,26);
		System.out.println("Valor da Subtração entre -34 e 26 é = " + Subtração);
		
		//Cenario de teste 5: Subtração de dois valores negativos
		
		Subtração = subtrair.subtracao(-52,-39);
		System.out.println("Valor da Subtração entre -52 e -39 é = " + Subtração);
		
		//Cenario de teste 6: Subtração de dois valores sendo o primeiro menor que o segundo
		
		Subtração = subtrair.subtracao(30,60);
		System.out.println("Valor da Subtração entre 30 e 60 é = " + Subtração);
		
		System.out.println("--------------------------------------------------------------------------------------");
		
		//Cenario de teste 1: Multiplicação de dois valores
		
		Multiplicação multiplicar = new Multiplicação();
		int Multiplicação = multiplicar.multiplicacao(2,5);
		System.out.println("Valor da Multiplicação entre 2 e 5 é = " + Multiplicação);
		
		//Cenario de teste 2: Multiplicação de dois valores sendo um deles com o valor 0
		
		Multiplicação = multiplicar.multiplicacao(12,0);
		System.out.println("Valor da Multiplicação entre 12 e 0 é = " + Multiplicação);
		
		//Cenario de teste 3: Multiplicação de dois valores 0
		
		Multiplicação = multiplicar.multiplicacao(0,0);
		System.out.println("Valor da Multiplicação entre 0 e 0 é = " + Multiplicação);
		
		//Cenario de teste 4: Multiplicação de dois valores sendo um valor negativo
		
		Multiplicação = multiplicar.multiplicacao(39,-6);
		System.out.println("Valor da Multiplicação entre 39 e -6 é = " + Multiplicação);
		
		//Cenario de teste 5: Multiplicação de dois valores negativos
		
		Multiplicação = multiplicar.multiplicacao(-44,-75);
		System.out.println("Valor da Multiplicação entre -44 e -75 é = " + Multiplicação);
		
		System.out.println("--------------------------------------------------------------------------------------");
		
		//Cenario de teste 1: Divisão de dois valores
		
		Divisão dividir = new Divisão();
		int Divisão = dividir.divisao(10,5);
		System.out.println("Valor da Divisão entre 10 e 5 é = " + Divisão);
		
		//Cenario de teste 2: Divisão de dois valores sendo um deles com o valor 0
		
		//ERROR: Cenario de teste 2 ocorreu um erro devido a operação ter dividido um valor por zero, na matemática existe uma regra na qual é impossível dividir um número por zero.
		
		//SOLUÇÃO: Para que não haja problema ao rodar o programa, a solução seria uma mensagem de alerta impossibilitando a execução da operação. 
		
		Divisão = dividir.divisao(40,0);
		System.out.println("Valor da Divisão entre 40 e 0 é = " + Divisão);
		
		//Cenario de teste 3: Divisão de dois valores 0
		
		//ERROR: Cenario de teste 3 ocorreu um erro devido a operação ter dividido um valor por zero, na matemática existe uma regra na qual é impossível dividir um número por zero.
		
		//SOLUÇÃO: Para que não haja problema ao rodar o programa, a solução seria uma mensagem de alerta impossibilitando a execução da operação. 
		
		Divisão = dividir.divisao(0,0);
		System.out.println("Valor da Divisão entre 0 e 0 é = " + Divisão);
		
		//Cenario de teste 4: Divisão de dois valores sendo um valor negativo
		
		Divisão = dividir.divisao(45,-10);
		System.out.println("Valor da Divisão entre 45 e -10 é = " + Divisão);
		
		//Cenario de teste 5: Divisão de dois valores negativos
		
		Divisão = dividir.divisao(-12,-6);
		System.out.println("Valor da Divisão entre -12 e -6 é = " + Divisão);
	}

}
