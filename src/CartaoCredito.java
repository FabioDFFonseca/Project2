import java.util.ArrayList;

public class CartaoCredito {
	
	static int contadorCartoes;
	int idCartao;
	double saldoCartaoCredito = 500;
	double compraCredito;
	ArrayList<Movimentos> movimentosCredito = new ArrayList<Movimentos>();
	
	// criar cartao debito ou credito, associar um plafond de 500 euros e gestao do cartao
	
	public CartaoCredito() {	
	
	}
	
	public void compraCredito(double compra) {
		
		if(saldoCartaoCredito < compra) {
			System.out.println("o saldo disponivel no cart�o � insuficiente!");
		}else {
			this.saldoCartaoCredito -= compra;	
			movimentosCredito.add(new Movimentos(compra, "Cart�o cr�dito",this.saldoCartaoCredito));
		}	
	}
	
	public ArrayList<Movimentos> getMovimentosCredito() {
		return movimentosCredito;
	}

	private void setMovimentosCredito(ArrayList<Movimentos> movimentosCredito) {
		this.movimentosCredito = movimentosCredito;
	}

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

	public void setSaldoCartaoCredito(double saldoCartaoCredito) {
		this.saldoCartaoCredito = saldoCartaoCredito;
	}
	
}
