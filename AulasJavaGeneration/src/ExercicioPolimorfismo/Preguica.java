package ExercicioPolimorfismo;

public class Preguica extends Animais{
	
	public Preguica()
	{
		super("pregui�a");
	}

	@Override // Sobrescrever o m�todo da superclasse
	public void som(String som) 
	{	
		System.out.println("grito(hihihih)");
	}
	
	
}
