package Condição;

import java.util.Scanner;

public class NovoCusto {

	public static void main(String[] args) {
		float  custoConsumidor;
		float custoFabrica;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("\nQual o custo de fábrica? ");
 		custoFabrica = leia.nextFloat();

 		custoConsumidor = custoFabrica + (custoFabrica * 73/100);
 		System.out.printf("\nO custo ao Consumidor será de: " +custoConsumidor);
 		
 		
 		
	}



	}



			
