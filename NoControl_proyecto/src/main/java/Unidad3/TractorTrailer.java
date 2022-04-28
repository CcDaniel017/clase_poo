package Unidad3;

/**
 *
 * @author Daniel
 */
public class TractorTrailer extends Truck {
    private String caballosfuerza;

    public TractorTrailer() {
    }

    public TractorTrailer(String caballosfuerza) {
        this.caballosfuerza = caballosfuerza;
    }

    public TractorTrailer(String caballosfuerza, String combustible, String marca) {
        super(combustible, marca);
        this.caballosfuerza = caballosfuerza;
    }

    public String getCaballosfuerza() {
        return caballosfuerza;
    }

    public void setCaballosfuerza(String caballosfuerza) {
        this.caballosfuerza = caballosfuerza;
    }

    @Override
    public String toString() {
        return super.toString() + "caballosfuerza=" + caballosfuerza + '}';
    }
   
}
