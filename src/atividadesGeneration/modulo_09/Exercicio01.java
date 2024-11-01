package atividadesGeneration.modulo_09;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vetorInteiros[] = {2,5,1,3,4,9,7,8,10,6}; 
		
		// Ordena o valor
		Arrays.sort(vetorInteiros);
		System.out.println("\nVetor Ordenado");
		
		for (int indice = 0; indice < vetorInteiros.length; indice++) {
			System.out.println(vetorInteiros[indice]);
		}
		
		// Digitar o número a ser encontrado
		
		System.out.println("\nO Digite o número que você deseja encontrar");
		int numeroProcurado = leia.nextInt();
		
		// Realizar a busca
		int posicao = Arrays.binarySearch(vetorInteiros, numeroProcurado);
		
		// Se a posicao for positiva = Encontrou
		
		if (posicao >= 0) { 
			System.out.println("\nO elemento foi Encontrado e está na Posição: " + posicao);
		} else {
		    System.out.println("\nElemento não encontrado!");
		 }
	leia.close();

	}

}
