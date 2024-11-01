package atividadesGeneration.modulo_08;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		// Entrada de soma
		int soma = 0;
		int numero;
		
		// Laço de repetição
		do {
			// Entrada numero
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			// Condição para somar os números positivos
			if (numero > 0) {
				soma += numero;
			}
		} while (numero != 0); 
		
		// Saída
		System.out.println("A soma dos números positivos é: " + soma);
		
		leia.close();

	}

}
