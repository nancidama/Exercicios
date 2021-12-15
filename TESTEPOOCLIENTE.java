package POOCLIENTE;

public class TESTEPOOCLIENTE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//informaes deste objeto no console.

		POOCLIENTE cliente2 = new POOCLIENTE ("\nFernanda", " 26" , "casada" , "1995" );
		
		cliente2.imprimirInfo();
		System.out.println("\nInforme novos dados");
		
		cliente2.setPrimeironomeCliente("\nAline ");
		
		cliente2.setIdadeCliente(" \n20 ");
		
		cliente2.setEstadocivilCliente("\nSolteira");
		
		cliente2.setAnodeNascimento("\n2001");

		cliente2.imprimirInfo();
		
	}
}