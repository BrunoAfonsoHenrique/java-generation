package Heranca1;

public class Coordenador extends Pessoa{
	
	private String cursoCoordenado;
	
	public Coordenador(String nome, int matricula, String cursoCoordenado)
	{
		super(nome, matricula);
		this.cursoCoordenado = cursoCoordenado;
	}
	
	//M�todos Getters e Setters
	public String getCursoCoordenado() {
		return cursoCoordenado;
	}

	public void setCursoCoordenado(String cursoCoordenado) {
		this.cursoCoordenado = cursoCoordenado;
	}	
}
