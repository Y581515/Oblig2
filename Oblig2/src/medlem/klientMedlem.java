package medlem;

import java.util.Scanner;

import hobby.Hobby;
import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.kjedet.KjedetMengde;

public class klientMedlem {
	public static void main(String[] args) {

		Scanner tastatur = new Scanner(System.in);
		// Legger til ordene i mengden medlem1

		Medlem medlem1 = new Medlem();
		MengdeADT<Hobby> hobbyer1 = new KjedetMengde();
		Hobby hob;

		System.out.println("Oppgi en hobby, avslutt med zzz:");
		String streng = tastatur.nextLine();

		while (!streng.equals("zzz")) {

			hob = new Hobby(streng);

			// Legger innleste ord inn i ordliste2
			hobbyer1.leggTil(hob);
			System.out.println("Oppgi en hobby, avslutt med zzz:");
			streng = tastatur.nextLine();

		} // while

		

		System.out.println("Oppgi en Navn");
		streng = tastatur.nextLine();
		String navn = streng;

		System.out.println("Oppgi statusIndeks");
		
		int sI = tastatur.nextInt();

		medlem1.setNavn(navn);
		medlem1.setStatusIndeks(sI);
		medlem1.setHobbyer(hobbyer1);


		System.out.println("medlem: "+navn+"\nhobbyene: "+hobbyer1.toString()+"\nStatusIntekd: "+sI);
	}

}
