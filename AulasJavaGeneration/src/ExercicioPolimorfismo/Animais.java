package ExercicioPolimorfismo;

public abstract class Animais { // Declaraca��o da classe abstrata
	
	private String especie; // Declara��o do atributo da classe
	abstract public void som(String som); // Declara��o do m�todo abstrato
	
	public Animais(String som)
	{
		this.especie = especie; // Aqui � passadoo o animal para a especie
	}
	
	// M�todos get e set
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
}
