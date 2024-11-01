package atividadesGeneration.modulo_08;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Armazenar as contagens aqui
		int menores21 = 0;
		int maiores50 = 0;
		
		// Repetição while para encontrar as idades
		while (true) {
			System.out.println("Digite aqui uma idade:");
			int idade = leia.nextInt();
			
		// Para finalizar a leitura
		if (idade < 0) {
			break;
		}
		// Para contar as idades
		if (idade < 21) {
			menores21++;
		} else if (idade > 50) {
		    maiores50++;
		}
		
		}
	    // Sáida
		System.out.println("Total de pessoas que são menores de 21 anos de idade: " + menores21);
		System.out.println("Total de pessoas que são maiores de 50 anos de idade: " + maiores50);
		
		leia.close();
	}

}
