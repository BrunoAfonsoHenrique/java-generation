package ExerciciosArray;

import java.util.Scanner;

public class ExArray02 {

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner(System.in);
		
		int[] numeros = new int[6];
		int cont, somapar=0, qtdimpar=0;
		
		for(cont=0; cont<6; cont++)
		{
			System.out.print("Digite o numero: ");
			numeros[cont] = leia.nextInt();
			
		}
		
		System.out.print("\nNumeros pares: ");
		
		for(cont=0; cont<6; cont++)
		{
			if(numeros[cont] % 2 == 0)
			{	
				somapar += numeros[cont];
				System.out.print(numeros[cont] + " ");
			}	
		}
		
		System.out.print("\nNumeros �mpares: ");
		
		for(cont=0; cont<6; cont++)
		{
			if(numeros[cont] % 2 != 0)
			{	
				qtdimpar++;
				System.out.print(numeros[cont] + " ");
			}
			
		}
		
		System.out.print("\nSoma dos n�meros pares: " + somapar);
		System.out.print("\nQuantidade de n�meros �mpares digitados: " + qtdimpar);
		

	}

}
