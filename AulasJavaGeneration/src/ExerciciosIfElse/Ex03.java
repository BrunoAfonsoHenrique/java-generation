package ExerciciosIfElse;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite sua idade em anos: ");
		idade = leia.nextInt();
		
		if(idade < 10 || idade > 25) {
			System.out.print("Sem categoria!!!");
		}
		else if(idade >= 10 && idade <= 14) {
			System.out.println("Categoria: infantil");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Categoria: Juvenil");
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.println("Categoria: Adulto");
		}
		

	}

}
