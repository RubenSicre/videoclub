package videoclub;

public abstract class Pelicula {
    private String titulo;
    private Precio precio;
    
    public Pelicula(String titulo, Precio precio) {
        this.titulo = titulo;
        this.precio = precio;
    }
    
    public Precio getPrecio() {
        return precio;
    }
    
    public void setPrecio(Precio precio) {
        this.precio = precio;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public int getPuntosAlquilerFrecuentes(int diasAlquilado) {
        return precio.getPuntosAlquilerFrecuentes(diasAlquilado);
    }
}