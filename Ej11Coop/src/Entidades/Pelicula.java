package Entidades;
import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private String genre;
    private int anio;
    private int duracion;

    public Pelicula(String titulo, String genre, int anio, int duracion) {
        this.titulo = titulo;
        this.genre = genre;
        this.anio = anio;
        this.duracion = duracion;
    }

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
