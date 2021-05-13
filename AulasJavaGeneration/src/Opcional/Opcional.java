package Opcional;

import java.util.Optional;

public class Opcional {

	public static void main(String[] args) 
	{
		Optional <String> linguagem = Optional.of("Bruno");
		String respostaPreenchida = "SIM";
		String respostaNula = null;
		
		System.out.println("\nOptional não vazio: "+linguagem);
		System.out.println("\nOptionl não vazio: Obtem valor"+linguagem.get());
		
		System.out.println("\nOptional vazio: "+Optional.empty());
		
		System.out.println("\nChamada de método ofNullable() em optional não vazio" +Optional.ofNullable(respostaPreenchida));
		
		System.out.println("\nChamada de método ofNullable() em optional vazio" +Optional.ofNullable(respostaNula));
	}

}
