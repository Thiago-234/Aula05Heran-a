package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Conta;
import entidades.ContaCorrente;
import entidades.ContaPoupanca;

public class MainConta {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			
			System.out.print("Digite seu nome: ");
			String nome = x.nextLine();
			System.out.print("Digite o número da conta: ");
			int numero = x.nextInt();
			System.out.print("A conta será Poupança ou Corrente? \n1 para Poupança \n2 para Corrente");
			int opcao = x.nextInt();
			System.out.print("Digite um valor para colocar na sua conta: ");
			int saldo = x.nextInt();
			
			Conta c = new ContaCorrente(nome, numero, 0 , saldo);
			Conta d = new ContaCorrente(nome, numero, 0 , saldo);
			Conta a = new ContaPoupanca(nome, numero, saldo);
			
			a.depositar(saldo);

			
			if(opcao == 1) {
				System.out.println("Conta Cadastrada!: \nTipo de conta: Poupança \nNome: " + nome + " "
				+ "\nNúmero da conta: " + numero + "\nSaldo depositado: " + saldo);
				System.out.println();
			}
			else if(opcao == 2) {
				System.out.println("Conta Cadastrada!: \nTipo de conta: Corrente \nNome: " + nome + " "
				+ "\nNúmero da conta: " + numero + "\nSaldo depositado: " + saldo);
				System.out.println();
			}
			
			
		}
		System.out.print("Digite seu nome: ");
		String nome = x.nextLine();
		System.out.print("Digite o número da conta: ");
		int numero = x.nextInt();
		System.out.print("A conta será Poupança ou Corrente? \n1 para Poupança \n2 para Corrente");
		int opcao = x.nextInt();
		System.out.print("Digite um valor para colocar na sua conta: ");
		int saldo = x.nextInt();
		
		Conta c = new ContaCorrente(nome, numero, 0 , saldo);
		Conta d = new ContaCorrente(nome, numero, 0 , saldo);
		Conta a = new ContaPoupanca(nome, numero, saldo);
		
		a.depositar(saldo);

		
		if(opcao == 1) {
			System.out.println("Conta Cadastrada!: \nTipo de conta: Poupança \nNome: " + nome + " "
			+ "\nNúmero da conta: " + numero + "\nSaldo depositado: " + saldo);
			System.out.println();
		}
		else if(opcao == 2) {
			System.out.println("Conta Cadastrada!: \nTipo de conta: Corrente \nNome: " + nome + " "
			+ "\nNúmero da conta: " + numero + "\nSaldo depositado: " + saldo);
			System.out.println();
		}
		
	}
}
