package ExercicioPolimorfismo;

public class Cachorro extends Animais{
	
	public Cachorro() // M�todo Construtor
	{
		super("cachorro");
	}

	@Override // Sobrescrever o m�todo da superclasse
	public void som(String som) 
	{	
		System.out.println("latido(Au-Au)");
	}	
}
