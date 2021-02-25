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
		boolean funnet=false;
		int pos = 0;
		
		while(pos<medlemer.length && !funnet) {
			
			
			
			pos++;
		}

		return pos;

	}

}
