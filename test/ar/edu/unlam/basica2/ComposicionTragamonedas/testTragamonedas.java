package ar.edu.unlam.basica2.ComposicionTragamonedas;

import static org.junit.Assert.*;

import org.junit.Test;

public class testTragamonedas {
	@Test
	public void testTragamonedasActivar() {
		Tragamonedas miTragamonedas = new Tragamonedas();
		miTragamonedas.activar();
		Integer posicionTamborUno = miTragamonedas.getTamborUno().getPosicion();
		Integer posicionTamborDos = miTragamonedas.getTamborDos().getPosicion();
		Integer posicionTamborTres = miTragamonedas.getTamborTres().getPosicion();
		assertTrue(
				(posicionTamborUno >= 1 && posicionTamborUno <= 10) &&
				(posicionTamborDos >= 1 && posicionTamborDos <= 10) &&
				(posicionTamborTres >= 1 && posicionTamborTres <= 10) 
				);
	}

	@Test
	public void testQueLosTamboresEstenEnUno(){
		Tragamonedas miTragamonedas = new Tragamonedas();
		Integer valorEsperado = 1;
		assertEquals(valorEsperado, miTragamonedas.getTamborUno().getPosicion());
		assertEquals(valorEsperado, miTragamonedas.getTamborDos().getPosicion());
		assertEquals(valorEsperado, miTragamonedas.getTamborTres().getPosicion());
	}

	@Test
	public void testElegirCaraParaEntregarPremio() {
		Tragamonedas miTragamonedas = new Tragamonedas();
		Integer caraEsperada = 1;
		miTragamonedas.valoresIgualesEnTambores(caraEsperada);
		assertTrue(miTragamonedas.gana());
	}
	@Test
	public void testElegirCaraParaQueNoDePremio() {
		Tragamonedas miTragamonedas = new Tragamonedas();
		miTragamonedas.valoresDistintosEnTambores();
		assertFalse(miTragamonedas.gana());
	}
	@Test
	public void testNumeroAleatorio(){
		Tragamonedas miTragamonedas = new Tragamonedas();
		miTragamonedas.activar();
		Integer numeroAleatorio = miTragamonedas.getTamborUno().getPosicion();
		assertTrue(numeroAleatorio >= 1 && numeroAleatorio <= 10);
	}
	@Test 
	public void tesPremio(){
		Tragamonedas miTragamonedas = new Tragamonedas();
		miTragamonedas.activar();

		while (miTragamonedas.gana() == false){
			assertFalse(miTragamonedas.gana());
			miTragamonedas.activar();
		}
		if (miTragamonedas.gana() == true){
			assertTrue(miTragamonedas.gana());
		}
	}
}
