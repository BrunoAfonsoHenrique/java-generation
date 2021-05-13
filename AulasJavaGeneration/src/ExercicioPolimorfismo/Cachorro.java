package ExercicioPolimorfismo;

public class Cachorro extends Animais{
	
	public Cachorro() // Método Construtor
	{
		super("cachorro");
	}

	@Override // Sobrescrever o método da superclasse
	public void som(String som) 
	{	
		System.out.println("latido(Au-Au)");
	}	
}
