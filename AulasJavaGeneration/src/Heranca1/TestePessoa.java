package Heranca1;

public class TestePessoa {

	public static void main(String[] args) 
	{
		Pessoa bruno = new Pessoa("Bruno",555);
		Funcionario pedro = new Funcionario("Pedro",222,"TI");
		Pessoa maria = new Funcionario("Maria",888,"RH");
		Pessoa jose = new Coordenador("José",333,"CC");
		
		System.out.println(bruno.getMatricula());
		System.out.println(pedro.getDepartamento());
		System.out.println(maria.getMatricula());
		System.out.println(jose.getNome());

	}

}
