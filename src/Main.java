import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

	public static void main(String[] args) {

		Cliente uMeuBanku = new Cliente("uMeuBanku", "O");
		listaClientes.add(uMeuBanku);
		uMeuBanku.getContaAOrdem().depositar(0);

		Cliente cliente1 = new Cliente("Mark Zuckerberg", "V");
		listaClientes.add(cliente1);
		cliente1.getContaAOrdem().depositar(100000);

		Cliente cliente2 = new Cliente("Jeff Bezos", "O");
		listaClientes.add(cliente2);
		cliente2.getContaAOrdem().depositar(250000);

		Cliente cliente3 = new Cliente("Marissa Mayer ", "V");
		listaClientes.add(cliente3);
		cliente3.getContaAOrdem().depositar(520000);

		Cliente cliente4 = new Cliente("Larry Page", "V");
		listaClientes.add(cliente4);
		cliente4.getContaAOrdem().depositar(550000);

		DisplayMenu();

	}

	public static void finalMes() {

		for (int i = 0; i < listaClientes.size(); i++) {
			double despesas;
			if (listaClientes.get(i).getTipoConta().equalsIgnoreCase("v")) {

				despesas = 500 - listaClientes.get(i).getCartaoCredito().getSaldoCartaoCredito();


				// liquida��o do creditos mediante verifica��o saldo disponivel

				Conta contaDestino = listaClientes.get(0).getContaAOrdem();

				if (listaClientes.get(i).getContaAOrdem().getSaldo() >= despesas) {
					listaClientes.get(i).getContaAOrdem().transfer(contaDestino, despesas);
					listaClientes.get(i).getCartaoCredito().setSaldoCartaoCredito(500);
				} else {
					System.out.println(" Conta sem saldo suficiente !");
					double saldoDisponivel = listaClientes.get(i).getContaAOrdem().getSaldo();
					listaClientes.get(i).getContaAOrdem().transfer(contaDestino, saldoDisponivel);
					listaClientes.get(i).getCartaoCredito().setSaldoCartaoCredito(500 - saldoDisponivel);
				}
			}
		}
	}

	public static void displayClientes() {

		System.out.println("|-------- Lista de clientes UmeuBanku-------");
		System.out.println("|ID ------Nome----------Conta ---- Valor ---");

		for (int i = 0; i < listaClientes.size(); i++) {
			System.out.print("| " + listaClientes.get(i).getIdCliente() + "   " + "\t");
			System.out.print(listaClientes.get(i).getNomeCliente() + '\t');
			System.out.print(listaClientes.get(i).getTipoConta() + '\t');
			System.out.println(listaClientes.get(i).getContaAOrdem().getSaldo() + "\t" + "    ");
		}
	}

	public static void decompMoves(StringBuilder decomMove) {

		String moves;
		int idx = 0;
		int nxtIdx;
		int lastIdx = decomMove.lastIndexOf("endOfMove");

		// decomposi��o da StringBuidler em SunStrings

		do {
			nxtIdx = decomMove.indexOf("endOfMove", idx);
			moves = decomMove.substring(idx + 1, nxtIdx);
			System.out.println(moves);
			idx = nxtIdx + 10;
		} while (idx < lastIdx);

	}

	public static void displayCliente(int id) {

		StringBuilder decomMove = new StringBuilder();

		System.out.print("Nome do titular  :" + "\t");
		System.out.print(listaClientes.get(id - 1).getNomeCliente() + '\t' + "    ");
		System.out.println("Numero da conta   :" + "\t" + id);
		System.out.println("N�. Data      Tipo          Valor       Saldo ");

		decomMove.append(listaClientes.get(id - 1).getContaAOrdem().getMovimentos());
		decompMoves(decomMove);

		// movimentos cart�o credito

		if (listaClientes.get(id - 1).getTipoConta().equalsIgnoreCase("V")) {
			System.out.println("Movimento do cart�o de cr�dito");

			if (listaClientes.get(id - 1).getCartaoCredito().getMovimentosCredito().size() > 0) {

				StringBuilder decomMoveCredits = new StringBuilder();

				decomMoveCredits.append(listaClientes.get(id - 1).getCartaoCredito().getMovimentosCredito());
				decompMoves(decomMoveCredits);
			} else {
				System.out.println("Cart�o de cr�dito sem movimentos registados");
				System.out.println(" Saldo disponivel  \t" + "    "
						+ listaClientes.get(id - 1).getCartaoCredito().getSaldoCartaoCredito());
			}
		}
	}

	public static void DisplayMenu() {

		Scanner userInput = new Scanner(System.in);
		String readOption;
		String nomeCliente;
		String tipoConta;
		int oId;
		int op;

		do {

			System.out.println("*****************************************");
			System.out.println("| Gest�o de Contas                      |");
			System.out.println("*****************************************");
			System.out.println("| Op��es:                               |");
			System.out.println("| 1. Criar cliente                      |");
			System.out.println("| 2. Consultas clientes                 |");
			System.out.println("| 3. Opera��es clientes                 |");
			System.out.println("| 4. Compras cart�o cr�dito             |");
			System.out.println("| 5. Final do m�s                       |");
			System.out.println("| 6. Sair                               |");
			System.out.println("*****************************************");

			System.out.print("Escolha uma op��o 1 a 6 > ");

			readOption = userInput.nextLine();

			switch (readOption) {

			case "1":
				System.out.println("Primeiro nome do cliente :");
				nomeCliente = userInput.nextLine();
//				System.out.println("Apelido do cliente :");
//				nomeCliente= nomeCliente+" "+userInput.nextLine();
				System.out.println("introduza tipo de conta: V / O");
				tipoConta = userInput.nextLine();
				Cliente novoCliente = new Cliente(nomeCliente, tipoConta);
				listaClientes.add(novoCliente);
				novoCliente.getContaAOrdem().depositar(0);

				break;

			case "2":

				String opt;
				System.out.println("1. Listar todos clientes ?" + "\t" + "S / N");

				do {
					opt = userInput.nextLine();
					if (opt.equalsIgnoreCase("s")) {
						displayClientes();

					} else if (opt.equalsIgnoreCase("n")) {
						System.out.println("Introduza o Id do cliente");
						oId =Integer.parseInt(userInput.nextLine());
//						oId = userInput.nextInt();  // Paulo ja consegui solucionar o problema!!!

						displayCliente(oId);
					} else {
						System.out.println("Op��o n�o v�lida S / N");
					}
				} while (!opt.equalsIgnoreCase("n") && !opt.equalsIgnoreCase("s"));

				break;

			case "3":

				System.out.println("1 - Depositos:");
				System.out.println("2 - Levantamentos:");
				System.out.println("3 - Transferencias");

				op = 0;
				op = Integer.parseInt(userInput.nextLine());

				double movimento = 0;
				double transfer = 0;
				System.out.println("Introduza Id do cliente");
				oId = Integer.parseInt(userInput.nextLine());
				if (op == 1) {
					System.out.println("Introduza valor a Depositar");
					movimento = Integer.parseInt(userInput.nextLine());
					listaClientes.get(oId - 1).getContaAOrdem().depositar(movimento);
				} else if (op == 2) {
					System.out.println("Levantamento");
					movimento =Integer.parseInt(userInput.nextLine());
					listaClientes.get(oId - 1).getContaAOrdem().levantar(movimento);
				} else {
					System.out.println("Valor a transferir");
					movimento = Integer.parseInt(userInput.nextLine());
					System.out.println("Conta destino");
					int idDestino = Integer.parseInt(userInput.nextLine());
					Conta contaDestino = listaClientes.get(idDestino - 1).getContaAOrdem();
					listaClientes.get(oId - 1).getContaAOrdem().transfer(contaDestino, movimento);
				}
				break;

			case "4":

				System.out.println("Introduza Id do cliente");
				oId =Integer.parseInt(userInput.nextLine());
				System.out.println("Valor da compra a credito");
				double compra = Integer.parseInt(userInput.nextLine());
				listaClientes.get(oId - 1).getCartaoCredito().compraCredito(compra);
				break;

			case "5":
				// AvancarPeriodo AvancarPeriodo = new AvancarPeriodo();
				finalMes();
				System.out.println("� final do m�s");
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
