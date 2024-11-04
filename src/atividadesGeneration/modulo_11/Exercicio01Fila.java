package atividadesGeneration.modulo_11;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio01Fila {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			Queue<String> filaBanco = new LinkedList<>();
			int opcao;

			do {
				// Exibir o menu
				System.out.println("\nMenu:");
				System.out.println("1: Adicionar um novo Cliente na fila");
				System.out.println("2: Listar todos os clientes na fila");
				System.out.println("3: Chamar (retirar) uma pessoa da fila");
				System.out.println("0: Finalizar o programa");
				System.out.print("Adicione a sua opção");
				opcao = scanner.nextInt();

				if (opcao == 1) {
					System.out.print("Adicionar um novo cliente");
					filaBanco.add(scanner.next());
					System.out.print("Cliente adicionado");
				}

				if (opcao == 2) {
					System.out.println("Clientes na fila");
					Iterator<String> iterator = filaBanco.iterator();

					while (iterator.hasNext()) {
						System.out.println(iterator.next());
					}
				}

				if (opcao == 3) {

					System.out.print(" A pessoa:  " + filaBanco.poll() + " foi chamado ");

					
				}
			} while (opcao != 0);

		}
	}
}
