package ExerciciosPoo;

public class Cliente {
	
	private String nomeCliente;
	private String emailCliente;
	private String codCliente;
	private String telCliente;
	
	
	public Cliente(String nomeCliente, String emailCliente, String codCliente, String telCliente)
	{
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.codCliente = codCliente;
		this.telCliente = telCliente;
	}

	
	public void escreva()
	{
		System.out.println("<<<Dados dos clientes>>>");
		System.out.println("Nome: "+nomeCliente+"\nE-mail: "+emailCliente+"\nC?digo do cliente: "+codCliente+"\nTelefone do cliente: "+telCliente+"\n");
		
	}
	

	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public String getEmailCliente() {
		return emailCliente;
	}


	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}


	public String getCodCliente() {
		return codCliente;
	}


	public void setCodCliente(String codCliente) {
		this.codCliente = codCliente;
	}


	public String getTelCliente() {
		return telCliente;
	}


	public void setTelCliente(String telCliente) {
		this.telCliente = telCliente;
	}
}
