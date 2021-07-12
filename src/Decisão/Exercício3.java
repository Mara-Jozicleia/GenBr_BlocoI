package Decisão;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		int idade;
	
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQual é a sua Idade? ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("\nVocê está na fase Infantil ");
			
		}else if(idade>=15 && idade<=17) {
			System.out.println("\nOVocê está na fase Juvenil ");
			
		}else if(idade>=18 && idade<=25) {
			System.out.println("\nOVocê está na fase Adulta ");
			
		}

		else {
		System.out.println("\nVocê está na melhor FASE da sua VIDA !!!");
		}
	
	}

}
