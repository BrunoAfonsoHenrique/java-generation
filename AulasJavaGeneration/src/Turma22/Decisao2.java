package Turma22;

import java.util.Scanner;

public class Decisao2 {

	public static void main(String[] args) 
	{

		float num1, num2, resultado = 0;
		int op;
		
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		num1 = ler.nextFloat();
		
		System.out.println("Entre com o segundo número: ");
		num2 = ler.nextFloat();
		
		System.out.println("\n\tMENU DE OPÇÕES");
		
		System.out.println("\n1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão");
		
		System.out.println("\nDigite sua opção: ");
		op = ler.nextInt();
		
		switch(op)
		{
		case 1:
			resultado = num1 + num2;
			break;
		case 2:
			resultado = num1 - num2;
			break;
		case 3:
			resultado = num1 * num2;
			break;
		case 4:
			resultado = num1 / num2;
			break;
			default:
				System.out.println("\nResultado inválido");
		}
		
		System.out.println("\nResultado: " + resultado);
	}

}
