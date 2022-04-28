package Unidad3;

/**
 *
 * @author Daniel
 */
public class Pickup extends Truck {
    private String capacidad;

    public Pickup() {
    }

    public Pickup(String capacidad) {
        this.capacidad = capacidad;
    }

    public Pickup(String capacidad, String combustible, String marca) {
        super(combustible, marca);
        this.capacidad = capacidad;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return super.toString() + "capacidad=" + capacidad + '}';
    }
  
}
