package videoclub;

public abstract class Precio {
    public static final int INFANTIL = 2;
    public static final int ESTRENO = 1;
    public static final int REGULAR = 0;
    
    protected int codigoPrecio;
    
    public Precio(int codigoPrecio) {
        this.codigoPrecio = codigoPrecio;
    }
    
    public int getCodigoPrecio() {
        return codigoPrecio;
    }
    
    public abstract int getPuntosAlquilerFrecuentes(int diasAlquilado);
}
