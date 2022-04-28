/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Unidad3.Test;

import Unidad3.TractorTrailer;

/**
 *
 * @author Daniel
 */
public class TestUltimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TractorTrailer x = new TractorTrailer();
        
        x.setMarca("New Holland");
        x.setCombustible("Diesel");
        x.setCaballosfuerza("5000 caballos");
        
        System.out.println(x);
    }
    
}
