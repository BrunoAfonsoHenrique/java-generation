package ExerciciosRepeticao;

import java.util.Scanner;

public class ExWhile04 {

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner(System.in);
		
		int cont = 1, idade, genero, temperamento;
		int totMulheresNervosas = 0, totHomensAgressivos = 0, totOutrosCalmo = 0, tot40 = 0;
		int totPessoasCalma = 0, qtdPessoasCalmas = 0;
		
		while(cont <= 150)
		{
			System.out.print("Digite sua idade: ");
			idade = leia.nextInt();
			
			System.out.printf("\n<<< Escolha de Genero >>>\n1-Feminino\n2-Maculino\n3-Outros");
			System.out.printf("\nDigite o Genero: ");
			genero = leia.nextInt();
			
			
			System.out.println("\n<<<Escolha o temperamento>>>\n1-Calma(a)\n2-Nervoso(a)\n3-Agressivo(a)");
			System.out.print("Digite o temperamento: ");
			temperamento = leia.nextInt();
			
			
			if(temperamento == 1) {
				qtdPessoasCalmas += 1;
			}
			
			if(genero == 1 && temperamento == 2)
			{
				totMulheresNervosas += 1;
			}
			
			if(genero == 2 && temperamento == 3)
			{
				totHomensAgressivos += 1;
			}
			
			if(genero == 3 && temperamento == 1)
			{
				totOutrosCalmo += 1;
			}
			
			if(idade > 40 && temperamento == 2)
			{
				tot40 += 1;
			}
			
			if(idade < 18 && temperamento == 1)
			{
				totPessoasCalma += 1;
			}
			
			cont++;
		}
		
		System.out.println("\nNúmero de pessoas calmas: "+ qtdPessoasCalmas);
		System.out.println("Número de mulheres nervosas: "+ totMulheresNervosas);
		System.out.println("Número de homens agressivos: "+ totHomensAgressivos);
		System.out.println("Número de pessoas nervosas com mais de 40 anos: "+ tot40);
		System.out.println("Número de pessoas calmas com menos de 18 anos: "+ totPessoasCalma);

	}

}
