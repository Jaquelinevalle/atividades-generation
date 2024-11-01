package atividadesGeneration.modulo_06;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		// Ler as 4 notas
		
		System.out.println("Digite a nota 1:");
	    float nota1 = scanner.nextFloat();
	    
	    System.out.println("Digite a nota 2:");
	    float nota2 = scanner.nextFloat();
	    
	    System.out.println("Digite a nota 3:");
	    float nota3 = scanner.nextFloat();
	    
	    System.out.println("Digite a nota 4:");
	    float nota4 = scanner.nextFloat();
	    
	    // Calcular a média
	    
	    float media = (nota1 + nota2 + nota3 + nota4) / 4;
	    
	    // Exibir a média final
	    System.out.println("Média final: " + media);
	    
	    scanner.close();
	    

	}

}
