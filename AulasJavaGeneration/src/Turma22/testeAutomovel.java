package Turma22;

public class testeAutomovel {

	public static void main(String[] args) 
	{
		//instanciando um objeto da classe Autom�vel
		
		Automovel auto1 = new Automovel("Bruno","ferrari","48B7596",2021);
		
		//Troca de mensagens Chamada ao m�todo imprimirInfo()
		
		auto1.imprimirInfo();		
		System.out.println("\n***Transferencia de propriet�rio ***");
		auto1.setNomeProprietario("Tokunbo");
		auto1.imprimirInfo();
		
		Automovel auto2 = new Automovel("Amanda","Defender","UDP4711",2018);
		auto2.imprimirInfo();
		
		System.out.println("\n***Mudan�a de Placa***");
		auto2.setPlaca("KRP2012");
		auto2.imprimirInfo();
		
	}

}
