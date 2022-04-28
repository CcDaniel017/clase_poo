package Unidad3;

/**
 *
 * @author Daniel Castro Cervantes
 */
public class TestException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            throw new MiExcepcion("A ocurrido una Excepción :) ");
        } catch (MiExcepcion e) {
            System.out.println("excepción: " + e.getMensaje());
        }
    }
}
