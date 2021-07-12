package Vetores_Matrizes;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		int[] numeros = new int[6];
		int somaPar = 0,qImpar = 0, x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x = 0; x < numeros.length; x++)
		{
			System.out.println("\nEntre com um número: ");
			numeros[x] = leia.nextInt();
			
			if(numeros[x] % 2 == 0)
			{
				somaPar += numeros[x];
			}
			else
			{
				qImpar++;
			}
		}
		
		for(x=0; x < numeros.length;x++)
		{
			if(numeros[x] % 2 == 0)
			{
				System.out.println("\n"+numeros[x]+ " é par");
			}
			else
			{
				System.out.println("\n"+numeros[x]+ " é ímpar");
			}
		}
		System.out.println("\nSomatório dos números pares é = "+somaPar);
		System.out.println("\nQuantidade de números impares é = "+qImpar);
	}

}


