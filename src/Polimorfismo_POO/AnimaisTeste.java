package Polimorfismo;

import java.util.Scanner;

public class AnimaisTeste {

	public static void main(String[] args) {


			Scanner leia = new Scanner(System.in);
			
			Cachorro cachorro = new Cachorro();
			Cavalo cavalo = new Cavalo();
			Pregui�a pregui�a = new Pregui�a();
			
			Animais animal = null;

			int opcao;
			

			System.out.println("\nEscolha uma op��o: \n1 - Cachorro \n2 - Cavalo \n3 - Pregui�a ");
			opcao = leia.nextInt();
			
			if(opcao > 0 && opcao < 4) {
				
				switch (opcao) {
				
				case 1:
				animal = cachorro;
				System.out.println("\nQual o nome do seu cachorro?");
				String nome = leia.next();
				System.out.println("\nQuantos anos seu cachorro tem?");
				int idade = leia.nextInt();
				System.out.println("\nRa�a: ");
			    String ra�a = leia.next();
				System.out.println("\nCor: ");
				String cor = leia.next();
				System.out.println("\nPorte: ");
				String porte = leia.next();
				System.out.println("\nQual o som que seu cachorro emite?");
				String som = leia.next();
				
				System.out.println ("===================================================");
				cachorro.Nome(nome);
				cachorro.Idade(idade);
				cachorro.Ra�a(ra�a);
				cachorro.Cor(cor);
				cachorro.Porte(porte);
				cachorro.Latir();
				break;
				
				
				case 2:
					animal = cavalo;
					System.out.println("\nQual o nome do seu cavalo?");
					String nome1 = leia.next();
					System.out.println("\nQuantos anos seu cavalo tem?");
					int idade1 = leia.nextInt();
					System.out.println("\nRa�a: ");
				    String ra�a1 = leia.next();
					System.out.println("\nCor: ");
					String cor1 = leia.next();
					System.out.println("\nPorte: ");
					String porte1 = leia.next();
					System.out.println("\nQual o som que seu cachorro emite?");
					String som1 = leia.next();
					System.out.println("======================================================");
					cavalo.Nome(nome1);
					cavalo.Idade(idade1);
					cachorro.Ra�a(ra�a1);
					cachorro.Cor(cor1);
					cachorro.Porte(porte1);
					cavalo.Som(som1);
					cavalo.correr();

					break;
				case 3:
					animal=pregui�a;
					System.out.println("\nQual o nome da sua pregui�a?");
					String nome2 = leia.next();
					System.out.println("\nQuantos anos sua pregui�a tem?");
					int idade2 = leia.nextInt();
					System.out.println("\nSexo: ");
				    String sexo2 = leia.next();
					System.out.println("\nCor: ");
					String cor2= leia.next();
					System.out.println("\nPorte: ");
					String porte2 = leia.next();
					System.out.println("\nQual o som que sua pregui�a emite?");
					String som2 = leia.next();
					System.out.println("=================================================================");
					pregui�a.Nome(nome2);
					pregui�a.Idade(idade2);
					pregui�a.Sexo(sexo2);
					pregui�a.Cor(cor2);
					pregui�a.Porte(porte2);
					pregui�a.Som(som2);
					pregui�a.subir();

					
					break;			
				
					
					default:
			
				}
				
			}else 
			{
				System.out.println("\nOp��o Inv�lida.");
			}

		
			
	}


}
	


