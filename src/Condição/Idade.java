package Condição;


import java.util.Scanner;

public class Idade {
	public static void main(String[]args) {
		int anos, meses, dias, tDias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite sua Idade: ");
		anos = leia.nextInt();
		
		System.out.println("\nQuantidade de mês: ");
		meses = leia.nextInt();
		
		System.out.println("\nQuantidade os dias: ");
		dias = leia.nextInt();
		
		tDias = anos * 365 + meses * 30 + dias;
		System.out.println("\nO total de dias é: "+tDias+" dias."); 

		
		
		
		
		
	}

}
