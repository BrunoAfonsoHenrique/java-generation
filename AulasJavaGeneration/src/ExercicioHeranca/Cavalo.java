package ExercicioHeranca;

public class Cavalo extends Animal{
	
	private String correr;
	
	public Cavalo(String nome, int idade, String som, String correr)
	{
		super(nome, idade, som);
		this.correr = correr;
	}
	
	public void escreva()
	{
		System.out.println("\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nSom: "+getSom()+"\nLocomo��o: "+correr);
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

}
