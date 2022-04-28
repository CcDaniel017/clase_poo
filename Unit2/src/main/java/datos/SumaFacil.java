package datos;

import java.util.Scanner;

/**
 *Ejercicio suma de dos números
 * @author Daniel
 */
public class SumaFacil {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a = 0, b = 0;
        int suma = 0;
        
        //Escribir y Leer
        System.out.println("Ingresa número 1 ");
        a = in.nextInt();
        
        System.out.println("Ingresa número 2 ");
        b = in.nextInt();
        
        suma = a + b;
        System.out.println("La suma es\t" + suma);
        
        
    }
    
}
