package Servicios;

import Entidades.Vehiculo;
import java.util.Scanner;

public class ServicioVehiculo {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Vehiculo crearVehiculo(){
        String tipoInput = "";

        System.out.println("Ingrese la marca del vehículo");
        String marcaInput = input.next();
        System.out.println("Ingrese el modelo del vehículo");
        String modeloInput = input.next();
        System.out.println("Ingrese el año del vehículo");
        int anioInput = input.nextInt();

        do {
            System.out.println("Ingrese el tipo de vehículo. Considere que puede ser"
                    + " Bicicleta, Motocicleta o Automovil.");
            tipoInput = input.next().toLowerCase();

        } while (!tipoInput.equals("automovil") &&
                !tipoInput.equals("motocicleta") &&
                !tipoInput.equals("bicicleta"));

        Vehiculo v1 = new Vehiculo(marcaInput, modeloInput, anioInput, tipoInput);

        return v1;
    }

    public double moverse(Vehiculo vehiculo){
        System.out.println("¿Cuántos segundos estuvo en movimiento el vehículo?");
        int segundos = input.nextInt();
        double metros = 0;

        switch (vehiculo.getTipo()) {
            case "automovil" : metros = segundos * 3; break;
            case "motocicleta" : metros = segundos * 2; break;
            case "bicicleta" : metros = segundos; break;
        }

        return frenar(vehiculo, metros);
    }

    static double frenar(Vehiculo vehiculo, double metros){
        double frenarMetros;
        if (!vehiculo.getTipo().equals("bicicleta")) {
            frenarMetros = 2 + metros; }
        else { frenarMetros = metros; }
    return frenarMetros;
    }
}

/*
Moverse: Es la cantidad de metros que avanzará por segundo.
Frenar: Dejará de avanzar y se frenará 2 metros más adelante.
En el caso de la bicicleta, se frenará y no avanzará
más metros.
Un automóvil avanza 3 metros por segundo.
Una motocicleta avanza 2 metros por segundo.
Una bicicleta avanza 1 metro por segundo.
Crear una clase "Vehículo" con atributos como "marca", "modelo", "año" y "tipo"
(En tipo, vamos a indicar si es un
automóvil, una motocicleta, o una bicicleta).
El vehículo debe tener los métodos de moverse y frenar:
Referencias:
-
Una vez realizado el programa, crear 3 vehículos diferentes
(entre todos elegir que tipo de vehículo es), y mostrar por
pantalla cuanto avanzan si se mueve durante 5 segundos,
durante 10 segundos y durante 1 minuto. Luego mostrar que
vehículo logró llegar más lejos luego de frenar, tras avanzar durante 5 minutos,
y cual fue la cantidad de metros que
avanzó. */
