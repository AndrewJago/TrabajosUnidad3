package mx.edu.utng.decorator;

/**
 *
 * @author Carlos Saul
 */
public abstract class DecoradorDesplazamiento implements IVentana {

    protected IVentana v;
    // --------------------

    public DecoradorDesplazamiento(IVentana v) {
        this.setVentana(v);
    }
    // --------------------

    public IVentana getVentana() {
        return this.v;
    }
    // --------------------

    public void setVentana(IVentana v) {
        this.v = v;
    }
    // --------------------

    @Override
    public void dibujar(int col, int fila) {
        this.getVentana().dibujar(col, fila);
    }
}
