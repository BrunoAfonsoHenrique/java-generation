package POO;

public class Pessoa {
	
	//Declara��o dos atributos da Classe
	private String primeiroNome;
	private String ultimoNome;
	private String nomesDoMeio;
	
	//cria��o do m�todo construtor (Tem que ter o mesmo nome que a Classe)
	public Pessoa (String primeiroNome, String nomesDoMeio, String ultimoNome)
	{
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.nomesDoMeio = nomesDoMeio;
	}
	
	//Criando um m�todo para juntar os tr�s nomes
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome+" "+ nomesDoMeio +" "+ultimoNome;
		return nomeCompleto;
	}
	
}
