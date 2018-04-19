import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Mark Zuckerberg", "V");
		listaClientes.add(cliente1);
		 cliente1.getContaAOrdem().depositar(100000);
		// cliente1.getContaAOrdem().deposito(99990);
		// System.out.println(cliente1.getContaAOrdem().getMovimentos());
		//
		//
		Cliente cliente2 = new Cliente("Jeff Bezos", "O");
		listaClientes.add(cliente2);
		cliente2.getContaAOrdem().depositar(250000);
		// cliente2.getContaAOrdem().deposito(5555);
		// System.out.println(cliente1.getContaAOrdem().getMovimentos());
		//
		// for(int i = 0; i< listaClientes.size(); i++) {
		// listaClientes.get(i).getContaAOrdem().deposito(-10);
		// }

		Cliente cliente3 = new Cliente("Marissa Mayer ", "V");
		listaClientes.add(cliente3);
		// Cliente cliente4 = new Cliente();
		// cliente4.setNomeCliente("Larry Page");
		// cliente4.setTipoConta("V");
		// cliente4.setSaldo(2000000);
		// listaClientes.add(cliente4);

		DisplayMenu();

		displayClientes();

	}

	public static void displayClientes() {

		System.out.println("Lista de clientes UmeuBanku");

		for (int i = 0; i < listaClientes.size(); i++) {
			System.out.println(listaClientes.get(i).getIdCliente());
			System.out.print(listaClientes.get(i).getNomeCliente() + '\t');
			System.out.print(listaClientes.get(i).getTipoConta() + '\t');
			System.out.println(listaClientes.get(i).getContaAOrdem().getSaldo());

		}
	}

	public static void displayCliente(int id) {

		System.out.println("Movimentos do cliente " + listaClientes.get(id).getNomeCliente());
		System.out.println(listaClientes.get(id-1).getContaAOrdem().getMovimentos());
		System.out.println("Saldo atual " + listaClientes.get(id-1).getContaAOrdem().getSaldo());
	}
	
	
	public static void DisplayMenu() {

		Scanner userInput = new Scanner(System.in);
		String readOption;
		String nomeCliente;
		String tipoConta;
		int oId;

		do {

			System.out.println("*****************************************");
			System.out.println("| Gestão de Contas |");
			System.out.println("*****************************************");
			System.out.println("| Opções: |");
			System.out.println("| 1. Criar cliente |");
			System.out.println("| 2. Listar clientes |");
			System.out.println("| 3. Opções cliente |");
			System.out.println("| 4. Seleccionar cartão |");
			System.out.println("| 5. Avançar período |");
			System.out.println("| 6. Sair |");
			System.out.println("*****************************************");

			System.out.print("Escolha uma opção");

			readOption = userInput.next();

			switch (readOption) {

			case "1":
				System.out.println("nome de cliente :" + "tipo de conta: ");
				nomeCliente = userInput.next();
				tipoConta = userInput.next();

				Cliente criarCliente = new Cliente(nomeCliente, tipoConta);
				listaClientes.add(criarCliente);

				break;

			case "2":

				int op = 0;
				System.out.println("1. Listar todos clientes ?"  + "\n" + "Press: 1 ");
				op = userInput.nextInt();
				if (op == 1) {
					displayClientes();
					System.out.println("Press enter para continuar");
					double movimento = userInput.nextInt();
				} else {
					System.out.println("Introduza o Id do cliente");
					oId = userInput.nextInt();
					displayCliente(oId);
					System.out.println("Press enter para continuar");
				}
				break;


			case "3":
				// Options OptionsCliente = new Options();
				System.out.println("1 - Depositos:");
				System.out.println("2 - Levantamentos:");
				System.out.println("3 - Transferencias");
				
				op = 0;
				op = userInput.nextInt();
				double movimento = 0;
				double transfer = 0;
				System.out.println("Introduza Id do cliente");
				oId = userInput.nextInt();
				if (op == 1) {
					System.out.println("Introduza valor a Depositar");
					movimento = userInput.nextInt();
					listaClientes.get(oId - 1).getContaAOrdem().depositar(movimento);
				} else if(op ==2){
					System.out.println("Levantamento");
					movimento = userInput.nextInt();
					listaClientes.get(oId - 1).getContaAOrdem().levantar(movimento);
				}else {
					System.out.println("Valor a transferir");
					movimento = userInput.nextInt();
					System.out.println("Conta destino");
					int idDestino = userInput.nextInt();
					Conta contaDestino= listaClientes.get(idDestino - 1).getContaAOrdem();
					listaClientes.get(oId - 1).getContaAOrdem().transfer(contaDestino,movimento);

				}
				
				break;

			case "4":
				// EscolhaCartao EscolhaCartao = new EscolhaCartao();
				System.out.println("Indisponivel!");
				break;

			case "5":
				// AvancarPeriodo AvancarPeriodo = new AvancarPeriodo();
				System.out.println("Indisponivel!");
				break;

			case "6":
				System.exit(0);
				break;
			default:
				System.out.println("Indisponivel!");
				break;
			}

		} while (readOption != "6");
	}
}
