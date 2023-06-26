package Servicios;

import Entidades.Figura;
import Entidades.Triangulo;
import java.util.Scanner;

public class ServicioTriangulo {

    public Triangulo crearTriangulo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la base del triangulo");
        int base = input.nextInt();
        System.out.println("Ingrese la altura del triangulo");
        int altura = input.nextInt();
        System.out.println("Ingrese el segundo lado del triangulo");
        int ladoA = input.nextInt();
        System.out.println("Ingrese el tercer lado del triangulo");
        int ladoB = input.nextInt();
        return new Triangulo(base, altura, ladoA, ladoB);
    }

    public double calcularPerimetro(Figura figura){
        double perimetro = figura.getBase() + figura.getLadoA() + figura.getLadoB();
        System.out.println("El perimetro es "+ perimetro+ ".");
        return perimetro;
    }
    public double calcularArea(Figura figura){
        double area = (figura.getBase() * figura.getAltura()) / 2;
        System.out.println("El area es "+ area+ ".");
        return area;
    }
}
