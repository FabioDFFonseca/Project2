
public class Movimentos{
	
	private double deposito;
	
	
	public Movimentos(double deposito) {
		super();
		this.deposito = deposito;
	}
	private double getDeposito() {
		return deposito;
	}
	@Override
	public String toString() {
		return "Movimentos [deposito=" + deposito + "]";
	}
	private void setDeposito(double deposito) {
		this.deposito = deposito;
	}
	

}
