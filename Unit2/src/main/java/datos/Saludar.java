package datos;

import java.util.Scanner;

/**
 *Ejercicio que solicita el nombre del usuario y lo saluda
 * @author Daniel Castro
 */
public class Saludar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        String nombre; //Declar variable cadena
        
        System.out.print("Ingresa tú nombre  ");
        nombre = in.nextLine();
        
        System.out.println("Hello " + nombre);
    }
    
}
