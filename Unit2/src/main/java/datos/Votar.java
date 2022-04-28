package datos;

import java.util.Scanner;

/**
 *Usando condicionales
 * @author Daniel Castro
 */
public class Votar {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int edad;
        
        System.out.println("Ingresa tu edad");
        edad = in.nextInt();
        
        if (edad >=18) {
            System.out.println("Puedes votar");
        } else {
            System.out.println("No Puedes votar");
        }
 {
            
        }
    }
}
