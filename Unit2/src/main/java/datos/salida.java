/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datos;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Daniel Castro Cervantes
 */
public class salida {
    
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Salida estupenda");
        
        JLabel mensaje1 = new JLabel("Hola soy Daniel");
        mensaje1.setBounds(10, 10, 50, 80);
        ventana.add(mensaje1);
        
          JLabel mensaje2 = new JLabel("I Love Java");
        mensaje2.setBounds(10, 70, 80, 90);
        ventana.add(mensaje2);
        
               JLabel mensaje3 = new JLabel("I Need Practice!!!");
        mensaje3.setBounds(10, 50, 90, 100);
        ventana.add(mensaje3);
        
        
        ventana.setSize(600, 400);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
