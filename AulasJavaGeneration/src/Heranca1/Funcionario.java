package Heranca1;

public class Funcionario extends Pessoa{
	
	private String departamento;
	
	//Construtor
	
	public Funcionario(String nome, int matricula, String departamento)
	{
		super(nome, matricula);
		this.departamento = departamento;
	}

	// Métodos Getters e Setters
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
}
