package Servicios;
import Entidades.Alquiler;
import Entidades.Pelicula;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ServicioAlquiler {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alquiler> peliculasAlquiladas = new ArrayList<>();
    ServicioPelicula sp;

    public ServicioAlquiler(ServicioPelicula sp) {
        this.sp = sp;
    }

    public Alquiler crearAlquiler(){
        System.out.println("Ingrese el título de la película para ver si se encuentra disponible.");
        String titulo = input.next();
        boolean verificacion1 = corroborarExistente(titulo);
        boolean verificacion2 = false;

        if (verificacion1) {
             verificacion2 = corroborarDisponible(titulo); }
        if (verificacion2) {
            Pelicula peliculaAlquilada = sp.obtenerPelicula(titulo);
            System.out.println("Ingrese la fecha de inicio del alquiler (DD / MM / AAAA).");
            String inputInicio = input.next();
            Calendar fechaInicio = pasarFechaACalendar(inputInicio);
            System.out.println("Ingrese la fecha de fin del alquiler (DD / MM / AAAA).");
            String inputFin = input.next();
            Calendar fechaFin = pasarFechaACalendar(inputFin);

            Alquiler alquiler1 = new Alquiler(peliculaAlquilada, fechaInicio, fechaFin);
            calcularAlquiler(alquiler1);
            peliculasAlquiladas.add(alquiler1);
            return alquiler1;
        }
        return null;
    }

    public void mostrarPeliculasAlquiladas(){
        for (int i = 0; i < peliculasAlquiladas.size(); i++){
            System.out.print("["+ peliculasAlquiladas.get(i).getPeliculaAlquilada().getTitulo() +"]");
        }
        System.out.println("");
    }

    public void buscarAlquilerFecha(){
        System.out.println("Ingrese la fecha que desea buscar");
        String inputBuscado = input.next();
        Calendar fechaBuscada = pasarFechaACalendar(inputBuscado);
        ArrayList<Alquiler> alquiladasFecha = new ArrayList();

        for (int i = 0; i < peliculasAlquiladas.size(); i++){
            Calendar fechaInicio = peliculasAlquiladas.get(i).getFechaInicio();
            Calendar fechaFin = peliculasAlquiladas.get(i).getFechaFin();
            if ((fechaBuscada.before(fechaFin)) && (fechaBuscada.after(fechaInicio))) {
                alquiladasFecha.add(peliculasAlquiladas.get(i));
            }
        }

        System.out.println("Lista de películas alquiladas ese día: ");
        for (int i = 0; i < alquiladasFecha.size(); i++){
            System.out.print("[" + alquiladasFecha.get(i).getPeliculaAlquilada().getTitulo() + "]");
        }
        System.out.println("");

        if (alquiladasFecha.size() == 0){
            System.out.println("No hay películas alquiladas ese día.");
        }
    }

    private boolean corroborarExistente(String titulo) {
        boolean flag = false;
        for (int i = 0; i < sp.peliculasExistentes.size(); i++) {
            if (sp.peliculasExistentes.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                flag = true; break;
            } else {
                flag = false; }
            }
        if (flag) {
            System.out.println("La película se encuentra en nuestra base.");
        } else { System.out.println("La película no se encuentra en nuestra base.");
        } return flag;
    }

    private boolean corroborarDisponible(String titulo){
        boolean flag = true;
        for (int i = 0; i < peliculasAlquiladas.size(); i++) {
            if (peliculasAlquiladas.get(i).getPeliculaAlquilada().getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Lo sentimos, la película se encuentra alquilada actualmente.");
                flag = false;
                break;
            }
        }
            if (flag){
                System.out.println("La película se encuentra disponible.");
        } return flag;
    }

    private Calendar pasarFechaACalendar(String fecha) {
        Calendar calendario = new GregorianCalendar();
        int dia = Integer.parseInt(fecha.split("/")[0]);
        int mes = Integer.parseInt(fecha.split("/")[1]);
        int anio = Integer.parseInt(fecha.split("/")[2]);
        calendario.set(anio, mes, dia);
        return calendario;
    }

    private void calcularAlquiler(Alquiler alquiler){
        Calendar fechaInicio = alquiler.getFechaInicio();
        Calendar fechaFin = alquiler.getFechaFin();
        long diasAlquiler =  fechaFin.getTimeInMillis() -  fechaInicio.getTimeInMillis();
        diasAlquiler = (int) TimeUnit.MILLISECONDS.toDays(diasAlquiler);
        System.out.println("El alquiler está programado por "+ diasAlquiler +" días.");
        double precio;
        if (diasAlquiler <= 3) {
            precio = 10;
        } else { int diasExtra = (int) diasAlquiler - 3;
            precio = (int) 10 * (1+0.1 * diasExtra); }
        System.out.println("El precio a pagar por el alquiler es de $"+ precio +".");
    }

}






/*
 mostrar por pantalla un menú con las opciones de cargar una pelicula, hacer una lista de todas las peliculas
disponibles, crear un alquiler, realizar una lista de todos los alquileres, buscar peliculas por titulo o por genero y buscar
alquileres por fecha.

Buscar un alquiler por fecha (Decir si se existe o no, y si existe, mostrar los datos del alquiler)

El programa debe validar que los datos ingresados por el usuario sean correctos y mostrar mensajes de error en caso
contrario. El programa debe terminar cuando el usuario elija la opción de salir.
Se deben crear al menos 5 películas, junto con todos sus datos.
Se deben realizar 3 alquileres de películas.
Mostrar todas las películas cargadas.
Mostrar todos los alquileres realizados.
Será importante que al realizar el programa, hacer sus respectivos servicios (AlquilerService y PeliculasService).
 */