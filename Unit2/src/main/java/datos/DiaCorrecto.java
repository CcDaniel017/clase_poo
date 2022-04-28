package datos;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class DiaCorrecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String dia;
        
        System.out.println("Ingresa el día");
        dia = in.nextLine();
        dia = dia.toLowerCase();
        
        if (dia.equals("Viernes") || dia.equals("sabado") || dia.equals("domingo") || dia.equals("lunes") || dia.equals("martes") || dia.equals("miercoles") || dia.equals("jueves")){
            System.out.println("Día correcto");
    }else {
            
            System.out.println("Día no correcto");
        }
    }
    
}
