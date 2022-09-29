//O objetivo é simular um banco no qual o usuario possuirá um saldo e ao sacar um valor , se o valor for maior que o saldo lançará um execeção

import java.util.Scanner;

public class CriandoELancandoExcecao {

	// Criando um ambiente que representa um banco no qual possui conta e saldo
	private double saldo;//por padrão do java o double incia como 0
	private String nome;
	//Criando metodo saca 
	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente");
		} else {
			this.saldo -= valor;
			System.out.println("A transasao foi um sucesso seu saldo atual eh de: "+ this.getSaldo());
		}
	}
	//metodo para depositar um valor no saldo
	public void deposita(double valor) {
		this.saldo += valor;
	}
	//metodo para ver o saldo
	public double getSaldo() {
		return this.saldo;
	}
	//Testando o código
	public static void main(String[] args) throws CriandoELancandoExcecao.SaldoInsuficienteException {
		CriandoELancandoExcecao conta1 = new CriandoELancandoExcecao();
		Scanner leitor = new Scanner(System.in);
		System.out.println("Sua Conta tem " + conta1.getSaldo() + " de saldo");
		System.out.println("Quanto voce deseja depositar?");
		double deposito = leitor.nextDouble();
		conta1.deposita(deposito);
		System.out.println("Sua Conta tem " + conta1.getSaldo() + " de saldo");
		System.out.println("Escreva quanto deseja sacar");
		double valor= leitor.nextDouble();
		conta1.saca(valor);
		
		
	}
	// Criando a exceção para ser lançada
	class SaldoInsuficienteException extends Exception {

		public SaldoInsuficienteException(String msg) {
			super(msg);
		}
	}
}
