package HerancaPolimorfismo;

public abstract class Telefone { // uso da palavra abstract
	
	private String tipo; // Declara??o do atributo tipo
	abstract public void disca(String numero); // Declara??o das classes abstratas
	abstract public void toca(int numToques); // Declara??o das classes abstratas
	
	public Telefone(String tipo) {
		this.tipo = tipo;
	}
	
	// M?todos Getters e Seters
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
