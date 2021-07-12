package Decisão;

import java.util.Scanner;

//aça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar.
//Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.

public class Exercício4 {

	public static void main(String[] args) {
		int num;
		double resultado;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um número");
		num = leia.nextInt();
		
		if(num%2==0) {
			resultado = Math.sqrt(num);
			System.out.println("\nO numero "+ num + " é Par e a raiz quadrada dele é: "+resultado);
		}
		
		else
		{
				resultado = Math.pow(num,2);
				System.out.println("\nO numero" + num + " é Impar e elevado ao quadrado terá o resultado de: "+resultado);
				 
				
		}
		
		

		
	
		
	}

}
