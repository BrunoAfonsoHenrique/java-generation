package ExerciciosRepeticao;

import java.util.Scanner;

public class ExDoWhile05 {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		int num, soma = 0;
		
		do
		{
			System.out.print("Digite um numero: ");
			num = leia.nextInt();
			
			soma += num;
			
		}
		while(num != 0);
		
		System.out.println("\nA Soma dos n?meros digitados ?: " + soma);

	}

}
