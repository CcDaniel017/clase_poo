package Unidad3;

/**
 *
 * @author Daniel
 */
public class Truck extends Veiculo {
    protected String combustible;

    public Truck() {
    }

    public Truck(String combustible) {
        this.combustible = combustible;
    }

    public Truck(String combustible, String marca) {
        super(marca);
        this.combustible = combustible;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return super.toString() + "combustible=" + combustible + '}';
    }
    
}
