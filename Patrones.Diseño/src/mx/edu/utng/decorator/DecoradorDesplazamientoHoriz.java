package mx.edu.utng.decorator;

/**
 *
 * @author Carlos Saul
 */
public class DecoradorDesplazamientoHoriz extends DecoradorDesplazamiento {

    public DecoradorDesplazamientoHoriz(IVentana v) {
        super(v);
    }
    // ---------------------------

    @Override
    public void dibujar(int col, int fila) {
        // Dibujar la ventana
        this.getVentana().dibujar(col, fila);
        // Agregar barra de desplazamiento
        this.dibujarBarraDespHorizontal();
    }
    // ---------------------------

    private void dibujarBarraDespHorizontal() {
        System.out.println("Se agrego una barra de desplazamiento horizontal");
    }

}
