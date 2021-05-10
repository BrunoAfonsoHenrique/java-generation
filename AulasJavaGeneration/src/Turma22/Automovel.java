package Turma22;

public class Automovel {
	
	//Declara��o dos atributos da Classe	
	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;
	
	//cria��o do m�todo construtor
	public Automovel(String nomeProprietario, String modelo, String placa, int ano)
	{
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
	}
	public Automovel(int ano)
	{
		this.ano = ano;
	}
	
	//Declara��o dos demais m�todos da classe
	
	public void imprimirInfo()
	{
		System.out.println(nomeProprietario+" possui um "+ modelo+" com placa "+ placa);
	}
	public String getNomeProprietario() {
		return nomeProprietario;
	}
	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}	
	
}
