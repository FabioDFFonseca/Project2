import java.time.LocalDate;

public class Movimentos{
	
	private double valor;
	private double transfer;
	LocalDate localDate = LocalDate.now();
	String tipoDeMov;
	
	
	public Movimentos(double deposito, String tipo) {
		super();
		this.valor = deposito;
		this.localDate = LocalDate.now();
		this.tipoDeMov = tipo;
		
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
		return  tipoDeMov + " de " + valor + " as " + localDate;
	}
	private void setDeposito(double deposito) {
		this.valor = deposito;
	}
	

}
