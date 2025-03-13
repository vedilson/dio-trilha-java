package contaTerminal;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Favor informar o numero da conta:");
		int numero = sc.nextInt();

		System.out.println("Favor informar a agencia:");
		String agencia = sc.next();

		System.out.println("Favor informar o nome completo:");
		String nomeCliente = sc.next();

		System.out.println("Favor informar o saldo:");
		double saldo = sc.nextDouble();

		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
		
		sc.close();
	}

}
