package atividadesGeneration.modulo_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// Criar cores que sejam listadas em Array
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<>();

		// Solicitar que o usuário digite as 5 cores
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite uma cor: ");
			cores.add(leia.nextLine());
		}

		// Exiba as cores adicionadas
		System.out.println("Listar todas as cores:");
		for (String cor : cores) {
			System.out.println(cor);
		}

		// Ordenar em ordem crescente
		Collections.sort(cores);

		// Exibir as cores ordenadas
		System.out.println("Ordenar as cores:");
		for (String cor : cores) {
			System.out.println(cor);
		}

		leia.close();

	}

}
