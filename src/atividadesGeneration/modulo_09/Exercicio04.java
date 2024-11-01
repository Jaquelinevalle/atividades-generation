package atividadesGeneration.modulo_09;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float notas[][] = new float[10][4], medias[] = new float[10], somador = 0;

		for (int x = 0; x < 10; x++) {

			somador = 0;

			for (int y = 0; y <= 3; y++) {

				System.out.print("Digite a nota: " + (y + 1) + ": ");
				notas[x][y] = leia.nextFloat();
				somador += notas[x][y];

			}
			medias[x] = somador / 4;
			somador = 0;
		}

		leia.close();

		System.out.println("\n Médias \n");
		for (int i = 0; i < medias.length; i++) {
			System.out.println("  " + medias[i] + " ");

		}
	}
}
