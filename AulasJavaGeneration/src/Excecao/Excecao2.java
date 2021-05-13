package Excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao2 {
	
	//demonstra lançamento de uma exceção quando ocorre uma divisao or Zero
	
	private static final Object InputMismatchException = null;

	public static int quociente(int numerador, int denominador) throws ArithmeticException
	{
		return numerador / denominador; // possibilita a divisão por zero
	}

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
	
		boolean continueLoop = true;
	
		do
		{
			try
			{
				//lê dois numeros e calcula o quociente
				System.out.println("\nEntre com o numerador: ");
				int numerador = leia.nextInt();
				
				System.out.println("\nEntre com o denominador: ");
				int denominador = leia.nextInt();
				
				int result = quociente(numerador,denominador);
				System.out.printf("\nResultado: %d / %d = %d",numerador, denominador, result);
				continueLoop = false;
			}
			catch(InputMismatchException inputMismatchException)
			{
				System.out.printf("\nException: %s\n",InputMismatchException);
				leia.nextLine();
				System.out.println("\nVocê deve entrar com um valor do tipo inteiro. Por favor, tente novamente :-(");
			}
			
			catch(ArithmeticException arithmeticException)
			{
				System.err.printf("\nException: %s\n", arithmeticException);
				System.out.println("\nZero é um denominador inválido. Por favor, tente novamente :-(");
			}
			
		}
		while(continueLoop);
	}
}
