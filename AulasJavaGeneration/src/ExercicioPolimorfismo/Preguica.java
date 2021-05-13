package ExercicioPolimorfismo;

public class Preguica extends Animais{
	
	public Preguica()
	{
		super("preguiça");
	}

	@Override // Sobrescrever o método da superclasse
	public void som(String som) 
	{	
		System.out.println("grito(hihihih)");
	}
	
	
}
