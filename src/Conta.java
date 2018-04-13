
public class Conta {
	
	private static int idCartao = 1001 ;
	private String nomeCliente;
	private char tipoConta;
	private double saldo;
	private double movimentos;
	
	public Conta() {
		
		idCartao++;
		
	}

	private char getTipoConta() {
		return tipoConta;
	}

	private void setTipoConta(char tipoConta) {
		this.tipoConta = tipoConta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getMovimentos() {
		return movimentos;
	}

	private void setMovimentos(double movimentos) {
		this.movimentos = movimentos;
	}

	private static int getIdCartao() {
		return idCartao;
	}

}
