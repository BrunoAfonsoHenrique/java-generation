package ExerciciosRepeticao;

import java.util.Scanner;

public class ExDoWhile06 {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		int num, qtd = 0, soma = 0;
		float media;
		
		do
		{
			System.out.print("Digite um numero: ");
			num = leia.nextInt();
			
			if(num % 3 == 0 && num != 0)
			{
				soma += num;
				qtd++;
			}
		}
		while(num != 0);
		
		media = soma / qtd;
		
		System.out.printf("A m�dia dos n�meros multiplos de 3 �: %.2f", media);
	}

}
