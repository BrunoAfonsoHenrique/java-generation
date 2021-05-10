package POO;

public class testeCarro {

	public static void main(String[] args) 
	{
		Carro meuCarro = new Carro();
		
		meuCarro.cor = "Vermelho";
		meuCarro.modelo = "SUV";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		
		meuCarro.liga();
		
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual);
		meuCarro.pegaMarcha();
	}

}
