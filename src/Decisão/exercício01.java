package Decis�o;
// 01 Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

import java.util.Scanner;

public class exerc�cio01 {

	public static void main(String[] args) {
		int num1, num2, num3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite quantos pontos teve o primeiro jogador");
		num1 = leia.nextInt();
		
		System.out.println("\nDigite quantos pontos teve o segundo jogador");
		num2 = leia.nextInt();
		
		System.out.println("\nDigite quantos pontos teve o terceiro jogador");
		num3 = leia.nextInt();
		
		
		
		if(num1>num2 & num1>num3) {
			
			System.out.println("\nO jogador numero 1 teve a maior pontua��o!!! ");
			
		}else if(num2>num3 & num2>num1) {
			
			System.out.println("\nO joagador numero 2 teve maior pontua��o!!! ");
			
		}else if(num3>num2 & num3>num1){
			System.out.println("\nO jogador numero 3 teve maior pontua��o!!! ");
			
		}else {
			
			System.out.println("\nExiste pontua��es iguais, precisa desempatar o jogo ");
			
			
		}
		
	

	}

}
