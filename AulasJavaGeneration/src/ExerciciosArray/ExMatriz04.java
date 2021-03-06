package ExerciciosArray;

import java.util.Scanner;

public class ExMatriz04 {

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner(System.in);
		
		float[][] m1 = new float[2][2]; 
		float[][] m2 = new float[2][2];
		float[][] m3 = new float[2][2]; // Matriz extra para realizar a soma e subtra??o.
		
		int linha, coluna, op, constante;
		
		for(linha=0; linha<2; linha++)
		{
			for(coluna=0; coluna<2; coluna++)
			{
				System.out.print("Digite um valor na matriz M1(n?meros reais): ");
				m1[linha][coluna] = leia.nextFloat();
			}
		}		
		for(linha=0; linha<2; linha++)
		{
			for(coluna=0; coluna<2; coluna++)
			{
				System.out.print("Digite um valor na matriz M2(n?meros reais): ");
				m2[linha][coluna] = leia.nextFloat();
			}
		}	
		System.out.println("\n<<< Lista de op??es >>>");
		System.out.println("1 - Somar as duas matrizes.\n2 - Subtrair a primeira matriz da segunda(M1-M2).");
		System.out.println("3 - Adiconar uma constante as duas matrizes.\n4 - Imprimir as matrizes.");	
		System.out.print(">>>Digite a op??o escolhida: ");
		op = leia.nextInt();
		
		while(op<1 || op>4)
		{
			System.out.println("\nOp??o invalida :-(");
			
			System.out.println("\n<<< Lista de op??es >>>");
			System.out.println("1 - Somar as duas matrizes.\n2 - Subtrair a primeira matriz da segunda(M1-M2).");
			System.out.println("3 - Adiconar uma constante as duas matrizes.\n4 - Imprimir as matrizes.");	
			
			System.out.print(">>>Digite a op??o escolhida: ");
			op = leia.nextInt();
		}		
		if(op == 1)
		{
			for(linha=0; linha<2; linha++)
			{
				for(coluna=0; coluna<2; coluna++)
				{
					m3[linha][coluna] = m1[linha][coluna] + m2[linha][coluna];
				}
			}			
			System.out.println("\n\nSoma das matrizes M1 + M2");
			for(linha=0; linha<2; linha++)
			{
				System.out.print("\n");
				for(coluna=0; coluna<2; coluna++)
				{
					System.out.print("["+m3[linha][coluna]+"]");
				}	
			}
		}
		else if(op == 2)
		{
			for(linha=0; linha<2; linha++)
			{
				for(coluna=0; coluna<2; coluna++)
				{
					m3[linha][coluna] = m1[linha][coluna] - m2[linha][coluna];
				}
			}								
			System.out.println("\n\nSubtra??o das matrizes M1-M2");
			for(linha=0; linha<2; linha++)
			{
				System.out.print("\n");
				for(coluna=0; coluna<2; coluna++)
				{
					System.out.print("["+m3[linha][coluna]+"]");
				}	
			}
		
		}
		else if(op == 3)
		{
			System.out.print("Digite o valor da constante: ");
			constante = leia.nextInt();
			
			for(linha=0; linha<2; linha++)
			{
				for(coluna=0; coluna<2; coluna++)
				{
					m1[linha][coluna] += constante;
					m2[linha][coluna] += constante;
				}
			}		
			System.out.println("\nMatriz M1- Somado a constante "+constante+" a cada valor da matriz");
			for(linha=0; linha<2; linha++)
			{
				System.out.print("\n");
				for(coluna=0; coluna<2; coluna++)
				{
					System.out.print("["+m1[linha][coluna]+"]");
				}	
			}
			System.out.println("\nMatriz M2- Somado a constante "+constante+" a cada valor da matriz");
			for(linha=0; linha<2; linha++)
			{
				System.out.print("\n");
				for(coluna=0; coluna<2; coluna++)
				{
					System.out.print("["+m2[linha][coluna]+"]");
				}	
			}
				
		}
		else if(op == 4)
		{
			System.out.println("\nMatriz M1");
			for(linha=0; linha<2; linha++)
			{
				System.out.print("\n");
				for(coluna=0; coluna<2; coluna++)
				{
					System.out.print("["+m1[linha][coluna]+"]");
				}	
			}
			System.out.println("\n\nMatriz M2");
			for(linha=0; linha<2; linha++)
			{
				System.out.print("\n");
				for(coluna=0; coluna<2; coluna++)
				{
					System.out.print("["+m2[linha][coluna]+"]");
				}	
			}
		}
	}
}
