package nitage;

import java.util.*;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		criptaParola("cane");
		
		
		
		

	}
	
	static String alfabetoStringa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	// static char[] alfabeto = alfabetoStringa.toCharArray();
	
	static String disordinatoStringa = "JZXTRSEHCYDBGIFKVUMANWQPLO";
	// static char[] disordinato = alfabetoStringa.toCharArray();
	
// static char[] alfabeto1 = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z' };
// static	char[] disordinato1 = {'J','Z','X','T','R','S','E','H','C','Y','D','B','G','I','F','K','V','U','M','A','N','W','Q','P','L','O'};

	
	public static String criptaParola(String s) {
		//rendo maiuscola la stringa
		String parola = s.toUpperCase();
		
		//creo delle array list che mi serviranno più avanti
		ArrayList<Integer> indici = new ArrayList();
		ArrayList<String> lettereCriptate = new ArrayList();
		String parolaCriptata;
		
		
		System.out.println();
	
		for(int i = 0; i < parola.length(); i++) {
			
			//prendo ogni carattere dalla stringa e lo ciclo per controllare il suo indice nell'array alfabetico
			Character lettera = parola.charAt(i);
			System.out.println(alfabetoStringa.indexOf(lettera));
			Integer	indice = alfabetoStringa.indexOf(lettera);
			
			//inserisco tutti gli indici nell'array list creata all'inizio 
		indici.add(indice);
		System.out.println();
				
		}
		System.out.println(indici);
		//creo un array di caratteri 
		char[] criptoArray = new char[indici.size()];
		
		//creo un controllo per far si che il metodo funzioni solo se si inserisce una stringa di almeno una lettera 
		if(criptoArray.length != 0) {
			
			//ciclo l'array di indici per utilizzare i singoli indici all'interno di charat e poter prendere la lettera 
			//corrispondente nell'array criptato
			
			for(int i = 0 ; i < indici.size();i++) {
				int posizione = indici.get(i);
				criptoArray[i] = disordinatoStringa.charAt(posizione);
			
						
				}
			//utilizzo il costruttore della String per creare una nuova stringa utilizzando l'array di char e la printo
			String parolCriptata = new String(criptoArray);
			System.out.println();
			System.out.println("parola inserita: " + s.toUpperCase());
			System.out.println();
			System.out.println( "Parola criptata: " + parolCriptata);
		}else {
			System.out.println("inserisci una parola");
		}
		
		 
		
		
		return s;
		
			
	
	}
	
	
	
	
	
}
