package ExercicioHeranca;

public class TesteHerancaAnimal {

	public static void main(String[] args) 
	{
		Cachorro dog = new Cachorro("Doguinho",8,"latido","Corre");
		dog.escreva();
		
		Cavalo cavalo1 = new Cavalo("Ralf",12,"uhuu","corre");
		cavalo1.escreva();
		
		Preguica preguica1 = new Preguica("Preguiçosa",8,"hihihihi","Escala");
		preguica1.escreva();

	}

}
