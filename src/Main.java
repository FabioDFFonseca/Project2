import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
 static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();	
	
	public static void main(String[] args) {
		
//		int nomeCliente;
//		char tipoConta;
//		double valor; 
		
		 Cliente cliente1 = new Cliente("Mark Zuckerberg", 'V', (double) 1000000);
		 cliente1.displayClient();
		 
		 listaClientes.add(cliente1);
		 
		 Cliente cliente2 = new Cliente("Jeff Bezos", 'V', (double) 10000000);
		 cliente2.displayClient();
		 listaClientes.add(cliente2);
		 
		 
		 for (int i=0; i<listaClientes.size(); i++ ) {
			 
			 System.out.println(listaClientes.get(i));
		 }

	}
	
	public void display() {
		
		System.out.println("eis");
		
	}
		
	
		 
//		 public void ListofCustomers(){
//		
//			 for (int i =0; i<listaClientes.size() : i++) {
//				 
//				// System.out.println("a new client named " + listaClientes.nomeCliente[i] + " with id number " + idCliente + "  openned a  "
//				//+ tipoConta + " type account and has a deposit of " + saldoInicial + " euros");
//			 
//				 System.out.println(" cliente"+listaCliente[i]);
//			 }
			 
		 }
		 		 

		// DisplayMenu();


//	public static void DisplayMenu() {
//
//		Scanner userInput = new Scanner(System.in);
//		String readOption;
//
//		do {
//
//			System.out.println("*****************************************");
//			System.out.println("|          Gest�o de Contas             |");
//			System.out.println("*****************************************");
//			System.out.println("| Op��es:                               |");
//			System.out.println("|        1. Criar cliente               |");
//			System.out.println("|        2. Listar clientes             |");
//			System.out.println("|        3. Op��es  cliente             |");
//			System.out.println("|        4. Seleccionar cart�o          |");
//			System.out.println("|        5. Avan�ar per�odo             |");
//			System.out.println("|        6. Sair                        |");
//			System.out.println("*****************************************");
//
//			System.out.print("Escolha uma op��o");
//
//			readOption = userInput.next();
//
//			switch (readOption) {
//
//			case "1":
//				Cliente criarCliente = new Cliente();
//				break;
//
//			case "2":
//				// Listar listarClientes = new Listar();
//				System.out.println("Indisponivel!");
//				break;
//
//			case "3":
//				// Options OptionsCliente = new Options();
//				System.out.println("Indisponivel!");
//				break;
//
//			case "4":
//				// EscolhaCartao EscolhaCartao = new EscolhaCartao();
//				System.out.println("Indisponivel!");
//				break;
//
//			case "5":
//				// AvancarPeriodo AvancarPeriodo = new AvancarPeriodo();
//				System.out.println("Indisponivel!");
//				break;
//
//			case "6":
//				System.exit(0);
//				break;
//			default:
//				System.out.println("Indisponivel!");
//				break;
//
//			}
//
//		} while (readOption != "6");
//	}
//}
