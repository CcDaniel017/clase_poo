package Unidad3.Test;

import Unidad3.Truck;

/**
 *
 * @author Daniel
 */
public class TestT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Truck t = new Truck();
        
        t.setMarca("TOYOTA");
        t.setCombustible("Gasolina");
        
        System.out.println(t);
        
    }
}
