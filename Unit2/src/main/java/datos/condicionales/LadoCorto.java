package datos.condicionales;

import java.util.Scanner;

/**
 *Ejercicio para saber la distancia de los lados
 * @author Daniel
 */
public class LadoCorto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x1=0,y1=0,x2=0,y2=0,x3=0,y3=0,x4=0,y4=0;
        Scanner in = new Scanner(System.in);  
        
        System.out.println("Ingresa los ocho datos");
        x1 = in.nextDouble();
        y1 = in.nextDouble();
        x2 = in.nextDouble();
        y2 = in.nextDouble();
        x3 = in.nextDouble();
        y3 = in.nextDouble();
        x4 = in.nextDouble();
        y4 = in.nextDouble();
        
        double lado1, lado2, lado3, lado4;
        lado1 = Math.sqrt( Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2);
        lado2 = Math.sqrt( Math.pow((x3 - x2),2) + Math.pow((y3 - y2),2);
        lado3 = Math.sqrt( Math.pow((x4 - x3),2) + Math.pow((y4 - y3),2);
        lado4 = Math.sqrt( Math.pow((x1 - x4),2) + Math.pow((y1 - y4),2);
       
        System.out.println(lado1 + "" + lado2 + "" + lado3 + "" + lado4);
        
        double corto = lado1;
        
        if (coto > lado2){
            corto = lado2;
        }
        if (corto > lado3){
            corto = lado3;
        }
        if (corto > lado4) {
            corto = lado4;
        }
        System.out.println(corto);
    }

