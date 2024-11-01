package atividadesGeneration.modulo_07;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); 
		
		// Entrada de dados
		System.out.println("Digite o número  da letra A:");
		int a = leia.nextInt();
		
		System.out.println("Digite o número da letra B:");
		int b = leia.nextInt();
		
		System.out.println("Digite o da letra número C:");
		int c = leia.nextInt();
		
		// Calcular a soma de A e B
		int soma = a + b;
		
		// Saída de dados
		System.out.println(a + " + " + b + " = " + soma);
		
		// Laço condicional IF para comparação
		if (soma >c) {
			System.out.println("A Soma de A + B é Maior do que C");
		} else if (soma < c) {
			System.out.println("A Soma de A + B é Menor do que C");
		}else {
			System.out.println("A Soma de A + B é Igual a C");
		}
		leia.close();

	}

}
