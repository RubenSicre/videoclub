package videoclub;

public class Infantil extends Pelicula{

    public Infantil(String titulo) {
        super(titulo);
    }

    @Override
    public int getPuntosAlquilerFrecuente(int diasAlquilada) {
        return 1;
    }

    
}
