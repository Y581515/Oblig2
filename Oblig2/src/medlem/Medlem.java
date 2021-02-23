package medlem;

import hobby.Hobby;
import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.kjedet.KjedetMengde;

public class Medlem {
	private String navn;
	private MengdeADT<Hobby> hobbyer;
	private int statusIndeks;

	public <T> Medlem() {
		navn = null;
		hobbyer = new KjedetMengde<Hobby>();
		statusIndeks = 0;
	}

}
