package ExerciciosArray;

public abstract class ExArray01 {

	public static void main(String[] args) 
	{
		
		int[] vetor = {1, 0, 5, -2, -5, 7};
		
		int cont, soma=0;
		
		System.out.print("Meu vetor inicial �: ");
		
		for(cont=0; cont<6; cont++)
		{
			System.out.print(vetor[cont]+ " ");
		}
		
		soma = vetor[0] + vetor[1] + vetor[5];
		System.out.println("\n\nA soma dos valores nas posi��es vetor[0], vetor[1], vetor[5] �: "+ soma);
		
		vetor[4] = 100;
		
		for(cont=0; cont<6; cont++)
		{
			System.out.print("\nPosi��o "+cont+ ": " +vetor[cont]+ " ");
		}
		
		
	}

}
