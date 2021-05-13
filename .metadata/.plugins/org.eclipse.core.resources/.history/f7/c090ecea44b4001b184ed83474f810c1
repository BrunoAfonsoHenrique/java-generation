package ExerciciosColections;

import java.util.ArrayList; // Para usar a conection
import java.util.Scanner; 

public class Exericios03 {

	public static void main(String[] args) 
	{
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList <String> estoque = new ArrayList(); // É criado a colection
		
		do
		{
			//Começo Menu de opções
			System.out.println("\n--------------------------------------------------");
			System.out.println("\n(1) Deseja adicionar produtos ao estoque?");
			System.out.println("\n(2) Deseja remover produtos do estoque?");
			System.out.println("\n(3) Atualizar produtos do estoque?");
			System.out.println("\n(4) Mostar todos os produtos do estoque?");
			System.out.println("\n(0) Deseja encerrar o programa?");
			System.out.print("\nDigite sua opção: ");
			op = leia.nextInt(); // Entrada de dados na variável op
			
			// Final do menu de opçoes
			
			//Verificando as opções mediante a escolha do usuário
			switch(op)
			{
			case 1:
				leia.nextLine(); // Lê uma String --> Nesse caso esta esvaziando o buffer de memória
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto); //Estou adicionando o produto digitado na Colection(lista) --> ADICIONAR
				break;
			case 2:
				leia.nextLine(); // Lê uma String --> Nesse caso esta esvaziando o buffer de memória
				System.out.print("\nQual elemento deseja remover? ");
				String produto1 = leia.nextLine(); // Em produto1 será colocado o elemento que se deseja remover
				if(estoque.contains(produto1)) // Se produto1 estiver contido em estoque(lista)
				{
					estoque.remove(produto1); // Retira o produto da lista(estoque) --> REMOVER
				}
				else // Se não estiver: Apresenta a mensagem abaixo
				{
					System.out.println("\nProduto não existe no meu estoque."); 
				}
				break;
			case 3: 
				leia.nextLine(); // Lê uma String --> Nesse caso esta esvaziando o buffer de memória
				System.out.print("\nDigite o produto que quer atualizar: ");
				String verifica = leia.nextLine(); // Declarada a variavel  verifica
				
				System.out.println("\nDigite o nome do produto que entrará no lugar de"+verifica);
				String novo = leia.nextLine(); // Declarada a variavel que armazenará o novo produto
				if(estoque.contains(verifica))  // Se estoque contém o produto digitado
				{
					estoque.remove(verifica); // --> Remove o produto --> REMOVER      --> ALTERAÇÃo
					estoque.add(novo); // --> Adiciona o novo produto --> ADICIONAR    --> ALTERAÇÃo
				}
				else
				{
					System.out.println("\nProduto não existe no meu estoque!!!");
				}
				break;
			case 4:
				System.out.println("\nMostrando os produtos do estoque...");
				System.out.println(estoque);
				break;
				default:
					System.out.println("\nFinalizou o programa !!!");
			}
		}while(op!=0);

	}

}
