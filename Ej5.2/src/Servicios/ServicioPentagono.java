package Servicios;

import Entidades.Figura;
import Entidades.Pentagono;
import java.util.Scanner;

public class ServicioPentagono {

    public Pentagono crearPentagono(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la base del pentágono");
        int base = input.nextInt();
        System.out.println("Ingrese la altura del pentágono");
        int altura = input.nextInt();
        System.out.println("Ingrese el apotema del pentágono");
        int apotema = input.nextInt();
        return new Pentagono(base, altura, apotema);
    }
    public double calcularPerimetro(Figura figura){
        double perimetro = figura.getBase() * 5;
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
