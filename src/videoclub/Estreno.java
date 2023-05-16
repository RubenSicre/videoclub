package videoclub;

public class Estreno extends Pelicula{
    public Estreno(String titulo) {
        super(titulo);
    }

    public int getPuntosAlquilerFrecuente(int diasAlquilada) {
        return (diasAlquilada > 1) ? 2 : 1;
    }

}
