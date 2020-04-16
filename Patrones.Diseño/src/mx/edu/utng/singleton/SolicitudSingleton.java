package mx.edu.utng.singleton;

public class SolicitudSingleton {
	private static SolicitudSingleton soli;
	private Datos info;
	
	private SolicitudSingleton() {
		info = new Datos();
		
	}
	
	
	public static SolicitudSingleton getInstance(){
	if(soli==null) {
		soli = new SolicitudSingleton();
		System.out.println("Singleton: "+ soli);
	}
	return soli;
	}


	public Datos getInfo() {
		return info;
	}


	public void setInfo(Datos info) {
		this.info = info;
	}
	
	
	
}
