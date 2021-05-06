package ExerciciosJava;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) 
	{
		
		int tempo, horas, min, seg;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o tempo em segundos: ");
		tempo = leia.nextInt();

		horas = tempo / 3600;
		min = (tempo % 3600) / 60;
		seg = (tempo % 3600) % 60;
		
		System.out.println(horas+ ":"+ min+ ":"+seg+"s");


	}

}
