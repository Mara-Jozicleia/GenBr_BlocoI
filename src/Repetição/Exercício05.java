package Repetição;

import java.util.Scanner;

public class Exercício05 {
	//Crie um programa que leia um número do teclado até que encontre um número igual a zero.
	//No final, mostre a soma dos números digitados.(DO...WHILE)
	
	public static void main(String[] args) {
		int num, somanum=0;
		
		Scanner help = new Scanner(System.in);
		
		System.out.println("\nDigite um numero");
		num = help.nextInt();
		
		
		do {
			if(num!=0) {
				somanum+=num;
				
			}
			System.out.println("\nDigite outro numero ");
		    num = help.nextInt();
		    
		}while(num!=0);
		System.out.println("\nA soma dos numeros digitado é: " +somanum);
		
		
		}

	}


