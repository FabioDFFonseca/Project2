import java.util.ArrayList;

public class CartaoCredito {
	
	static int contadorCartoes;
	int idCartao;
	double saldoCartaoCredito = 500;
	double compraCredito;
	

//	ArrayList<Movimentos> movimentosCredito = new Movimentos<>();
	
	// criar cartao debito ou credito, associar um plafond de 500 euros e gestao do cartao
	
//	public CartaoCredito() {
//		
//	}
	
	public void CartaoCredito(double compra) {	
		if(saldoCartaoCredito < compra) {
			System.out.println("Saldo no Cart�o Insuficiente!");

		}else {
			this.saldoCartaoCredito -= compra;
			
		}
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
}
