package atividadesGeneration.modulo_07;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
		
		// Entrada dos dados
		System.out.println("Digite o nome do colaborador:");
		String nome = leia.nextLine();
		
		System.out.println("Digite o codigo do cargo (1 a 6");
		int codigoCargo = leia.nextInt();
		
		System.out.println("Digite o salário:");
		float salario = leia.nextFloat();
		
	    // Declare as variáveis para os cargo 
		String cargo = "";
		float percentualReajuste = 0;
		
		// Laço condicional switch
		switch (codigoCargo) {

			case 1:
				cargo = "Gerente";
				percentualReajuste = 0.10f;
				break;
				
			case 2:
				cargo = "Vendedor";
				percentualReajuste = 0.07f;
				break;
				
			case 3:
				cargo ="Supervisor";
				percentualReajuste = 0.09f;
				break;
				
			case 4:
				cargo ="Motorista";
				percentualReajuste = 0.06f;
				break;	
			
			case 5:
				cargo ="Estoquista";
				percentualReajuste = 0.05f;
				break;
			
			case 6:
				cargo ="Técnico de TI";
				percentualReajuste = 0.08f;
				break;
				
			default:
				
			System.out.println("Código do cargo inválido!");
			
			leia.close();
			return;
		}
		// Calcular o novo salário
			float novoSalario = salario + (percentualReajuste * salario);
			
			// Sáida de dados
		System.out.println("Nome do colaborador: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.println("Salário: R$ " + novoSalario);
		
		leia.close();
		

	}

}
