package Heran�a;

import java.util.Scanner;

public class TesteAnimais {

	public static void main(String[] args) {
		

				Scanner leia = new Scanner(System.in);
				
				int opcao;

				System.out.println("\nEscolha uma op��o: \n1 - Cachorro \n2 - Cavalo \n3 - Pregui�a ");
				opcao = leia.nextInt();
				
				if(opcao > 0 && opcao < 4) {
					
					switch (opcao) {
					
					case 1:
					Cachorro cachorro1 = new Cachorro("Rex","Labrador","Preto","Grande", 5 );
					
					
					cachorro1.imprimirInfo();
					
					cachorro1.latir();
					
					break;
					case 2:
								
						Cavalo cavalo1 = new Cavalo("Pangar�", "Mangalarga", "Marrom", "Grande",5);
						
						cavalo1.imprimirInfo();
						
						cavalo1.correr();
						
						break;
					case 3:
								
						Pregui�a silvestre = new Pregui�a("Margarida", "Femea", "Cinza", "Pequena", 3);
						
						silvestre.imprimirInfo();
						
						silvestre.dormir();
						
						break;
						
						default:
				
					}
					
				}else 
				{
					System.out.println("\nValor errado.");
				}

			
				
			}

}
