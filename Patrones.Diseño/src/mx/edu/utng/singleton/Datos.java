package mx.edu.utng.singleton;

public class Datos {
	private String tipo;
	private String acto;
	private String juzgado;
	private String libro;
	
	public String getLibro() {
		return libro;
	}

	public void setLibro(String libro) {
		this.libro = libro;
	}

	public String getNumActa() {
		return numActa;
	}

	public void setNumActa(String numActa) {
		this.numActa = numActa;
	}

	private String numActa;

	public Datos() {
		// TODO Auto-generated constructor stub
	}

	public String getTipoAc() {
		return tipo;
	}

	public void setTipoAct(String tipo) {
		this.tipo = tipo;
	}

	public String getActo() {
		return acto;
	}

	public void setActo(String acto) {
		this.acto = acto;
	}

	public String getJuzado() {
		return juzgado;
	}

	public void setJuzgado(String juzgado) {
		this.juzgado = juzgado;
	}

	
	
}
