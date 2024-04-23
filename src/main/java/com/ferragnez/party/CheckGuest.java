package com.ferragnez.party;

public class CheckGuest {

	public static void main(String[] args) {
		
		// Il programma richiede di controllare gli invitati alla festa dei Ferragnez.
		/* Avremo bisogno di:
		 * 1. Inizializzare un Array contenente la lista degli invitati.
		 * 2. Chiedere all'utente come si chiama.
		 * 3. Verificare se il nome è presente nella lista.
		 * 4. SE è presente entra, ALTRIMENTI non entra.
		 */
		
		// Lista invitati
		String [] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		// Stampo la lista degli invitati per vedere se funziona l'Array
		// System.out.println(Arrays.toString(listaInvitati));
		
		// Creo l'input che l'utente deve eseguire con scanner
		Scanner scan = new Scanner(System.in);
		String stampa = scan.nextLine();
		
		System.out.println();

	}

}
