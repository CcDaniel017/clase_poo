import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Daniel Castro Cervantes 1221100656
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
 
do {
        
        System.out.println("=====================================================");
        System.out.println("\t********** MENU DE OPCIONES **********");
        System.out.println("=====================================================");
        System.out.println("\t\t[1] Figuras Rellenas ");
        System.out.println("\t\t[2] Circulo ");
        System.out.println("\t\t[3] Rectangulo ");
        System.out.println("\t\t[4] Triangulo ");
        System.out.println("\t\t[5] Salir ");
        
        System.out.println("\tElige tu opcion:__");
        opcion = teclado.nextInt();
        System.out.println("=====================================================");
        
       switch(opcion) {
                case 1 :
                    System.out.println("~~ FIGURAS RELLENAS ~~");
                       
                    IColoreador fig1 = new CirculoRelleno();
                    IColoreador fig2 = new RectanguloRelleno();
                    IColoreador fig3 = new TrianguloRelleno();
                    
                    fig1.colorear("Verde");
                    fig2.colorear("Rojo");
                    fig3.colorear("Blanco");
                    
                        break;
                case 2 :
                        DecimalFormat decimal=new DecimalFormat("#,##0.00");
                        Figura c = new Circulo(20);
                        c.calcularArea();
                        c.calcularPerimetro();
                        System.out.println("~~ DATOS DEL CIRCULO ~~");
                        System.out.println("Area: "+ c.calcularArea());
                        System.out.println("Perimetro: "+ c.calcularPerimetro());
                        
                        break;

                case 3 :
                            Figura r = new Rectangulo(20, 10);
                        r.calcularArea();
                        r.calcularPerimetro();
                        System.out.println("~~ DATOS DEL RECTANGULO ~~");
                        System.out.println("Perimetro: "+ r.calcularArea());
                        System.out.println("Area: "+ r.calcularPerimetro());
                        
                        break;
                case 4 :
                        Triangulo t = new Triangulo(12, 15);
                        t.calcularArea();
                        t.calcularPerimetro();
                        double m1,m2;
                        System.out.println("~~ DATOS DEL TRIANGULO ~~");
                        System.out.println("Area: "+t.calcularArea());
                        System.out.println("Perimetro: "+t.calcularPerimetro());
                        
                                
                        break;
                case 5 :
                        System.out.println("Adios, Que tenga un lindo dia !!");
                        break;
                default:
                        break;
    }
        System.out.println("=====================================================");
        System.out.println("\n");
        
}while (opcion != 5);
    
    }
}
