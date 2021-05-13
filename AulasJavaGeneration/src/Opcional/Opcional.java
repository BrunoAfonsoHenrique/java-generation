package Opcional;

import java.util.Optional;

public class Opcional {

	public static void main(String[] args) 
	{
		Optional <String> linguagem = Optional.of("Bruno");
		String respostaPreenchida = "SIM";
		String respostaNula = null;
		
		System.out.println("\nOptional n�o vazio: "+linguagem);
		System.out.println("\nOptionl n�o vazio: Obtem valor"+linguagem.get());
		
		System.out.println("\nOptional vazio: "+Optional.empty());
		
		System.out.println("\nChamada de m�todo ofNullable() em optional n�o vazio" +Optional.ofNullable(respostaPreenchida));
		
		System.out.println("\nChamada de m�todo ofNullable() em optional vazio" +Optional.ofNullable(respostaNula));
	}

}
