import java.util.ArrayList;

public class Conta {
	
	private static int idConta = 1001 ;
	private double saldo;
	private ArrayList<Movimentos> movimentos = new ArrayList<Movimentos>();
	
	public void depositar(double movimento) {
		this.saldo += movimento;	
		movimentos.add(new Movimentos(movimento, "Deposito"));
	}
	
	public void levantar(double movimento) {	
		if(saldo < movimento) {
			System.out.println("Saldo Insuficiente!");

		}else {
			this.saldo -= movimento;
			movimentos.add(new Movimentos(movimento, "Levantamento"));
		}
	}
	
	public void transfer(Conta to, double transfer) {
		this.levantar(transfer);
		to.depositar(transfer);
		
		
	}
	
	public ArrayList<Movimentos> getMovimentos() {
		return movimentos;
	}

	public void setMovimentos(ArrayList<Movimentos> movimento ) {
		this.movimentos = movimento;
	}

    private void setSaldo(double movimento) {
    	this.saldo += movimento;
    }
	public double getSaldo() {
		return saldo;
	}


	public Conta() {
		idConta++;		
	}


	private static int getIdCartao() {
		return idConta;
	}

}
