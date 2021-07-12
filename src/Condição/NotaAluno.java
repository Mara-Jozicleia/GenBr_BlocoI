package Condição;

import java.util.Scanner;

public class NotaAluno {
	public static void main(String[]args) {
	float nota1, nota2, nota3, media, mediaPonderada;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\nDigite a nota 1: ");
	nota1 = leia.nextFloat();
	 
	System.out.println("\nDigite a nota 2: ");
	nota2 = leia.nextFloat();
	
	System.out.println("\nDigite a nota 3: ");
	nota3 = leia.nextFloat();
	 
	
	media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5));
    		mediaPonderada = media/10;
    		
    System.out.print("\nA media final desse Aluno é : "+mediaPonderada);


	}


}
