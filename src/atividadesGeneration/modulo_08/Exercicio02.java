package atividadesGeneration.modulo_08;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
Scanner leia = new Scanner(System.in);
		
		// Armazenar contagem de números pares e ímpares
		int pares = 0;
		int ímpares = 0;
		
		// Laço de repetição
		for (int i = 1; i <= 10; i++) {
			
		System.out.println("Digite o " + i + " º número:");
		int numero = leia.nextInt();
		
		// Condicional para saber se o número é par ou ímpar
		if (numero % 2 == 0) {
			pares++;
		} else {
			ímpares++;
		}
		}
		// Sáida
		System.out.println("Total de números pares: " + pares);
		System.out.println("Total de números ímpares: " + ímpares);
		
		leia.close();
		
		}
	}


