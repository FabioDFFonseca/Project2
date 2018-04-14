import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Mark Zuckerberg", "V", "1000000");
		listaClientes.add(cliente1);
		Cliente cliente2 = new Cliente("Jeff Bezos", "O", "10000000");
		listaClientes.add(cliente2);
		Cliente cliente3 = new Cliente("Marissa Mayer ", "v", "100000000");
		listaClientes.add(cliente3);
		
		

	}

	public static void displayClientes() {

		System.out.println("Lista de clientes UmeuBanku");

		for (int i = 0; i < listaClientes.size(); i++) {

			System.out.print(listaClientes.get(i).getNomeCliente() + '\t');
			System.out.print(listaClientes.get(i).getTipoConta() + '\t');
			System.out.println(listaClientes.get(i).getSaldoInicial());

		}

	}

	// public void ListofCustomers(){
	//
	// for (int i =0; i<listaClientes.size() : i++) {
	//
	// // System.out.println("a new client named " + listaClientes.nomeCliente[i] +
	// " with id number " + idCliente + " openned a "
	// //+ tipoConta + " type account and has a deposit of " + saldoInicial + "
	// euros");
	//
	// System.out.println(" cliente"+listaCliente[i]);
	// }

}

// DisplayMenu();

// public static void DisplayMenu() {
//
// Scanner userInput = new Scanner(System.in);
// String readOption;
//
// do {
//
// System.out.println("*****************************************");
// System.out.println("| Gestão de Contas |");
// System.out.println("*****************************************");
// System.out.println("| Opções: |");
// System.out.println("| 1. Criar cliente |");
// System.out.println("| 2. Listar clientes |");
// System.out.println("| 3. Opções cliente |");
// System.out.println("| 4. Seleccionar cartão |");
// System.out.println("| 5. Avançar período |");
// System.out.println("| 6. Sair |");
// System.out.println("*****************************************");
//
// System.out.print("Escolha uma opção");
//
// readOption = userInput.next();
//
// switch (readOption) {
//
// case "1":
// Cliente criarCliente = new Cliente();
// break;
//
// case "2":
// // Listar listarClientes = new Listar();
// System.out.println("Indisponivel!");
// break;
//
// case "3":
// // Options OptionsCliente = new Options();
// System.out.println("Indisponivel!");
// break;
//
// case "4":
// // EscolhaCartao EscolhaCartao = new EscolhaCartao();
// System.out.println("Indisponivel!");
// break;
//
// case "5":
// // AvancarPeriodo AvancarPeriodo = new AvancarPeriodo();
// System.out.println("Indisponivel!");
// break;
//
// case "6":
// System.exit(0);
// break;
// default:
// System.out.println("Indisponivel!");
// break;
//
// }
//
// } while (readOption != "6");
// }
// }
