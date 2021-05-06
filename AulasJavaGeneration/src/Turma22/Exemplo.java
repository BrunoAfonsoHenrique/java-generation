package Turma22;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) 
	{
		
		System.out.println("Media aritmetica\n");
		
		double nota1, nota2, nota3, media;
		
		Scanner leia =  new Scanner(System.in);
		
		System.out.print("Entre com a nota 1: ");
		//System.out.println();
		/* Comentário em
		 * mais de uma
		 * linha
		 */
		
		nota1 = leia.nextFloat();
		
		System.out.print("Entre com a nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.print("Entre com a nota 3: ");
		nota3 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("\nMédia aritmética: " + media);
		System.out.printf("\nMédia aritmética arredondada: %2.2f", media );
		
		// Potência e Raiz quadrada
		nota1 = Math.sqrt(nota2);
		nota2 = Math.pow(nota3, 3);
		nota3 = nota1 % nota2;
		
	}

}