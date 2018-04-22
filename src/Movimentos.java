import java.time.LocalDate;

public class Movimentos{
	

	private double valor;
	private double transfer;
	LocalDate localDate = LocalDate.now();
	String tipoDeMov;
	public int numMovimento=1;
	public double saldo;
	
	
	public Movimentos(double deposito, String tipo, double saldo) {
		super();
		this.valor = deposito;
		this.localDate = LocalDate.now();
		this.tipoDeMov = tipo;
		this.saldo=saldo;
		
	}
	private double getDeposito() {
		return valor;
	}
	public double getTransfer() {
		return transfer;
	}
	public void setTransfer(double transfer) {
		this.transfer = transfer;
	}
	@Override
	public String toString() {
		return numMovimento +" "+ localDate +" "+ tipoDeMov +"      "+ valor+"    "+saldo+"endOfMove" ;
	}
	private void setDeposito(double deposito) {
		this.valor = deposito;
	}
	

}
