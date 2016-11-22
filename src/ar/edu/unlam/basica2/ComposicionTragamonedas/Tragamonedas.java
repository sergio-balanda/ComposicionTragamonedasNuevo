package ar.edu.unlam.basica2.ComposicionTragamonedas;

public class Tragamonedas {
	private Tambor tamborUno;
	private Tambor tamborDos;
	private Tambor tamborTres;
	private Boolean seEntregaPremio;

	public Tragamonedas() {
		this.setTamborUno(new Tambor(1));
		this.setTamborDos(new Tambor(1));
		this.setTamborTres(new Tambor(1));
		this.seEntregaPremio=false;
	}

	public void activar(){
		this.getTamborUno().girar();
		this.getTamborDos().girar();
		this.getTamborTres().girar();
	}

	public void valoresIgualesEnTambores(Integer posicion){
		this.getTamborUno().setPosicion(posicion);
		this.getTamborDos().setPosicion(posicion);
		this.getTamborTres().setPosicion(posicion);
	}

	public void valoresDistintosEnTambores(){
		this.getTamborUno().setPosicion(4);
		this.getTamborDos().setPosicion(2);
		this.getTamborTres().setPosicion(6);
	}

	public Boolean gana() {

		if (this.getTamborUno().getPosicion() == this.getTamborDos().getPosicion()
				&& this.getTamborUno().getPosicion() == this.getTamborTres().getPosicion()) {

			this.seEntregaPremio = true;

		} else {
			this.seEntregaPremio = false;
		}

		return this.seEntregaPremio;

	}

	public Tambor getTamborUno() {
		return tamborUno;
	}

	public void setTamborUno(Tambor tamborUno) {
		this.tamborUno = tamborUno;
	}

	public Tambor getTamborDos() {
		return tamborDos;
	}

	public void setTamborDos(Tambor tamborDos) {
		this.tamborDos = tamborDos;
	}

	public Tambor getTamborTres() {
		return tamborTres;
	}

	public void setTamborTres(Tambor tamborTres) {
		this.tamborTres = tamborTres;
	}
}
