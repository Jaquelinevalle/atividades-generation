package atividadesGeneration.modulo_10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set<Integer> numerosSet = new HashSet<>();

		// Digite 10 valores inteiros que não se repitam
		System.out.println("Digite 10 números inteiros não repetidos: ");
		while (numerosSet.size() < 10) {
			int numero = leia.nextInt();
			if (!numerosSet.contains(numero)) {
				numerosSet.add(numero);
			} else {
				System.out.println("O número está duplicado. Digite outro número. ");
			}
		}
		// Exibir os elementos do Set usando Iterator
		System.out.println("Listar dados do Set:");
		Iterator<Integer> iterator = numerosSet.iterator();
		while (iterator.hasNext())
			;
		{
			System.out.println(iterator.next() + " ");
		}
		leia.close();

	}

}
