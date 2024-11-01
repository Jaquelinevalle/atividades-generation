package atividadesGeneration.modulo_06;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner (System.in);
		
		System.out.println("programa de abono salarial: ");
		float salario = scanner.nextFloat();
		

		
		System.out.println("abono salário: ");
		float abonoSalario = scanner.nextFloat();
		
		// Calcular o abono e salario
	
		float novo = salario + abonoSalario;
		

				
		// Exibir o novo salario	
		
		System.out.println("Novo salario: " + novo);
		
		scanner.close();
	}

}
