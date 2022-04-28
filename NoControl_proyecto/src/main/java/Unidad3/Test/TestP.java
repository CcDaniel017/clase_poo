/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Unidad3.Test;

import Unidad3.Pickup;

/**
 *
 * @author Daniel
 */
public class TestP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pickup p = new Pickup();
        
        p.setMarca("Ford");
        p.setCombustible("Gasolina");
        p.setCapacidad("5 Pasajeros");
        
        System.out.println(p);
    }
    
}
