package ar.edu.unlam.basica2.ComposicionTragamonedas;

import static org.junit.Assert.*;

import org.junit.Test;

public class testTambor {

	@Test
	public void testCantidadDeCaras() {
		Integer cantidadDeCaras=6;
		Tambor miTambor = new Tambor(cantidadDeCaras);
		assertTrue(miTambor.getCantidadDeCaras().intValue() == cantidadDeCaras);
	
	}

	@Test
	public void testQueEsteEntreElRango() {
		Integer cantidadDeCaras = 6;
		Tambor miTambor = new Tambor(cantidadDeCaras);
		

			miTambor.girar();
			assertTrue( (miTambor.getPosicion() > 0) && (miTambor.getPosicion() <= cantidadDeCaras) );
			
		
	}
}
