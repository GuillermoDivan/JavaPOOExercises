package Servicios;
import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioPelicula {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> peliculasExistentes = new ArrayList<>();

    public ArrayList<Pelicula> getPeliculasExistentes() {
        return peliculasExistentes;
    }

    public Pelicula crearPelicula() {
        System.out.println("Ingrese el título de la película.");
        String titulo = input.next();
        System.out.println("Ingrese el género de la película.");
        String genre = input.next();
        System.out.println("Ingrese el año de la película.");
        int anio = input.nextInt();
        System.out.println("Ingrese la duración de la película (en minutos).");
        int duracion = input.nextInt();
        Pelicula peliCreada = new Pelicula(titulo, genre, anio, duracion);
        peliculasExistentes.add(peliCreada);
        return peliCreada;

    }
    public void mostrarPeliculasExistentes() {
        System.out.println("Lista de películas existentes en la base: ");
        for (int i = 0; i < peliculasExistentes.size(); i++) {
            System.out.print("[" + peliculasExistentes.get(i).getTitulo() + "]");
        }
        System.out.println("");
    }

    public void buscarPorGenre() {
        System.out.println("Elija el genre que le interesa. Opciones 'drama', 'comedia', 'terror'.");
        String opcion = input.next();
        ArrayList<Pelicula> genreElegido = new ArrayList<>();

        for (int i = 0; i < peliculasExistentes.size(); i++) {
            if (peliculasExistentes.get(i).getGenre().equalsIgnoreCase(opcion)) {
                genreElegido.add(peliculasExistentes.get(i));
            }

            if (i + 1 == peliculasExistentes.size()) {
                System.out.println("No hay películas del género en nuestra base.");
                return;
            } else {
                System.out.println("Lista de películas por género:");
                for (int j = 0; j < genreElegido.size(); j++) {
                    System.out.print("[" + genreElegido.get(j).getTitulo() + "]");
                }
                System.out.println("");
            }
        }


    }

    public void buscarPorTitulo() {
        System.out.println("Elija el título que le interesa.");
        String opcion = input.next();
        if (obtenerPelicula(opcion) != null) {
            System.out.println("La película existe en nuestra base.");
        } else {
            System.out.println("La película no existe en nuestra base.");
        }
    }

    public Pelicula obtenerPelicula(String titulo){
        for (int i = 0; i < peliculasExistentes.size(); i++){
            if (peliculasExistentes.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                return peliculasExistentes.get(i);
            }
        } return null;
    }

}



