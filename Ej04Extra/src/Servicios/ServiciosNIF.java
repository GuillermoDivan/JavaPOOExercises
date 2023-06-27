package Servicios;

import Entidades.NIF;

import java.util.Scanner;

public class ServiciosNIF {
    Scanner input = new Scanner(System.in);

    public NIF crearNif() {
        System.out.println("Ingrese el DNI");
        long dni = input.nextLong();
        String letra = calcularLetra(dni);
        return new NIF(dni, letra);
    }

    public String calcularLetra(long dni) {
        String[] tablaPosiciones = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N",
                "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        long calculo = dni % 23;
        System.out.println(calculo);
        calculo = (int) calculo;
        System.out.println(calculo);
        String letra = "";
        for (int i = 0; i < 23; i++) {
            if (i == calculo) {
                letra = tablaPosiciones[i];
                System.out.println(letra);

            }
        } return letra;
    }

    public void mostrarNif(NIF nif){
        System.out.println("El NIF es: "+ nif.getDNI() + "-"+ nif.getLetra());
    }
}
