package videoclub;

public class PrecioInfantil extends Precio {
    public PrecioInfantil() {
        super(INFANTIL);
    }
    
    public int getPuntosAlquilerFrecuentes(int diasAlquilado) {
        return 1;
    }
}

