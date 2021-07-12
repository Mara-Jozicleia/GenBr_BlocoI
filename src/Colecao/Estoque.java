package Colecao;
	
	import java.util.ArrayList;
	import java.util.Scanner;

	public class Estoque {
		

		public static void main(String[] args) {
			
			int opcao;
			try (Scanner ler = new Scanner(System.in)) {
				ArrayList<String> estoque = new ArrayList<String>();
				
				do
				{
					System.out.println("\n\t\tDigite uma opção:");
					System.out.println("--------------------------------------------------------------");
					System.out.println("\n(1) Deseja adicionar produtos ao estoque?\n(2) Deseja remover um produto?"
							+ "\n(3) Atualizar produto\n(4) Mostrar todos os produtos do estoque"
							+ "\n(0) Encerrar programa!!!");
					
					opcao = ler.nextInt();
					
					switch(opcao)
					{
					
					case 1:
						ler.nextLine();
						System.out.println("\nDigite um produto para será adicionado ao estoque: ");
						String produto = ler.nextLine();
						estoque.add(produto);
						break;
						
					case 2:
						ler.nextLine();
						System.out.println("\nDigite um produto que deverá ser removido do estoque: ");
						String produto1 = ler.nextLine();
						if(estoque.contains(produto1))
						{
							estoque.remove(produto1);
						}
						else
						{
							System.out.println("\nEste Produto não existe no estoque!!!");
						}
						break;
					
					case 3:
						ler.nextLine();
						System.out.println("\nDigite o produto que deseja atualizar: ");
						String verifica = ler.nextLine();
						System.out.println("\nDigite o nome do produto que entrará no lugar de"+verifica+" : ");
						String novo = ler.nextLine();
						if(estoque.contains(verifica))
						{
							estoque.remove(verifica);
							estoque.add(novo);
							
						}
						else
						{
							System.out.println("\nEste Produto não existe no estoque!!!");
						}
						System.out.println(estoque);
						break;
					case 4:
						System.out.println("\nOs produtos do estoque são: ");
						System.out.println(estoque);
						break;
						default:
							System.out.println("\nFinalizou o programa!!!");
					}
				}
				while(opcao!=0);
			}
		}

	}