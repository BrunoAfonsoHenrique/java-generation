package ExerciciosIfElse;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) 
	{
		int num, maiornumero = 0, cont, cont2;
		
		Scanner leia = new Scanner(System.in);
		
		cont2 = 1;
		for(cont = 0; cont < 3; cont++) {
			System.out.print("Digite o " + cont2 + "º número: ");
			num = leia.nextInt();
			
			if(maiornumero < num) {
				maiornumero = num;
			}
			cont2++;
		}
		
		System.out.print("\nMaior numero digitado: " + maiornumero);
				
	}

}