package Servicios;
import Entidades.Cuadrado;
import Entidades.Figura;
import java.util.Scanner;

public class ServicioCuadrado {

    public Cuadrado crearCuadrado(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del lado del cuadrado");
        int base = input.nextInt();
        return new Cuadrado(base, base);
    }

    public double calcularPerimetro(Figura figura){
        double perimetro = figura.getBase() * 4;
        System.out.println("El perimetro es "+ perimetro+ ".");
        return perimetro;
    }
    public double calcularArea(Figura figura){
        double area = Math.pow(figura.getBase(),2);
        System.out.println("El area es "+ area+ ".");
        return area;
    }
}
