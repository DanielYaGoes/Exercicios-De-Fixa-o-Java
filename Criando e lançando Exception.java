import java.util.Scanner;

public class CriandoELancandoExcecao {

	// Criando um ambiente que representa um banco no qual possui conta e saldo
	private double saldo;
	private String nome;

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente");
		} else {
			this.saldo -= valor;
			System.out.println("A transasao foi um sucesso seu saldo atual eh de: "+ this.getSaldo());
		}
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public static void main(String[] args) throws CriandoELancandoExcecao.SaldoInsuficienteException {
		CriandoELancandoExcecao conta1 = new CriandoELancandoExcecao();
		Scanner leitor = new Scanner(System.in);
		conta1.deposita(12000);
		System.out.println("Sua Conta tem " + conta1.getSaldo() + " de saldo");
		System.out.println("Escreva quanto deseja sacar");
		double valor= leitor.nextDouble();
		conta1.saca(valor);
		
		
	}

	class SaldoInsuficienteException extends Exception {

		public SaldoInsuficienteException(String msg) {
			super(msg);
		}
	}
}
