package InstrumentoUnidad2;

import java.util.Scanner;

/**
 *
 * @author Daniel Castro Cervantes
 */

public class EstudiantesCalificacion {

   public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double examen, asistencia, tareas, califE, califA, califT, califF;
        
        System.out.println("Ingresa calificación del examen: ");
        examen = in.nextDouble();
        
        System.out.println("Ingresa porcentaje de asistencia: ");
        asistencia = in.nextDouble();
        
        System.out.println("Ingresa porcentaje de tareas: ");
        tareas = in.nextDouble();
        
        califE = examen * 0.60;
        califA = asistencia * 0.20;
        califT = tareas * 0.20;
        califF = califE + califA + califT;
        
        System.out.println("La calificación final es: " + califF);
        
    }   
}
