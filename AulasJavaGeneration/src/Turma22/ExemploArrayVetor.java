package Turma22;

import java.util.Scanner;

public class ExemploArrayVetor {

	public static void main(String[] args) 
	{
		int[] numeros = new int[5];
		int somapar = 0, quantimpar = 0, cont;
		
		Scanner leia = new Scanner(System.in);
		
		for(cont=0; cont<5; cont++)
		{
			System.out.print("Entre com um n�mero: ");
			numeros[cont] = leia.nextInt();
			
			if(numeros[cont] % 2 == 0)
			{
				somapar += numeros[cont];
			}
			else
			{
				quantimpar++;
			}
		}
		
		for(cont=0; cont<5; cont++)
		{
			if(numeros[cont] % 2 == 0)
			{
				System.out.println("\nN�mero par: " + numeros[cont]);
			}
			else
			{
				System.out.println("\nN�mero �mpar: " + numeros[cont]);
			}
		}
		System.out.println("\n>>>Somat�rio dos pares: " + somapar);
		System.out.println("\n>>>Quantidade de �mpares: " + quantimpar);
	}

}
