package Repeti��o;

import java.util.Scanner;

public class Exerc�cio02 {

	public static void main(String[] args) {
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

		Scanner sun = new Scanner(System.in);
		int num,somaPar = 0,somaImpar = 0;
		
		for (int x = 1; x<= 10; x++) {
			System.out.println("\nDigite um numero: ");
			num = sun.nextInt();
			
			if(num% 2 == 0) {
				somaPar++;
				
			}else {
				somaImpar++;
			}
		}
		System.out.printf("\nA quantidade de numeros pares: "+somaPar);
		System.out.printf("\nA quantidade de numeros impares: "+somaImpar);

			
			
		}
	}


