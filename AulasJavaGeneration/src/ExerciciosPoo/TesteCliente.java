package ExerciciosPoo;

import Turma22.Automovel;

public class TesteCliente {

	public static void main(String[] args) 
	{
		
		Cliente cliente1 = new Cliente("Bruno", "bruno_afonso_henrique@outlook.com","12345","11 92222-2222");
		
		
		cliente1.escreva();

		Cliente cliente2 = new Cliente("Ana Paula","ana_paula@gmail.com","75689","11 95555-5555");
		cliente2.escreva();
		
		Cliente cliente3 = new Cliente("Leonardo","leo@gmail.com","89431","11 96666-6666\n");
		cliente3.escreva();
			
	}

}
