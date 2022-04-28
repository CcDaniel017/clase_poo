package InstrumentoUnidad2;

import java.util.Scanner;

/**
 *
 * @author Daniel Castro Cervantes
 */
public class EvaluandoFormulas {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        double y = 0;
        double x = 0;
        double a = 0;
        
        System.out.println("Ingrese el valor de \"x \": ");
        x = in.nextInt();
        
        y = ((x + 5) / (2 * (x + 1 )));
        
        a = (Math.pow(y, 2) +x * (x - 2 * y)) / (x * y);
        
        System.out.println("El valor de \" a \" es: + z");
    }
    
}
