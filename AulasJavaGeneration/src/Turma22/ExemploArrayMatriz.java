package Turma22;

import java.util.Scanner;

public class ExemploArrayMatriz {

	public static void main(String[] args) 
	{
		float[][] notas = new float[2][2];
		float somanotas=0, media, mediageral=0;
		int cont=0, linha, coluna;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0; linha<2; linha++)
		{
			for(coluna=0; coluna<2; coluna++)
			{
				System.out.print("Entre com a nota: ");
				notas[linha][coluna] = leia.nextFloat();
				
				somanotas += notas[linha][coluna];
				
				cont++;
			}
		}
		mediageral = somanotas / cont;
		
		System.out.printf("\nM�dia geral: %.2f", mediageral);
	}

}
