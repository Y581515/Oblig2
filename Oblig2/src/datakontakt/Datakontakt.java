package datakontakt;

import medlem.Medlem;

public class Datakontakt {
	private static int MAX = 100;
	private Medlem[] medlemer;
	private int antall;

	public Datakontakt() {
		this(MAX);
	}

	public Datakontakt(int Max) {
		this.medlemer = new Medlem[Max];
		antall = 0;
	}

	public void leggTilMedlem(Medlem person) {
		medlemer[antall] = person;
		antall++;

	}

	public int finnMedlemsIndeks(String medlemsnavn) {
		boolean funnet = false;
		int pos = 0;

		int Indeks = -1;

		while (pos < medlemer.length && !funnet) {
			if (medlemer[pos].getNavn().equals(medlemsnavn)) {
				Indeks = pos;
				funnet = true;
			} else {
				pos++;
			}

		}

		return Indeks;

	}

	public int finnPartnerFor(String medlemsnavn) {
		int partener = -1;
		int indeks = finnMedlemsIndeks(medlemsnavn);
		if (indeks < 0) {
			return indeks;
		} else {
			for (int i = 0; i < medlemer.length; i++) {
				if (medlemer[indeks].passerTil(medlemer[i]) && indeks != i
						&& medlemer[indeks].getStatusIndeks() == -1) {
					medlemer[i].setStatusIndeks(indeks);
					medlemer[indeks].setStatusIndeks(i);
					partener = i;
				}

			}
		}

		return partener;
	}

	public void tilbakestillStausIndeks(String medlemsnavn) {
		int m1 = finnMedlemsIndeks(medlemsnavn);
		int m2 = medlemer[m1].getStatusIndeks();
		medlemer[m1].setStatusIndeks(-1);
		medlemer[m2].setStatusIndeks(-1);

	}

}
