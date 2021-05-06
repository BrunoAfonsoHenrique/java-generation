package ExerciciosRepeticao;

import java.util.Scanner;

public class ExWhile03 {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		int idade, total21 = 0, total50 = 0;
		
		System.out.print("Digite a idade: ");
		idade = leia.nextInt();
		
		while(idade != -99)
		{			
			if(idade < 21) 
			{
				total21 += 1;
			}
			else if(idade > 50) {
				total50 += 1;
			}
			
			System.out.print("Digite a idade: ");
			idade = leia.nextInt();
		}
		System.out.println("\nTotal de pessoas com menos de 21 anos: " + total21);
		System.out.println("\nTotal de pessoas com mais de 50 anos: " + total50);
	}

}
