package datos;

import java.util.Scanner;

/**
 *Ejercicio que invierte tres números
 * @author Daniel Castro
 * @author 26 de enero del 2022
 */
public class AlReves {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1;
        double num2, num3;
        
        System.out.println("ingresa tres numeros   ");
        num1 = in.nextDouble();
        num2 = in.nextDouble();
        num3 = in.nextDouble();
        
        System.out.println(num3 + "" + num2 + "" + num1);
    }
    
}
