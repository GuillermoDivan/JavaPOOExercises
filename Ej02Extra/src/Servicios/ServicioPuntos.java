package Servicios;

import Entidades.Puntos;

import java.util.Scanner;

public class ServicioPuntos {
    Scanner input = new Scanner(System.in);
    public Puntos crearPuntos(){
        System.out.println("Ingrese el valor de X1");
        double x1 = input.nextDouble();
        System.out.println("Ingrese el valor de Y1");
        double y1 = input.nextDouble();
        System.out.println("Ingrese el valor de X2");
        double x2 = input.nextDouble();
        System.out.println("Ingrese el valor de Y2");
        double y2 = input.nextDouble();
        return new Puntos(x1, y1, x2, y2);
    }

    public double calcularDistancia(Puntos p1){
        double distancia = Math.sqrt(Math.pow((p1.getX1() - p1.getX2()), 2) +
                Math.pow((p1.getY1() - p1.getY2()), 2));
        System.out.println("La distancia entre los puntos es de "+ distancia+ ".");
        return distancia;
    }
}


/*
 Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html*/