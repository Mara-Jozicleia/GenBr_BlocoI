package Decis�o;

import java.util.Scanner;

public class Exerc�cio3 {

	public static void main(String[] args) {
		int idade;
	
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQual � a sua Idade? ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("\nVoc� est� na fase Infantil ");
			
		}else if(idade>=15 && idade<=17) {
			System.out.println("\nOVoc� est� na fase Juvenil ");
			
		}else if(idade>=18 && idade<=25) {
			System.out.println("\nOVoc� est� na fase Adulta ");
			
		}

		else {
		System.out.println("\nVoc� est� na melhor FASE da sua VIDA !!!");
		}
	
	}

}
