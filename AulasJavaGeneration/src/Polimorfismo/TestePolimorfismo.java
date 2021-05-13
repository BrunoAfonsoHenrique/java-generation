package Polimorfismo;

public class TestePolimorfismo {

	public static void main(String[] args) 
	{
		PessoaFisica fisica = new PessoaFisica();
		fisica.setNome("Bruno");
		fisica.setCpf(22222222233L);
		
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("Cristiano");
		juridica.setCnpj(100010001234567L);
		
		Pessoa1[] pessoas = new Pessoa1[2];
		pessoas[0] = fisica;
		pessoas[1] = juridica;
		
		for(Pessoa1 cont: pessoas)
		{
			System.out.println(cont.getNome());
		}
			
	}

}
