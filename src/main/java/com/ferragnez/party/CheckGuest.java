package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {


	private static final Scanner input = null;

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
		
		// Stampo il titolo di benvenuto
		// Stampo la richiesta dati dell'utente
		System.out.println("Buonasera, benvenuto/a alla festa a casa Ferragnez");
		System.out.println("Mi dica nome e cognome, gentilmente");
		
		// Stampo l'input per la richiesta dell'utente, creando una variabile
		String nomeInvitato = input.nextLine();
		// System.out.println(nomeInvitato);
		
		// Creo il ciclo FOR per verificare la presenza dell'invitato
		// - SE è presente, può entrare
		// - ALTRIMENTI non può entrare
		
		boolean presente = false;
		
		for (int i = 0; i < listaInvitati.length; i++) {
			
			String nomeScritto = listaInvitati[i];
			// Stampo per una verifica
			System.out.println(nomeScritto);
			
			// Creo l'IF
			if (nomeScritto == nomeInvitato) {
				presente = true;
			}
		}
	}
}
