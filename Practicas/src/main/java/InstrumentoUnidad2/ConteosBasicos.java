package InstrumentoUnidad2;

import java.util.Scanner;

/**
 *
 * @author Daniel Castro Cervantes
 */

public class ConteosBasicos {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int inicio, fin;
        
        System.out.println("Ingresa el valor de A");
        inicio = in.nextInt();
        
        System.out.println("Ingresa el valor de B");
        fin = in.nextInt();
                
       for( int x = inicio; x <= fin; x++){
           System.out.println(x);
       }         
    }  
}    

    

