package medlem;

import hobby.Hobby;
import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.kjedet.KjedetMengde;

public class klientMedlem {
	public static void main(String[] args) {

		String[] hobbyer1Tab = { "Fiske", "Sjakk", "Vollybal", "Fotbal" };
		String[] hobbyer2Tab = { "Handbal", "Vollybal", "Fotbal" };
		String[] hobbyer3Tab = { "Fiske", "Sjakk", "Vollybal", "Fotbal" };
		String[] hobbyer4Tab = { "Handbal", "Vollybal", "Fotbal" };
		String[] hobbyer5Tab = { "Fotbal", "Vollybal" };

		MengdeADT<Hobby> hobbyer1 = new KjedetMengde();
		MengdeADT<Hobby> hobbyer2 = new KjedetMengde();
		MengdeADT<Hobby> hobbyer3 = new KjedetMengde();
		MengdeADT<Hobby> hobbyer4 = new KjedetMengde();
		MengdeADT<Hobby> hobbyer5 = new KjedetMengde();
		Hobby hob;

		int i = 0;
		while (hobbyer1Tab.length > i || hobbyer2Tab.length > i || hobbyer3Tab.length > i || hobbyer4Tab.length > i
				|| hobbyer5Tab.length > i) {

			if (hobbyer1Tab.length > i) {
				hob = new Hobby(hobbyer1Tab[i]);
				hobbyer1.leggTil(hob);
			}

			if (hobbyer2Tab.length > i) {
				hob = new Hobby(hobbyer2Tab[i]);
				hobbyer2.leggTil(hob);
			}

			if (hobbyer3Tab.length > i) {
				hob = new Hobby(hobbyer3Tab[i]);
				hobbyer3.leggTil(hob);
			}

			if (hobbyer4Tab.length > i) {
				hob = new Hobby(hobbyer4Tab[i]);
				hobbyer4.leggTil(hob);
			}

			if (hobbyer5Tab.length > i) {
				hob = new Hobby(hobbyer5Tab[i]);
				hobbyer5.leggTil(hob);
			}

			i++;

		} // while

		Medlem medlem1 = new Medlem("Medlem1", hobbyer1, 1);
		Medlem medlem2 = new Medlem("Medlem2", hobbyer2, 2);
		Medlem medlem3 = new Medlem("Medlem3", hobbyer3, 3);
		Medlem medlem4 = new Medlem("Medlem4", hobbyer4, 4);
		Medlem medlem5 = new Medlem("Medlem5", hobbyer5, 5);

		System.out.println(String.format("%-4s    :Indeks nummer %-4d   :Hobbyer %-4s   ", medlem1.getNavn(),
				medlem1.getStatusIndeks(), medlem1.getHobbyer().toString()));
		System.out.println(String.format("%-4s    :Indeks nummer %-4d   :Hobbyer %-4s   ", medlem2.getNavn(),
				medlem2.getStatusIndeks(), medlem2.getHobbyer().toString()));
		System.out.println(String.format("%-4s    :Indeks nummer %-4d   :Hobbyer %-4s   ", medlem3.getNavn(),
				medlem3.getStatusIndeks(), medlem3.getHobbyer().toString()));
		System.out.println(String.format("%-4s    :Indeks nummer %-4d   :Hobbyer %-4s   ", medlem4.getNavn(),
				medlem4.getStatusIndeks(), medlem4.getHobbyer().toString()));
		System.out.println(String.format("%-4s    :Indeks nummer %-4d   :Hobbyer %-4s   ", medlem5.getNavn(),
				medlem5.getStatusIndeks(), medlem5.getHobbyer().toString()));
	}

}
