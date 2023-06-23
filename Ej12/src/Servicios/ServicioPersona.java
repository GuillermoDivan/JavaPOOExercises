package Servicios;
import Entidades.Persona;

import java.util.Date;
import java.util.Scanner;

public class ServicioPersona {
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona(){
        System.out.println("Ingrese su nombre");
        String nombre = input.next();
        System.out.println("anio");
        int anio = input.nextInt();
        System.out.println("mes");
        int mes = input.nextInt();
        System.out.println("dia");
        int dia = input.nextInt();

        Date fechaNacimiento = new Date(anio-1900, mes-1, dia);
        System.out.println(fechaNacimiento);
        Persona p1 = new Persona(nombre, fechaNacimiento);
        return p1;
    }
}


/*
Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior. */