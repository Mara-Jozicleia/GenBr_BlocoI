package Vetores_Matrizes;

import java.util.Scanner;

public class Exercicio03 {

		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			
			final int linha = 3,coluna = 3;
			int[][] matriz = new int[linha][coluna];
			int contMatriz = 0;
			
			for(int l = 0; l < linha; l++) {
				
				for(int c = 0; c < coluna; c++) {
					
					System.out.println("\nEntre com um valor para a linha "+l+ " e Coluna "+c);
					matriz [l][c] = leia.nextInt();
					
					if(matriz [l][c] > 10) {
						contMatriz++;
					}
				}
			}
			System.out.println("\nA matriz possui "+contMatriz+" casas com numeros maiores que 10.");
		

	}
}

	