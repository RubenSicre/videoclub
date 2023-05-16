package videoclub;
/**
 * The rental class represents a customer renting a movie.
 */
public class Alquiler {

    private Pelicula pelicula;
    private int diasAlquilado;

    public Alquiler(Pelicula pelicula, int diasAlquilado) {
        this.pelicula = pelicula;
        this.diasAlquilado = diasAlquilado;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public int getDiasAlquilado() {
        return diasAlquilado;
    }

    public double getImporte() {
        double importe = 0;
        switch (getPelicula().getCodigoPrecio()) {
            case Pelicula.REGULAR:
                importe += 2;
                if (getDiasAlquilado() > 2) {
                    importe += (getDiasAlquilado() - 2) * 1.5;
                }
                break;
            case Pelicula.ESTRENO:
                importe += getDiasAlquilado() * 3;
                break;
            case Pelicula.INFANTIL:
                importe += 1.5;
                if (getDiasAlquilado() > 3) {
                    importe += (getDiasAlquilado() - 3) * 1.5;
                }
                break;
            default:
                break;
        }
        return importe;
    }

    public int getPuntosAlquilerFrecuente() {
        // añadido la nueva característica
        if ((getPelicula().getCodigoPrecio() == Pelicula.ESTRENO) && getDiasAlquilado() > 1) {
            return 2;
        }
        return 1;
    }

}
