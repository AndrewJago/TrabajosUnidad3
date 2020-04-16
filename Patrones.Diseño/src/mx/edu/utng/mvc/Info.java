package mx.edu.utng.mvc;

public class Info {
	public String nombreTrab;
	public String puesto;
	public String turno;

	public Info() {

	}

	public Info(String nombreTrab, String puesto, String turno) {
		this.nombreTrab = nombreTrab;
		this.puesto = puesto;
		this.turno = turno;
	}

	public String getNombreTab() {
		return nombreTrab;
	}

	public void setNombreTrab(String nombreTrab) {
		this.nombreTrab = nombreTrab;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

}
