package Decis�o;

import java.util.Scanner;

//a�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar.
//Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.

public class Exerc�cio4 {

	public static void main(String[] args) {
		int num;
		double resultado;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um n�mero");
		num = leia.nextInt();
		
		if(num%2==0) {
			resultado = Math.sqrt(num);
			System.out.println("\nO numero "+ num + " � Par e a raiz quadrada dele �: "+resultado);
		}
		
		else
		{
				resultado = Math.pow(num,2);
				System.out.println("\nO numero" + num + " � Impar e elevado ao quadrado ter� o resultado de: "+resultado);
				 
				
		}
		
		

		
	
		
	}

}
