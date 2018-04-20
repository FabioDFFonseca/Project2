
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {

	private int idCliente;
	private static int idCounter = 0;
	private String nomeCliente;
	private String tipoConta;
	private Conta contaAOrdem;
	private CartaoCredito cartaoCredito;
	// private ArrayList<Double> saldo = new ArrayList<Double>();

	public Conta getContaAOrdem() {
		return contaAOrdem;
	}

	public void setContaAOrdem(Conta contaAOrdem) {
		this.contaAOrdem = contaAOrdem;
	}

	public Cliente(String nome, String tipo) {
		this.nomeCliente = nome;
		this.tipoConta = tipo;
		contaAOrdem = new Conta();
		setId();

		if (tipoConta.equalsIgnoreCase("V")) {
			cartaoCredito = new CartaoCredito();
			System.out.println("tem cartao de credito");
		}

	}

	public CartaoCredito getCartaoCredito() {
		return cartaoCredito;
	}

	private void setId() {
		idCounter++;
		this.idCliente = idCounter;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public void displayClient(String cliente) {

	}
}