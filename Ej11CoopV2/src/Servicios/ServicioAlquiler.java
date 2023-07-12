package Servicios;
import Entidades.Alquiler;

import java.time.format.DateTimeFormatter;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ServicioAlquiler {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public Alquiler[] peliculasAlquiladas = new Alquiler[5];
    ServicioPelicula sp;

    public ServicioAlquiler(ServicioPelicula sp) {
        this.sp = sp;
    }
    public Alquiler[] getPeliculasAlquiladas() {
        return peliculasAlquiladas;
    }
    public void setPeliculasAlquiladas(Alquiler alquiler, int i) {
        this.peliculasAlquiladas[i] = alquiler;
    }


    public void crearAlquiler(){
        Alquiler alq = new Alquiler();
        System.out.println("Ingrese el título de la película para ver si se encuentra disponible.");
        String titulo = input.next();
        boolean verificacion1 = corroborarExistente(titulo);
        boolean verificacion2 = false;
        if (verificacion1) {
             verificacion2 = corroborarDisponible(titulo); }
        if (verificacion2) {
            System.out.println("Ingrese la fecha de inicio del alquiler (DD / MM / AAAA).");
            String inputInicio = input.next();
            LocalDate fechaInicio = LocalDate.parse(inputInicio,formatoFecha);
            System.out.println("Ingrese la fecha de fin del alquiler (DD / MM / AAAA).");
            String inputFin = input.next();
            LocalDate fechaFin = LocalDate.parse(inputFin,formatoFecha);

            alq.setPeliculaAlquilada(sp.obtenerPelicula(titulo));
            alq.setFechaInicio(fechaInicio);
            alq.setFechaFin(fechaFin);
            calcularAlquiler(alq);

            for (int i = 0; i < 5; i++) {
                if (getPeliculasAlquiladas()[i] == null){
                    setPeliculasAlquiladas(alq, i);
                    break;
                }
            }
            }
        }

    public void mostrarPeliculasAlquiladas(){
        for (int i = 0; i < 5; i++){
            if (getPeliculasAlquiladas()[i] != null) {
            System.out.print("["+ getPeliculasAlquiladas()[i].getPeliculaAlquilada().getTitulo() +"]");
        }
        }
        System.out.println("");
    }

    public void buscarAlquilerFecha(){
        System.out.println("Ingrese la fecha que desea buscar");
        String inputBuscado = input.next();
        LocalDate fechaBuscada = LocalDate.parse(inputBuscado,formatoFecha);
        Alquiler[] alquiladasFecha = new Alquiler[5];

        for (int i = 0; i < 5; i++) {
            if (getPeliculasAlquiladas()[i] != null) {
                LocalDate fechaInicio = getPeliculasAlquiladas()[i].getFechaInicio();
                LocalDate fechaFin = getPeliculasAlquiladas()[i].getFechaFin();
                if ((fechaBuscada.isBefore(fechaFin)) && (fechaBuscada.isAfter(fechaInicio))) {
                    alquiladasFecha[i] = getPeliculasAlquiladas()[i];
                }
            }
        }

        System.out.println("Lista de películas alquiladas ese día: ");
        for (int i = 0; i < 5; i++) {
            if (alquiladasFecha[i] != null) {
                System.out.print("[" + alquiladasFecha[i].getPeliculaAlquilada().getTitulo() + "]");
            }
        }
        System.out.println("");

        if (alquiladasFecha.length == 0){
            System.out.println("No hay películas alquiladas ese día.");
        }
    }

    private boolean corroborarExistente(String titulo) {
        boolean flag = false;
        for (int i = 0; i < 5; i++) {
            if (sp.getPeliculasExistentes()[i].getTitulo().equalsIgnoreCase(titulo)) {
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
        for (int i = 0; i < 5; i++) {
            if (getPeliculasAlquiladas()[i] != null) {
                if (getPeliculasAlquiladas()[i].getPeliculaAlquilada().getTitulo().equalsIgnoreCase(titulo)) {
                    System.out.println("Lo sentimos, la película se encuentra alquilada actualmente.");
                    flag = false;
                    break;
                }
            }
        }
            if (flag){
                System.out.println("La película se encuentra disponible.");
        } return flag;
    }


    private void calcularAlquiler(Alquiler alq){
        LocalDate fechaInicio = alq.getFechaInicio();
        LocalDate fechaFin = alq.getFechaFin();
        long diasAlquiler = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        System.out.println("El alquiler está programado por "+ diasAlquiler +" días.");
        double precio;
        if (diasAlquiler <= 3) {
            precio = 10;
        } else { int diasExtra = (int) diasAlquiler - 3;
            precio = (int) 10 * (1+0.1 * diasExtra); }
        System.out.println("El precio a pagar por el alquiler es de $"+ precio +".");
    }

}
