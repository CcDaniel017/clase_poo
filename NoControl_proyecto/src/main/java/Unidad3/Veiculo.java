package Unidad3;

/**
 *
 * @author Daniel
 */
public class Veiculo extends Object {
    protected String marca;

    public Veiculo() {
    }

    public Veiculo(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return  "marca=" + marca + '}';
    }
}
