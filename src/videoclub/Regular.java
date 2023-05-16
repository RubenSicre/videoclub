package videoclub;

public class Regular extends Pelicula{

    public Regular(String titulo ) {
        super(titulo);
    }

    public int getPuntosAlquilerFrecuente(int diasAlquilada) {
        return 1;
    }

    public double getPrecio(int diasAlquilado) {
        double importe = precioBase;
        if (diasAlquilado > diasIniciales) {
            importe += (diasAlquilado - diasIniciales) * precioPorDia;
        }
        return importe;
    }

    @Override
    public double getPrecio(int diasAlquilado) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPrecio'");
    }

}
