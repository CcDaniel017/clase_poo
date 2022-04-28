package InstrumentoUnidad2;

import java.util.Scanner;

/**
 *
 * @author Daniel Castro Cervantes
 */

public class OperacionesBasicas {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A, B;
        double division, multiplicacion,resta, suma;
        
        
        System.out.println("Ingresa valor de A");
        A = in.nextInt();
        
        System.out.println("Ingresa valor de B");
        B = in.nextInt();
        
                in.nextLine();
        suma=A+B;
        multiplicacion=A*B;
        if(A>B)
            resta=A-B;
        else
            resta=B-A;
        if(B==0)
        {
            division=0;
            System.out.println("No se puede efectuar la divisi\u00F3n.");
        }
        else
            division=A/B;
        
        
        
        System.out.println("Valor de suma: " + suma);
        System.out.println("Valor de resta: " + resta); 
        System.out.println("Valor de division: " + division);
        System.out.println("Valor de multiplicacion: " + multiplicacion);
       
       
    }
        
}  

