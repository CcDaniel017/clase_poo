package datos.condicionales;

import java.util.Scanner;

/**
 *Ejercicio que indica si un numero es PAR o IMPAR
 * @author Daniel Castro
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double number; //dato de entreda
        
        System.out.println("Ingresa un valor númerico");
        number = in.nextDouble();
        
        if (number % 2 == 0) { //par
            System.out.println("Par");
        } else { //impar
            System.out.println("Impar");
        }
    }
    
}

