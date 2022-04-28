package Unidad3;

/**
 *
 * @author Daniel Castro Cervantes
 */
import javax.swing.JOptionPane; 

   public class TestExcepciones {      
       
       public static void main(String[] args) {
            boolean continuar = true; 
            while(continuar) {        
                
                try {                
                   String cadenaDatos = JOptionPane.showInputDialog(null,"Introduce un número entero: ");
                   int numero = Integer.parseInt(cadenaDatos);
                   int cuadrado = numero * numero;
                   System.out.println("El cuadrado de " + numero + " = " + cuadrado);
                   continuar = false;
               } catch(Exception e) {
                  System.out.println(e.getMessage());                
               }            
           }          
       }
   }
