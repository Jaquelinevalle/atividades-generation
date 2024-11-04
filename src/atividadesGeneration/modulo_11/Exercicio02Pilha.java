package atividadesGeneration.modulo_11;

import java.util.Scanner;
import java.util.Iterator;
import java.util.Stack;

public class Exercicio02Pilha {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			Stack<String> pilha = new Stack<String>();
			int livro;

			do {
				// Exibir Menu de Livros
				System.out.println("\nMenu:");
				System.out.println("1: Digite o nome do livro");
				System.out.println("2: Listar todos os livros na pilha");
				System.out.println("3: A pilha está vazia");
				System.out.println("0: Finalizar o programa");
				System.out.print("Adicione a sua opção");
				livro = scanner.nextInt();

				if (livro == 1) {
					System.out.print("Digite o nome do livro");
					pilha.push(scanner.next());
					System.out.print("O livro foi adicionado");
				}
				if (livro == 2) {
					System.out.println("lista de livros na pilha");
					Iterator<String> iterator = pilha.iterator();

					while (iterator.hasNext()) {
						System.out.println(iterator.next());
					}
				}

				if (livro == 3) {

					System.out.print(" O livro:  " + pilha.pop() + " foi retirado ");

				}
			} while (livro != 0);

		}
	}
}
