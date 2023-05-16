package videoclub;

public class PrecioRegular extends Precio {
    public PrecioRegular() {
        super(REGULAR);
    }
    
    public int getPuntosAlquilerFrecuentes(int diasAlquilado) {
        return 1;
    }
}

class PrecioEstreno extends Precio {
    public PrecioEstreno() {
        super(ESTRENO);
    }
    
    public int getPuntosAlquilerFrecuentes(int diasAlquilado) {
        return diasAlquilado > 1 ? 2 : 1;
    }
}
    

