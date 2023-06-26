package Servicios;

import Entidades.Figura;
import Entidades.Hexagono;
import java.util.Scanner;

public class ServicioHexagono {

    public Hexagono crearHexagono(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la base del hexágono");
        int base = input.nextInt();
        System.out.println("Ingrese la altura del hexágono");
        int altura = input.nextInt();
        System.out.println("Ingrese el apotema del hexágono");
        int apotema = input.nextInt();
        return new Hexagono(base, altura, apotema);
    }
    public double calcularPerimetro(Figura figura){
        double perimetro = figura.getBase() * 6;
        System.out.println("El perimetro es "+ perimetro+ ".");
        return perimetro;
    }
    public double calcularArea(Figura figura){
        double per = calcularPerimetro(figura);
        double area = (per * figura.getApotema()) / 2;
        System.out.println("El area es "+ area+ ".");
        return area;
    }
}
