package Excecao;

public abstract class Exececao1 {
	
	public static void main(String[] args)
	{
		String frase = null;
		String novaFrase = null;
		
		//try catch --> Encapsulamento de erro
		
		try
		{
			novaFrase = frase.toUpperCase();
		}
		catch(NullPointerException e)
		{
			//Tratameno da exce??o
			System.out.println("\nA frase incialest? nula, para solucionar o problema, foi lhe atribuido um valo default");
			
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		
		}
		System.out.println("\nFrase antiga: "+frase);
		System.out.println("\nFrase Nova: "+novaFrase);
	}

}
