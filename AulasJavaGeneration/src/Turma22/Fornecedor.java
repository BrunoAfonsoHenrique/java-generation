package Turma22;

public class Fornecedor extends Pessoa {
	
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor(String nome,String endereco,String cpf, int telefone,int idade,double valorCredito,double valorDivida)
	{
		super(nome,endereco,cpf,telefone,idade);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		
	}
	
	public Fornecedor(String nome,String endereco,double valorDivida)
	{
		super(nome,endereco);
		this.valorDivida = valorDivida;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do empregado: "+getNome()+"\n"+"CPF: "+getCpf()
		+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()+"\n"+"Endere�o: "+getEndereco()
		+"\n"+"Valor monet�rio do total de artigos produzidos por "+getNome()+" : "+
		"\nValor cr�dito: "+valorCredito+"\nValor d�vida: "+valorDivida);
	}
	
	public void validarCpf()
	{
		if(getCpf().length()!=11)
		{
			System.out.println("\n--CPF Inv�lido!!!");
		}
		else
		{
			System.out.println("\n--CPF V�lido!!!");
		}
	}
	
	public void obterSaldo()
	{
		double diferencacd = valorCredito - valorDivida;
		System.out.println("\nO saldo referente ao fornecedor � igual a: "+diferencacd);
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}	
}
