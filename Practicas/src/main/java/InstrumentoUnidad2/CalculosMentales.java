package InstrumentoUnidad2;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Daniel Castro Cervantes
 */

public class CalculosMentales {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        float A , B, C, D, E;
        
        System.out.println("Dame una cantidad con decimal ");
        A = in.nextFloat();
        
        B = A + 5;
        C = (float) Math.pow(B, 2);
        D = (float) ((float) C / (0.3333 * A));
        E = (float) Math.pow(D, 3);
        
        System.out.println("" + B);
        System.out.println("" + C);
        System.out.println("" + D);
        System.out.println("" + E);
    }
}