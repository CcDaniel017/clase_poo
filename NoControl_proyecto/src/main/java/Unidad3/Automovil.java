package Unidad3;

/**
 *
 * @author Daniel
 */
public class Automovil extends Veiculo {
   private String color;
   private String modelo;

    public Automovil() {
    }

    public Automovil(String color, String modelo) {
        this.color = color;
        this.modelo = modelo;
    }

    public Automovil(String color, String modelo, String marca) {
        super(marca);
        this.color = color;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return super.toString() + "color=" + color + ", modelo=" + modelo + '}';
    }
}
