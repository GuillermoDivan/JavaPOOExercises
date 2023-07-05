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

/*
El programa debe permitir al usuario ingresar los datos de las películas disponibles y los datos de los alquileres
realizados, y mostrar por pantalla un menú con las opciones de cargar una pelicula, hacer una lista de todas las peliculas
disponibles, crear un alquiler, realizar una lista de todos los alquileres, buscar peliculas por titulo o por genero y buscar
alquileres por fecha.
Metodos de ambas entidades (realizar los metodos en las clases de
servicio):
Crear Película
Crear Alquiler
Listar todas las películas disponibles
Listar todas las películas alquiladas
Buscar una película por título (Decir si se existe o no)
Buscar una película por género (Decir si se existe o no)
Buscar un alquiler por fecha (Decir si se existe o no, y si existe, mostrar los datos del alquiler)
Calcular el ingreso total del servicio (El alquiler cuesta $10, por 3 días. Por cada día extra, se aumenta un 10% de
interés.)
El programa debe validar que los datos ingresados por el usuario sean correctos y mostrar mensajes de error en caso
contrario. El programa debe terminar cuando el usuario elija la opción de salir.
Se deben crear al menos 5 películas, junto con todos sus datos.
Se deben realizar 3 alquileres de películas.
Mostrar todas las películas cargadas.
Mostrar todos los alquileres realizados.
Será importante que al realizar el programa, hacer sus respectivos servicios (AlquilerService y PeliculasService).
 */