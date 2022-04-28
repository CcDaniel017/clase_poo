package Unidad3;

/**
 *
 * @author Daniel Castro Cervantes
 */
public class MiExcepcion extends Exception {

    String mensaje;

    public MiExcepcion(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    @Override
    public String toString() {
        return "MiExcepcion{" + "mensaje=" + mensaje + '}';
    }

}
