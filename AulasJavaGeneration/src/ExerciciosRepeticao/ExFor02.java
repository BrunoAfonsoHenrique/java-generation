package ExerciciosRepeticao;

import java.util.Scanner;

public class ExFor02 {

	public static void main(String[] args)
	{
		
		Scanner leia = new Scanner(System.in);
		
		int cont, num, qtdPar = 0, qtdImpar = 0;
		
		for(cont = 0; cont < 10; cont++)
		{
			System.out.print("Digite um n�mero: ");
			num = leia.nextInt();
			
			if(num % 2 == 0)
			{
				qtdPar += 1;
			}
			else {
				qtdImpar += 1;
			}
		}
		System.out.println("\nQuantidade de n�meros pares: " + qtdPar);
		System.out.println("\nQuantidade de n�meros impares: " + qtdImpar);
		
	}

}
