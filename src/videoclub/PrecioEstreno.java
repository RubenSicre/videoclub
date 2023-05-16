package videoclub;

public class PrecioEstreno extends Precio {
    public double getImporte(int dias) {
        return dias * 3;
    }
}
