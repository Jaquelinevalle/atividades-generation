package atividadesGeneration.modulo_09;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[] vetor = new int[10];
		int soma = 0;
		int quantidadeElementos = vetor.length;
		
		// Numeros inteiros 
		for (int i = 0; i < quantidadeElementos; i++) {
			System.out.println("Digite o " + (i + 1) + "º número:");
			vetor[i] = leia.nextInt();
			soma += vetor[i]; }
		
		// Ímpares
		System.out.println("Elementos nos índices ímpares:");
		for (int i = 1; i < quantidadeElementos; i += 2) {
			System.out.print(vetor[i] + " ");
		}
		
		// Pares
		System.out.println("Elemetos pares:");
		for (int i = 0; i < quantidadeElementos; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
			}
		}
		System.out.println();
		
		// Calculando a média
		float media = (float) soma / quantidadeElementos;
		
		// Soma
		System.out.println("Soma: " + soma);
		
		// média
		System.out.println("Média: " + media);
		
		leia.close();

	}

}
