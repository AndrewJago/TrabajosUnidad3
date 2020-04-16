package mx.edu.utng.decorator;

/**
 *
 * @author Carlos Saul
 */
public class Ventana implements IVentana {

    public Ventana() {
    }
    // --------------------------------

    @Override
    public void dibujar(int col, int fila) {
        System.out.println("Dibujar una ventana con las siguientes medidas en centimetros [" + col + "], [" + fila + "]");
    }

}
