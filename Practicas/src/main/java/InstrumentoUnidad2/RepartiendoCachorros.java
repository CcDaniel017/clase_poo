package InstrumentoUnidad2;

import java.util.Scanner;

/**
 *
 * @author Daniel Castro Cervantes
 */

public class RepartiendoCachorros {

    public static void main(String[] args) {
        int C, P, H, A, E;

        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Cuantos cachorros tuvo ");
        C=teclado.nextInt();
        System.out.println("Por cuantos esta conformada la familia de Don Pancho");
        H=teclado.nextInt();
        System.out.println("Con cuantos cachorros tiene planeado quedarse Don Pancho");
        P=teclado.nextInt();
        
        A = C - P - H;
        E = P + A;
         
        System.out.println("Don Panco se quedara en total con  : " + E); 

    }
}

