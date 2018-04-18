import java.util.ArrayList;

public class Conta {
	
	private static int idCartao = 1001 ;
	private double saldo;
	private double movimento;
	private ArrayList<Movimentos> movimentos = new ArrayList<Movimentos>();
	
	public void deposito(double movimento) {
		
		if (movimento > getSaldo()) {
		this.movimento = movimento;
		movimentos.add(new Movimentos(movimento));
		setSaldo(movimento);}
		else {
			System.out.println("Saldo insuficiente!");
		}
		
		
	}
	
	public ArrayList<Movimentos> getMovimentos() {
		return movimentos;
	}

	public void setMovimentos(ArrayList<Movimentos> movimento ) {
		this.movimentos = movimento;
	}

    private void setSaldo(double movimento) {
    	this.saldo +=movimento;
    }
	public double getSaldo() {
		return saldo;
	}


	public Conta() {
		idCartao++;		
	}

	private double getSaldo1() {
		return saldo;
	}

//	private double getMovimentos() {
//		return movimentos;
//	}
//
//	private void setMovimentos(double movimentos) {
//		this.movimentos = movimentos;
//	}

	private static int getIdCartao() {
		return idCartao;
	}

}
