package ExerciciosIfElse;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner(System.in);
		
		double num, resultado;
		
		System.out.print("Digite um numero: ");
		num = leia.nextFloat();
		
		if(num % 2 == 0) {
			resultado = Math.sqrt(num);
			System.out.printf("\n" + num + " é numero par. Raiz = %2.2f", resultado);
		}
		else {
			resultado = Math.pow(num, 2);
			System.out.println("\n" + num + " é numero ímpar. Potência = " + resultado);
		}
	}

}