package ar.edu.unlam.basica2.ComposicionTragamonedas;

public class Tambor {

	private Integer cantidadDeCaras;
	private Integer posicion=1;

	public Tambor(Integer cantidadDeCaras) {
		this.cantidadDeCaras=cantidadDeCaras;
	}

	public void girar() {
		this.posicion = (int)(Math.random()*10+1);

	}

	public Integer getPosicion() {
		return posicion;
	}

	public void setPosicion(Integer posicion) {
		this.posicion = posicion;
	}

	public Integer getCantidadDeCaras() {
		return cantidadDeCaras;
	}


}
