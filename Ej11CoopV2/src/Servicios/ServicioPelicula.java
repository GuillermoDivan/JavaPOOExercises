package Servicios;
import Entidades.Pelicula;
import java.util.Scanner;

public class ServicioPelicula {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    private Pelicula[] peliculasExistentes = new Pelicula[5];

    public Pelicula[] getPeliculasExistentes() {
        return peliculasExistentes;
    }

    public void setPeliculasExistentes(Pelicula pelicula, int i) {
        this.peliculasExistentes[i] = pelicula;
    }

    public void crearPelicula() {
        Pelicula p1 = new Pelicula();
        System.out.println("Ingrese el título de la película.");
        p1.setTitulo(input.next());
        System.out.println("Ingrese el género de la película.");
        p1.setGenre(input.next());
        System.out.println("Ingrese el año de la película.");
        p1.setAnio(input.nextInt());
        System.out.println("Ingrese la duración de la película (en minutos).");
        p1.setDuracion(input.nextInt());

        for (int i = 0; i < 5; i++){
            if (getPeliculasExistentes()[i] == null){
                setPeliculasExistentes(p1, i);
                break;
            }
        }

    }

    public void mostrarPeliculasExistentes() {
        System.out.println("Lista de películas existentes en la base: ");
        for (int i = 0; i < 5; i++) {
            if (getPeliculasExistentes()[i] != null) {
            System.out.print("[" + getPeliculasExistentes()[i].getTitulo() + "]");
        }
        }
        System.out.println("");
    }

    public void buscarPorGenre() {
        System.out.println("Elija el genre que le interesa. Opciones 'drama', 'comedia', 'terror'.");
        String opcion = input.next();
        Pelicula[] genreElegido = new Pelicula[5];
        boolean flag = false;

        for (int i = 0; i < 5; i++) {
            if (getPeliculasExistentes()[i] != null) {
                if (getPeliculasExistentes()[i].getGenre().equalsIgnoreCase(opcion)) {
                    genreElegido[i] = getPeliculasExistentes()[i];
                    flag = true;
                }
            }
        }

            if (!flag) {
                System.out.println("No hay películas del género en nuestra base.");
            } else {
                System.out.println("Lista de películas por género:");
                for (int j = 0; j < genreElegido.length; j++) {
                    if (genreElegido[j] != null) {
                        System.out.print("[" + genreElegido[j].getTitulo() + "]");
                    }
                }
                System.out.println("");
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
        for (int i = 0; i < 5; i++){
            if (getPeliculasExistentes()[i] != null) {
                if (getPeliculasExistentes()[i].getTitulo().equalsIgnoreCase(titulo)) {
                    return getPeliculasExistentes()[i];
                }
            }
        } return null;
    }

}



