import java.util.ArrayList;

public class Conta {
	
	private static int idCartao = 1001 ;
	private double saldo;
	private ArrayList<Movimentos> movimentos = new ArrayList<Movimentos>();
	
	
	
	public void deposito(double deposito) {
		this.saldo += deposito;
		movimentos.add(new Movimentos(deposito));
	}
	
	
	public ArrayList<Movimentos> getMovimentos() {
		return movimentos;
	}


	public void setMovimentos(ArrayList<Movimentos> movimentos) {
		this.movimentos = movimentos;
	}


	public double getSaldo() {
		return saldo;
	}


	public Conta() {
		idCartao++;
		
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
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
