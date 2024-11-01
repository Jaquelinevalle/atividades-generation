package atividadesGeneration.modulo_07;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		    // Utilizando "entrada" como nome do Scanner
		    
		    // Entrada de dados
		    System.out.println("Digite um número:");
		    int numero = entrada.nextInt();
		    
		    // Se o número é par ou ímpar
		    String paridade = (numero % 2 == 0) ? "par" : "ímpar";
		    
		    // Se o número é positivo, negativo ou zero
		    String sinal;
		    if (numero > 0) {
		    	sinal = "positivo";
		    } else if (numero < 0) {
		    	sinal = "negativo";
		    } else {
		    	sinal = "neutro"; 
		    // Caso o número seja zero, ele não é positivo e nem negativo
		    }
		    
		    System.out.println("O Número " + numero + " é " + paridade + " e " + sinal + "!");
		    
		    entrada.close();

	}

}
