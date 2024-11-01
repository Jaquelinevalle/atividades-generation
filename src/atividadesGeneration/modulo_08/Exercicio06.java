package atividadesGeneration.modulo_08;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
		 
		 // Entrada soma, contador e numero inteiro
		 int soma = 0;
		 int contador = 0;
		 int numero;
		 
		 // Laço de repetição
		 do {
		 // Numero
		System.out.println("Digite um número:");
		numero = leia.nextInt();
		
		// Condição para somar os números múltiplos de 3
		if (numero != 0 && numero % 3 == 0) {
		soma += numero;
		contador++;
		}
		 } while (numero != 0);
		 
		// Para calcular a média
		 float media = (contador > 0) ? (float) soma / contador : 0;
		 
		// Saída
		 System.out.println("A média de todos os números múltiplos de 3 é: " + media);
		 
		 leia.close();

	}

}
