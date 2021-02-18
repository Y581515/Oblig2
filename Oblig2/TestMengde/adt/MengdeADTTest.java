package adt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.hvl.dat102.exception.EmptyCollectionException;
import no.hvl.dat102.mengde.adt.MengdeADT;

public abstract class MengdeADTTest {
	// Referanse til Koe
	private MengdeADT<Integer> m1;
	private MengdeADT<Integer> m2;
	MengdeADT<Integer> forventetUnion;
	MengdeADT<Integer> forventetSnitt;
	MengdeADT<Integer> forventetDifferanse;

	// Testdata
	private Integer e0 = 1;
	private Integer e1 = 2;
	private Integer e2 = 3;
	private Integer e3 = 4;
	private Integer e4 = 5;

	protected abstract MengdeADT<Integer> reset();

	/**
	 * Hent en ny Koe for hver test.
	 * 
	 * @return
	 */
	@BeforeEach
	public void setup() {

		m1 = reset();
		m1.leggTil(e0);
		m1.leggTil(e1);
		m1.leggTil(e2);

		m2 = reset();
		m2.leggTil(e2);
		m2.leggTil(e3);
		m2.leggTil(e4);

		forventetUnion = reset();
		forventetUnion.leggTil(e0);
		forventetUnion.leggTil(e1);
		forventetUnion.leggTil(e2);
		forventetUnion.leggTil(e3);
		forventetUnion.leggTil(e4);

		forventetSnitt = reset();
		forventetSnitt.leggTil(e2);

		forventetDifferanse = reset();
		forventetDifferanse.leggTil(e0);
		forventetDifferanse.leggTil(e1);

	}

	/**
	 * Test Union metoden.
	 */
	@Test
	public void TestUnion() {
		MengdeADT<Integer> begge = m1.union(m2);
		assertTrue(forventetUnion.equals(begge));

	}

	/**
	 * Test Snitt metoden.
	 */
	@Test
	public void TestSnitt() {
		MengdeADT<Integer> begge = m1.snitt(m2);
		assertTrue(forventetSnitt.equals(begge));
	}

	/**
	 * Test differens metoden.
	 */
	@Test
	public void TestDifferanse() {
		MengdeADT<Integer> begge = m1.differens(m2);
		assertTrue(forventetDifferanse.equals(begge));
	}

	/**
	 * Test undermengde metoden.
	 */
	@Test
	public void TestUndermengde() {
		MengdeADT<Integer> begge = m1.union(m2);
		assertTrue(begge.undermengde(m1));
		assertTrue(begge.undermengde(m2));
		assertTrue(begge.undermengde(begge));


	}

}
