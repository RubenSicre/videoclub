package videoclub;
import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombre;
    private List<Alquiler> alquileres = new ArrayList<Alquiler>();

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public void agregarAlquiler(Alquiler arg) {
        alquileres.add(arg);
    }

    public String getNombre() {
        return nombre;
    }

    public String extracto() {
        double importeTotal = 0;
        int puntosAlquilerFrecuente = 0;
        String resultado = "Alquileres de " + getNombre() + ":\n";
        for (Alquiler alquiler : alquileres) {
            // añadir puntos por alquiler frecuente
            puntosAlquilerFrecuente += alquiler.getPelicula().getPuntosAlquilerFrecuente(alquiler.getDiasAlquilado());

            // mostrar información de alquiler
            resultado += "\t" + alquiler.getPelicula().getTitulo() + "\t" + String.valueOf(alquiler.getImporte()) + "\n";
            importeTotal += alquiler.getImporte();
        }
        // añadir líneas de resumen
        resultado += "Importe total: " + String.valueOf(importeTotal) + "\n";
        resultado += "Puntos de alquiler frecuente ganados: " + String.valueOf(puntosAlquilerFrecuente);
        return resultado;
    }
}