/**
 *
 * @author Daniel Castro Cervantes 1221100656
 */
public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(String color) {
        super(color);
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(double base, double altura, double area, double perimetro, String color) {
        super(area, perimetro, color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString() + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public double calcularArea() {
        return this.base * this.altura;
    }

    @Override
    public double calcularPerimetro() {
       return (2*this.base) + (2*this.altura);
    } 
}
