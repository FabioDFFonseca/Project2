
public class CartaoCredito {
	
	static int contadorCartoes;
	int idCartao;
	double saldoCartaoCredito = 500;
	// criar cartao debito ou credito, associar um plafond de 500 euros e gestao do cartao
	
	private int getIdCartao() {

		return idCartao;
	}
	private void setIdCartao(int idCartao) {
		contadorCartoes++;
		this.idCartao = contadorCartoes;
	}
	public double getSaldoCartaoCredito() {
		return saldoCartaoCredito;
	}
}
