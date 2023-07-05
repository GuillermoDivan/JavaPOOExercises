/*Escribir un programa en Java que simule un servicio de alquiler de películas.
El programa debe tener una clase Pelicula
que represente los datos de una película, como el título, el género, el año y la duración.
El programa también debe tener
una clase Alquiler que represente los datos de un alquiler, como la película alquilada,
la fecha de inicio, la fecha de fin y
el precio.
El programa puede usar la clase Date para manejar las fechas, la clase Arrays para almacenar
y ordenar las películas y
los alquileres, la clase Math para calcular el precio según la duración y el género de la película,
y la clase String para
manipular los textos.
El programa debe permitir al usuario ingresar los datos de las películas disponibles y los datos
de los alquileres
realizados, y mostrar por pantalla un menú con las opciones de cargar una pelicula, hacer una
lista de todas las peliculas
disponibles, crear un alquiler, realizar una lista de todos los alquileres, buscar peliculas
por titulo o por genero y buscar
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
Calcular el ingreso total del servicio (El alquiler cuesta $10, por 3 días. Por cada día extra,
se aumenta un 10% de
interés.)
El programa debe validar que los datos ingresados por el usuario sean correctos y mostrar
mensajes de error en caso
contrario. El programa debe terminar cuando el usuario elija la opción de salir.
Se deben crear al menos 5 películas, junto con todos sus datos.
Se deben realizar 3 alquileres de películas.
Mostrar todas las películas cargadas.
Mostrar todos los alquileres realizados.
Será importante que al realizar el programa, hacer sus respectivos servicios
(AlquilerService y PeliculasService).
 */

package Main;

import Entidades.Alquiler;
import Entidades.Pelicula;
import Servicios.ServicioAlquiler;
import Servicios.ServicioPelicula;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");


        ServicioPelicula sp = new ServicioPelicula();
        ServicioAlquiler sa = new ServicioAlquiler(sp);
        boolean salida = false;

        do {
            System.out.println("Ingrese la opción deseada: 1. Cargar película. | 2. Consultar lista de películas existentes. | 3. Consultar lista " +
                    " de películas por genre. | 4. Consultar si la película está en la base. | 5. Alquilar película. | 6. Consultar lista de películas" +
                    " alquiladas. | 7. Consultar películas alquiladas para un día determinado. | 8. Salida ");
            int opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    Pelicula peli1 = sp.crearPelicula();
                    break;
                case 2:
                    sp.mostrarPeliculasExistentes();
                    break;
                case 3:
                    sp.buscarPorGenre(); //COMPLETAR CUANDO GENRE NO SE ENCUENTRA!!!
                    break;
                case 4:
                    sp.buscarPorTitulo();
                    break;
                case 5:
                    Alquiler alquiler1 = sa.crearAlquiler(); // CORROBORAR CÁLCULO PRECIO ALQUILER...
                    // Porque intereses por día... y porque no está contando exactamente la cantidad de días (de 01/01 a 01/02 = 29...).
                    break;
                case 6:
                    sa.mostrarPeliculasAlquiladas();
                    break;
                case 7:
                    sa.buscarAlquilerFecha();
                    break;
                case 8 : salida = true;
            }
        } while (!salida);

    }
}
