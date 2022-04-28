package Unidad3.Test;


import Unidad3.Automovil;



/**
 *
 * @author Daniel
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automovil a = new Automovil();
        
       a.setMarca("Ford");
       a.setColor("Blanco");
       a.setModelo("1998");
        
        System.out.println(a);
    }
    
}
