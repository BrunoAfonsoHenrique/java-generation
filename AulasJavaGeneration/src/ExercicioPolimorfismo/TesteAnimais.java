package ExercicioPolimorfismo;

public class TesteAnimais {

	public static void main(String[] args) {
		
		
		Cachorro dog = new Cachorro();
		Cavalo pocoto = new Cavalo();
		Preguica preg = new Preguica();
		
		Animais animais = null;
		
		int n = (int)(Math.random()*3.0);
		System.out.println("\n--> N?mero sorteado: "+n);
		
		switch(n)
		{
		case 0: animais = dog;break;
		case 1: animais = pocoto;break;
		case 2: animais = preg;break;
		default: System.out.println("Erro inesperado!!!");
		}
		
		if(animais!=null)
		{
			animais.som("barulho");
		}
	}

}
