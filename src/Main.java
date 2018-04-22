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


				// liquidação do creditos mediante verificação saldo disponivel

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

		// decomposição da StringBuidler em SunStrings

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
		System.out.println("Nº. Data      Tipo          Valor       Saldo ");

		decomMove.append(listaClientes.get(id - 1).getContaAOrdem().getMovimentos());
		decompMoves(decomMove);

		// movimentos cartão credito

		if (listaClientes.get(id - 1).getTipoConta().equalsIgnoreCase("V")) {
			System.out.println("Movimento do cartão de crédito");

			if (listaClientes.get(id - 1).getCartaoCredito().getMovimentosCredito().size() > 0) {

				StringBuilder decomMoveCredits = new StringBuilder();

				decomMoveCredits.append(listaClientes.get(id - 1).getCartaoCredito().getMovimentosCredito());
				decompMoves(decomMoveCredits);
			} else {
				System.out.println("Cartão de crédito sem movimentos registados");
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
			System.out.println("| Gestão de Contas                      |");
			System.out.println("*****************************************");
			System.out.println("| Opções:                               |");
			System.out.println("| 1. Criar cliente                      |");
			System.out.println("| 2. Consultas clientes                 |");
			System.out.println("| 3. Operações clientes                 |");
			System.out.println("| 4. Compras cartão crédito             |");
			System.out.println("| 5. Final do mês	                    |");
			System.out.println("| 6. Sair                               |");
			System.out.println("*****************************************");

			System.out.print("Escolha uma opção 1 a 6 > ");

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

				String opt;
				System.out.println("1. Listar todos clientes ?" + "\t" + "S / N");

				do {
					opt = userInput.next();
					if (opt.equalsIgnoreCase("s")) {
						displayClientes();

					} else if (opt.equalsIgnoreCase("n")) {
						System.out.println("Introduza o Id do cliente");
						oId = userInput.nextInt();
						displayCliente(oId);
					} else {
						System.out.println("Opção não válida S / N");
					}
				} while (!opt.equalsIgnoreCase("n") && !opt.equalsIgnoreCase("s"));

				break;

			case "3":

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
				} else if (op == 2) {
					System.out.println("Levantamento");
					movimento = userInput.nextInt();
					listaClientes.get(oId - 1).getContaAOrdem().levantar(movimento);
				} else {
					System.out.println("Valor a transferir");
					movimento = userInput.nextInt();
					System.out.println("Conta destino");
					int idDestino = userInput.nextInt();
					Conta contaDestino = listaClientes.get(idDestino - 1).getContaAOrdem();
					listaClientes.get(oId - 1).getContaAOrdem().transfer(contaDestino, movimento);
				}
				break;

			case "4":

				System.out.println("Introduza Id do cliente");
				oId = userInput.nextInt();
				System.out.println("Valor da compra a credito");
				double compra = userInput.nextInt();
				listaClientes.get(oId - 1).getCartaoCredito().compraCredito(compra);
				break;

			case "5":
				// AvancarPeriodo AvancarPeriodo = new AvancarPeriodo();
				finalMes();
				System.out.println("É final do mês");
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
