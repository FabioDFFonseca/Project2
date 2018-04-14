import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {

	private static int idCliente = 0;
	private String nomeCliente;
	private String tipoConta;
	private ArrayList<String> saldoInicial = new ArrayList<>();
	
	public Cliente(String nome, String tipo, String saldoInicial) {
		idCliente++;
		this.nomeCliente=nome;
		this.tipoConta=tipo;
		this.saldoInicial.add(saldoInicial);
	}
			
	public String getNomeCliente() {
		return nomeCliente;
	}

	private void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getTipoConta() {	
		return tipoConta;
	}

	private void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public ArrayList<String> getSaldoInicial() {
		return saldoInicial;
	}

	private void setSaldoInicial(ArrayList<String> saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

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