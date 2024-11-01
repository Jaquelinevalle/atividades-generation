package atividadesGeneration.modulo_09;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {

				System.out.print("Digite a casa: " + x + "," + y + " :");
				matriz[x][y] = leia.nextInt();
			}
		}

		leia.close();

		System.out
				.println("Números do diagonal principal: " + matriz[0][0] + ", " + matriz[1][1] + ", " + matriz[2][2]);
		System.out
				.println("Números do diagonal secundaria: " + matriz[0][2] + ", " + matriz[1][1] + ", " + matriz[2][0]);
		System.out.println("Soma do diagonal principal: " + (matriz[0][0] + matriz[1][1] + matriz[2][2]));
		System.out.println("Soma do diagonal secundaria: " + (matriz[0][2] + matriz[1][1] + matriz[2][0]));
	}

}
