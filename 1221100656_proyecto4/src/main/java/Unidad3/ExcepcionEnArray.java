package Unidad3;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Castro Cervantes
 */
public class ExcepcionEnArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] arreglo = {"Esto ", "es ", "un ", "arreglo"};
        boolean continuar = true;

        try {
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número de palabras a mostrar: "));
            for (int i = 0; i < num; i++) {
                JOptionPane.showMessageDialog(null, arreglo[i] + " ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Solo existen 4 elementos en nuestro arreglo");
        }

    }
}
