package Turma22;

import java.util.Scanner;

public class Decisao2 {

	public static void main(String[] args) 
	{

		float num1, num2, resultado = 0;
		int op;
		
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero: ");
		num1 = ler.nextFloat();
		
		System.out.println("Entre com o segundo n�mero: ");
		num2 = ler.nextFloat();
		
		System.out.println("\n\tMENU DE OP��ES");
		
		System.out.println("\n1-Soma\n2-Subtra��o\n3-Multiplica��o\n4-Divis�o");
		
		System.out.println("\nDigite sua op��o: ");
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
				System.out.println("\nResultado inv�lido");
		}
		
		System.out.println("\nResultado: " + resultado);
	}

}
