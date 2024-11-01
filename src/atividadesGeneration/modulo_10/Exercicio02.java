package atividadesGeneration.modulo_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();

// Iniciando com 10 valores inteiros
		for (int i = 1; i <= 10; i++) {
			numeros.add(i);
		}

// Exibir os números da lista
		System.out.println("List:");
		for (int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}
// Digite um número inteiro
		System.out.print("Digite o número que você quer encontrar: ");
		int numero = leia.nextInt();

// Verificar se o número encontra-se presente na lista
		if (numeros.contains(numero))
			
		{
			int posicao = numeros.indexOf(numero);
			System.out.println("O número " + numero + " está na posição: " + posicao);

			System.out.println("O número " + numero + " não foi encontrado!");
		}
		leia.close();

	}

}
