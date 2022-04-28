package InstrumentoUnidad2;

/**
 *
 * @author Daniel Castro Cervantes
 */
import java.util.Scanner;

public class DividirSandia {
    
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int s = 0;
        
        System.out.println("Ingrese el peso de la sandía: ");
        s = in.nextInt();
        
        if(s % 2 == 0){
            System.out.println("SI");
        }else{
            System.out.println("NO");    
             }
 
    }
    
}
