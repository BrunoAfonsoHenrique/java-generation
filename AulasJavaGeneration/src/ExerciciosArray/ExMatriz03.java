package ExerciciosArray;

import java.util.Scanner;

public class ExMatriz03 {

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		int[][] valores = new int[3][3];
		
		int linha, coluna, val10=0;
		
		for(linha=0; linha<3; linha++)
		{
			for(coluna=0; coluna<3; coluna++)
			{
				System.out.print("Digite um numero na posição ["+linha+"]["+coluna+"]: ");
				valores[linha][coluna] = leia.nextInt();
			}
		}
		
		for(linha=0; linha<3; linha++)
		{
			for(coluna=0; coluna<3; coluna++)
			{
				if(valores[linha][coluna] > 10)
				{
					val10++;
				}
			}
		}
		
		System.out.println("A matriz possui "+ val10 +" valores maiores que o numero 10.");

	}

}
