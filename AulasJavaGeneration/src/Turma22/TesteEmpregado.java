package Turma22;

public class TesteEmpregado {

	public static void main(String[] args) 
	{
		Empregado[] lista = new Empregado[3];
		
		lista[0] = new Empregado("Isadora", 3000);
		lista[1] = new Empregado("Gustavo", 4500);
		lista[2] = new Empregado("Amanda", 6000);
		
		for(Empregado roda: lista)
		{
			roda.Imprimir();
		}
		
		System.out.println("****************************");
		
		for(Empregado vai: lista)
		{
			vai.aumentarSalario(10);
			vai.Imprimir();
		}
		
		Empregado gerente = new Empregado("Bruno",12000);
		System.out.println("****************************");
		gerente.aumentarSalario(20);
		System.out.println("****************************");
		gerente.Imprimir();
	}

}
