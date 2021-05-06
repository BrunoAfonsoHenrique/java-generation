package ExerciciosJava;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args)
	{
		int quantidadeDias, anos, meses, dias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a idade em dias de vida: ");
		quantidadeDias = leia.nextInt();

		anos = (quantidadeDias / 365);
		meses = (quantidadeDias % 365) / 30;
		dias = (quantidadeDias % 365) % 30;
		
		System.out.println("\nAno(s): "+ anos + "\nMês(s): "+ meses+ "\nDia(s): "+ dias);

	}
}