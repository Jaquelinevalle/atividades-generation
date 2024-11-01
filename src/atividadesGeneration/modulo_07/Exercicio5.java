package atividadesGeneration.modulo_07;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
		
		// Entrada de informações
		System.out.println("Digite o código do produto (1 a 6):");
		int codigo = leia.nextInt();
		
		System.out.println("Digite a quantidade comprada:");
		int quantidade = leia.nextInt();
		
		// Armazenar o nome do produto e o preço da unidade
		String produto = "";
		float precoUnitario = 0;
		
		// Laço condicional switch 
		switch (codigo) {
		case 1: 
			produto = "Cachorro Quente";
			precoUnitario = 10.00f;
			break;
		
		case 2:
			produto = "X-Salada";
			precoUnitario = 15.00f;
			break;
		
		case 3:
			produto = "X-Bacon";
			precoUnitario = 18.00f;
			break;
			
		case 4:
			produto = "Bauru";
			precoUnitario = 12.00f;
			break;
			
		case 5:
			produto = "Refrigerante";
			precoUnitario = 8.00f;
			break;
			
		case 6:
			produto = "Suco de Laranja";
			precoUnitario = 13.00f;
			break;
		default:
			
		System.out.println("Código do produto inválido!");
		leia.close();
		return;
		}
		
		// Calcular o valor total
		float valorTotal = quantidade * precoUnitario;
		
		// Saída
		System.out.println("Produto: " + produto);
		System.out.println("Valor total: R$ " + valorTotal);
		
		leia.close();

	}

}
