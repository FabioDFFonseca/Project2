import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {

	private static int idCliente = 0;
	private String nomeCliente;
	private char tipoConta;
	private double saldo;
	private char validador;

	Scanner userInput = new Scanner(System.in);

	// private char ArrayList <char> tipoConta = new ArrayList <char>();
	// private double ArrayList <String> movimentos = new ArrayList<String>();



	public Cliente() {

		idCliente++;

		System.out.println("Selecionou a opção 1");

		System.out.println("Criar cliente :");
		this.nomeCliente = userInput.next();

		System.out.println("Definir tipo de conta (VIP / Regular :");
		this.tipoConta = userInput.next().charAt(0);

		System.out.println("Valor a depositar :");
		this.saldo = Double.parseDouble(userInput.next());

		displayClient();
	}

	public void displayClient() {

		System.out.println("a new client named " + nomeCliente + " with id number " + idCliente + "  openned a  "
				+ tipoConta + " type account and has deposit " + saldo + " euros");

		System.out.println("Dados correctos ? S/N");
		this.validador = userInput.next().charAt(0);

//		 if (validador=='s') {
//		
//		 listaClientes.add(Cliente());
//		
//		 }

	}
}