package Repeti��o;

import java.util.Scanner;

public class Exerc�cio03 {
//Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
//Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)

	public static void main(String[] args) {
		
		int idade, pessoa1=0, pessoa2=0;
		
		Scanner age = new Scanner(System.in);
		
		System.out.println("\nQual � a sua idade? ");
		idade = age.nextInt();
		
		
		while(idade != -99) {
			if(idade < 21) {
				pessoa1++;
				
			}else if(idade > 50) {
				pessoa2++;
				
			}
			System.out.println("\nQual � a sua idade? ");
			idade = age.nextInt();
		}
			
	
		System.out.println("\nO total de pessoas com"
				+ " menos de 21 anos �  "+pessoa1);
		System.out.println("\nO total de pessoas com"
				+ " mais de 50 anos �  "+pessoa2);

	}

}
