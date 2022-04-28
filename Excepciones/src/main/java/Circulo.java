/**
 *
 * @author Daniel Castro Cervantes 1221100656
 */
public class Circulo extends Figura {
    private double radio;

    public Circulo() {
    }

    public Circulo(String color) {
        super(color);
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio, double area, double perimetro, String color) {
        super(area, perimetro, color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    
    @Override
    public String toString() {
        return super.toString() + "radio=" + radio + '}';
    }

    @Override
    public double calcularArea() {
        return this.radio*this.radio*3.1416;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * 3.1416 * this.radio;
    }
    
    
}
