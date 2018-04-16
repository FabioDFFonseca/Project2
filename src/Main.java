import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

	public static void main(String[] args) {
		DisplayMenu();
//		Cliente cliente1 = new Cliente("Mark Zuckerberg", "V");
//		listaClientes.add(cliente1);
//		cliente1.getContaAOrdem().deposito(100000);
//		cliente1.getContaAOrdem().deposito(99990);
//		System.out.println(cliente1.getContaAOrdem().getMovimentos());
//		
//		
//		Cliente cliente2 = new Cliente("Jeff Bezos", "O");
//		listaClientes.add(cliente2);
//		cliente2.getContaAOrdem().deposito(250000);
//		cliente2.getContaAOrdem().deposito(5555);
//		System.out.println(cliente1.getContaAOrdem().getMovimentos());
//		
//		for(int i = 0; i< listaClientes.size(); i++) {
//			listaClientes.get(i).getContaAOrdem().deposito(-10);
//		}
		
		
//		Cliente cliente3 = new Cliente("Marissa Mayer ", "V", 100000000);
//		listaClientes.add(cliente3);
//		Cliente cliente4 = new Cliente();
//		cliente4.setNomeCliente("Larry Page");
//		cliente4.setTipoConta("V");
//		cliente4.setSaldo(2000000);
//	listaClientes.add(cliente4);
		


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

	// public void ListofCustomers(){
	//
	// for (int i =0; i<listaClientes.size() ; i++) {
	//
	// System.out.println("a new client named " + listaClientes.nomeCliente[i] +
	// " with id number " + idCliente + " opened a "
	// + tipoConta + " type account and has a deposit of " + saldoInicial + "
	// euros");
	//
	// System.out.println(" cliente  "+ listaCliente[i]);
	// }



 

 public static void DisplayMenu() {

 Scanner userInput = new Scanner(System.in);
 String readOption;
 String nomeCliente;
 String tipoConta;

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
	 System.out.println("nome de clinete :" + "tipo de conta: " );
	nomeCliente = userInput.next();
	tipoConta = userInput.next();
	
 Cliente criarCliente = new Cliente(nomeCliente, tipoConta);
 listaClientes.add(criarCliente);
 
 break;

 case "2":
	 displayClientes();
	 break;

 case "3":
 // Options OptionsCliente = new Options();
 System.out.println("1 - Depositos:");
 System.out.println("2 - Levantamentos:");
 int op = 0;
 op = userInput.nextInt();
 if(op == 1) {
	 System.out.println("Deposito");
	 
 }else {
	 System.out.println("Levantamento");
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
