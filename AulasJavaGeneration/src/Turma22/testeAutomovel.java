package Turma22;

public class testeAutomovel {

	public static void main(String[] args) 
	{
		//instanciando um objeto da classe Automóvel
		
		Automovel auto1 = new Automovel("Bruno","ferrari","48B7596",2021);
		
		//Troca de mensagens Chamada ao método imprimirInfo()
		
		auto1.imprimirInfo();		
		System.out.println("\n***Transferencia de proprietário ***");
		auto1.setNomeProprietario("Tokunbo");
		auto1.imprimirInfo();
		
		Automovel auto2 = new Automovel("Amanda","Defender","UDP4711",2018);
		auto2.imprimirInfo();
		
		System.out.println("\n***Mudança de Placa***");
		auto2.setPlaca("KRP2012");
		auto2.imprimirInfo();
		
	}

}
