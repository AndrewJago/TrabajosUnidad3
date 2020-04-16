package mx.edu.utng.decorator;

/**
 *
 * @author Carlos Saul
 */
public class DecoradorDesplazamientoVert extends DecoradorDesplazamiento {

    public DecoradorDesplazamientoVert(IVentana v) {
        super(v);
    }
    // ---------------------------

    @Override
    public void dibujar(int col, int fila) {
        // Dibujar la ventana
        this.getVentana().dibujar(col, fila);
        // Agregar barra de desplazamiento
        this.dibujarBarraDespVertical();
    }
    // ---------------------------

    private void dibujarBarraDespVertical() {
        System.out.println("Se agrego una barra de desplazamiento vertical");
    }

}
