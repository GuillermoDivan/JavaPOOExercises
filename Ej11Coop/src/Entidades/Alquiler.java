package Entidades;
import java.util.Calendar;
import java.util.ArrayList;

public class Alquiler {
    private Pelicula peliculaAlquilada;
    private Calendar fechaInicio;
    private Calendar fechaFin;
    private double precio;
    private String[] peliculasAlquiladas;

    public Alquiler(Pelicula peliculaAlquilada, Calendar fechaInicio, Calendar fechaFin) {
        this.peliculaAlquilada = peliculaAlquilada;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
    }
    public Alquiler() {
    }
    public Pelicula getPeliculaAlquilada() {
        return peliculaAlquilada;
    }
    public void setPeliculaAlquilada(Pelicula peliculaAlquilada) {
        this.peliculaAlquilada = peliculaAlquilada;
    }
    public Calendar getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Calendar getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(Calendar fechaFin) {
        this.fechaFin = fechaFin;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

