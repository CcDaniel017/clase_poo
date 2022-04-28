/**
 *
 * @author Daniel Castro Cervantes 1221100656
 */
public abstract class Figura {
    protected double area;
    protected double perimetro;
    protected String color="blanco";

    public Figura() {
    }

    public Figura(String color) {
        this.color = color;
    }

    public Figura(double area, double perimetro, String color) {
        this.area = area;
        this.perimetro = perimetro;
        this.color = color;
    }


    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calcularArea();
    
    public abstract double calcularPerimetro();

    @Override
    public String toString() {
        return "Figura{" + "area=" + area + ", perimetro=" + perimetro + ", color=" + color + '}';
    }
    
}
