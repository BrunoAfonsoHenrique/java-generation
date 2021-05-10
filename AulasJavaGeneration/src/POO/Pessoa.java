package POO;

public class Pessoa {
	
	//Declaração dos atributos da Classe
	private String primeiroNome;
	private String ultimoNome;
	private String nomesDoMeio;
	
	//criação do método construtor (Tem que ter o mesmo nome que a Classe)
	public Pessoa (String primeiroNome, String nomesDoMeio, String ultimoNome)
	{
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.nomesDoMeio = nomesDoMeio;
	}
	
	//Criando um método para juntar os três nomes
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome+" "+ nomesDoMeio +" "+ultimoNome;
		return nomeCompleto;
	}
	
}
