package ExercicioPolimorfismo;

public class Cavalo extends Animais{
	
	public Cavalo()
	{
		super("cavalo");
	}

	@Override // Sobrescrever o m�todo da superclasse
	public void som(String som) 
	{	
		System.out.println("Relincho (uhuuuuuuu)");
	}
	
	
}
