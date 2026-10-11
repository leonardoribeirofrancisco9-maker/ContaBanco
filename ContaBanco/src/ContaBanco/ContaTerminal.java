package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, digite o numero da conta");
		int numero = Integer.parseInt(scanner.nextLine().trim());
		
		System.out.println("Por favor, digite o numero da agencia!");
		String agencia = scanner.nextLine().trim();
		
		System.out.println("Por favor, digite o nome do cliente");
		String nomeCliente = scanner.nextLine().trim();	
		
		System.out.println("Por favor, digite o seu saldo!");
		double saldo = Double.parseDouble(scanner.nextLine().trim().replace(",","."));
		
		String mensagem = "Ola ".concat(nomeCliente)
				.concat(", obrigado por criar uma conta em nosso banco, sua agencia e ")
				.concat(agencia)
				.concat(", conta ")
				.concat(String.valueOf(numero))
				.concat(" ja esta disponivel para saque!");
		
		System.out.println(mensagem);
		
		scanner.close();
				
				
		

	}

}
