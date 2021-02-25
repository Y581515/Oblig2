package MedlemKlienter;

import datakontakt.Datakontakt;
import hobby.Hobby;
import medlem.Medlem;
import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.kjedet.KjedetMengde;

public class klientMedlem {
	public static void main(String[] args) {

		String[] hobbyer0Tab = { "Fiske", "Sjakk", "Vollybal", "Fotbal" };
		String[] hobbyer1Tab = { "Handbal", "Vollybal", "Fotbal" };
		String[] hobbyer2Tab = { "Fiske", "Sjakk", "Vollybal", "Fotbal" };
		String[] hobbyer3Tab = { "Handbal", "Vollybal", "Fotbal" };
		String[] hobbyer4Tab = { "Fotbal", "Vollybal" };

		MengdeADT<Hobby> hobbyer1 = new KjedetMengde();
		MengdeADT<Hobby> hobbyer2 = new KjedetMengde();
		MengdeADT<Hobby> hobbyer3 = new KjedetMengde();
		MengdeADT<Hobby> hobbyer4 = new KjedetMengde();
		MengdeADT<Hobby> hobbyer5 = new KjedetMengde();
		Hobby hob;

		int i = 0;
		while (hobbyer0Tab.length > i || hobbyer1Tab.length > i || hobbyer2Tab.length > i || hobbyer3Tab.length > i
				|| hobbyer4Tab.length > i) {

			if (hobbyer0Tab.length > i) {
				hob = new Hobby(hobbyer0Tab[i]);
				hobbyer1.leggTil(hob);
			}

			if (hobbyer1Tab.length > i) {
				hob = new Hobby(hobbyer1Tab[i]);
				hobbyer2.leggTil(hob);
			}

			if (hobbyer2Tab.length > i) {
				hob = new Hobby(hobbyer2Tab[i]);
				hobbyer3.leggTil(hob);
			}

			if (hobbyer3Tab.length > i) {
				hob = new Hobby(hobbyer3Tab[i]);
				hobbyer4.leggTil(hob);
			}

			if (hobbyer4Tab.length > i) {
				hob = new Hobby(hobbyer4Tab[i]);
				hobbyer5.leggTil(hob);
			}

			i++;

		} // while

		Medlem medlem0 = new Medlem("Medlem0", hobbyer1, -1);
		Medlem medlem1 = new Medlem("Medlem1", hobbyer2, -1);
		Medlem medlem2 = new Medlem("Medlem2", hobbyer3, -1);
		Medlem medlem3 = new Medlem("Medlem3", hobbyer4, -1);
		Medlem medlem4 = new Medlem("Medlem4", hobbyer5, -1);

//		skriveUt(medlem0.getNavn(),medlem1.getStatusIndeks(), medlem1.getHobbyer().toString());
//		skriveUt(medlem1.getNavn(),medlem2.getStatusIndeks(), medlem2.getHobbyer().toString());
//		skriveUt(medlem2.getNavn(),medlem3.getStatusIndeks(), medlem3.getHobbyer().toString());
//		skriveUt(medlem3.getNavn(),medlem4.getStatusIndeks(), medlem4.getHobbyer().toString());
//		skriveUt(medlem4.getNavn(),medlem5.getStatusIndeks(), medlem5.getHobbyer().toString());

		Datakontakt dataKontakt1 = new Datakontakt();
		dataKontakt1.leggTilMedlem(medlem0);
		dataKontakt1.leggTilMedlem(medlem1);
		dataKontakt1.leggTilMedlem(medlem2);
		dataKontakt1.leggTilMedlem(medlem3);
		dataKontakt1.leggTilMedlem(medlem4);

		System.out.println("Tabell Innehold");
		for (int j = 0; j < dataKontakt1.getAntall(); j++) {
			skriveUt(dataKontakt1.getMedlemer()[j].getNavn(), dataKontakt1.getMedlemer()[j].getStatusIndeks(),
					dataKontakt1.getMedlemer()[j].getHobbyer().toString());

		}

		System.out.println();
		System.out.println("Finn Medlem Indeks");
		System.out.println(dataKontakt1.finnMedlemsIndeks("Medlem0"));
		System.out.println(dataKontakt1.finnMedlemsIndeks("Medlem1"));
		System.out.println(dataKontakt1.finnMedlemsIndeks("Medlem2"));
		System.out.println(dataKontakt1.finnMedlemsIndeks("Medlem3"));
		System.out.println(dataKontakt1.finnMedlemsIndeks("Medlem4"));
		System.out.println();

		System.out.println("Etter finnPartnerFor");
		dataKontakt1.finnPartnerFor("Medlem0");
		dataKontakt1.finnPartnerFor("Medlem1");
		dataKontakt1.finnPartnerFor("Medlem2");
		dataKontakt1.finnPartnerFor("Medlem3");
		dataKontakt1.finnPartnerFor("Medlem4");

		for (int j = 0; j < dataKontakt1.getAntall(); j++) {
			skriveUt(dataKontakt1.getMedlemer()[j].getNavn(), dataKontakt1.getMedlemer()[j].getStatusIndeks(),
					dataKontakt1.getMedlemer()[j].getHobbyer().toString());

		}

		System.out.println();
		System.out.println("Partnere er i indeks ...");
		for (int j = 0; j < dataKontakt1.getAntall(); j++) {
			System.out.println(
					"partner til medlem" + j + " er på indeks " + dataKontakt1.getMedlemer()[j].getStatusIndeks());
		}

		System.out.println();
		System.out.println("partnere tilbakestilt");
		dataKontakt1.tilbakestillStausIndeks("Medlem0");
		dataKontakt1.tilbakestillStausIndeks("Medlem1");

		for (int j = 0; j < dataKontakt1.getAntall(); j++) {
			skriveUt(dataKontakt1.getMedlemer()[j].getNavn(), dataKontakt1.getMedlemer()[j].getStatusIndeks(),
					dataKontakt1.getMedlemer()[j].getHobbyer().toString());

		}

	}

	public static void skriveUt(String navn, int SI, String hobbyer) {
		System.out.println(String.format("%-4s    :Indeks nummer %-4d   :Hobbyer %-4s   ", navn, SI, hobbyer));

	}

}
