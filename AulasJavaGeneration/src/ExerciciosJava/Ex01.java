package ExerciciosJava;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args)
	{
		int anos, meses, dias, quantidadeDias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a idade em anos: ");
		anos = leia.nextInt();
		
		System.out.println("Digite a idade em meses: ");
		meses = leia.nextInt();
		
		System.out.println("Digite a idade em dias: ");
		dias = leia.nextInt();
		
		quantidadeDias = ((anos*365) + (meses * 30) + dias);
		
		System.out.println("Quantidade de dias vividos: " + quantidadeDias);


	}
}