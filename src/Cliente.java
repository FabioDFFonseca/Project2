

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
	
	private int idCliente;
	private static int idCounter = 0;
	private String nomeCliente;
	private String tipoConta;
	private Conta contaAOrdem;
	//private ArrayList<Double> saldo = new ArrayList<Double>();
	
	public Conta getContaAOrdem() {
		return contaAOrdem;
	}

	public void setContaAOrdem(Conta contaAOrdem) {
		this.contaAOrdem = contaAOrdem;
	}
	
	public Cliente(String nome, String tipo) {
		this.nomeCliente=nome;
		this.tipoConta=tipo;
		contaAOrdem = new Conta();
		setId();
		
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

//	public ArrayList<Double> getSaldo() {
//		return saldo;
//	}
//
//	public void setSaldo(double saldo) {
//		this.saldo.add(saldo);
//	}

	public void displayClient(String cliente) {

		
		
		//System.out.println("a new client named " + nomeCliente + " with id number " + idCliente + "  openned a  "
		//		+ tipoConta + " type account and has a deposit of " + saldoInicial + " euros");
		
	}
		
//		public Cliente() {
//			idCliente++;
//
//			System.out.println("Selecionou a opção 1");
//
//			System.out.println("Criar cliente :");
//			this.nomeCliente = userInput.next();
	//
//			System.out.println("Definir tipo de conta (VIP / Regular :");
//			this.tipoConta = userInput.next().charAt(0);
	//
//			System.out.println("Valor a depositar :");
//			this.saldo = Double.parseDouble(userInput.next());
	//
//			displayClient();
//		}		
//		System.out.println("Dados correctos ? S/N");
//		this.validador = userInput.next().charAt(0);

//		 if (validador=='s') {
//		
//		 listaClientes.add(Cliente());
//		
		//private char validador;

		//Scanner userInput = new Scanner(System.in);

		// private char ArrayList <char> tipoConta = new ArrayList <char>();
		// private double ArrayList <String> movimentos = new ArrayList<String>();
//		 }
		
		

	
}