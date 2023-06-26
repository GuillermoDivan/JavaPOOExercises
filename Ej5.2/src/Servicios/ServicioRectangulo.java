package Servicios;
import Entidades.Rectangulo;
import Entidades.Figura;
import java.util.Scanner;

public class ServicioRectangulo {

    public Rectangulo crearRectangulo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo");
        int base = input.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        int altura = input.nextInt();
        return new Rectangulo(base, altura);
    }
    public double calcularPerimetro(Figura figura){
        double perimetro = (figura.getBase() + figura.getAltura()) * 2;
        System.out.println("El perimetro es "+ perimetro+ ".");
        return perimetro;
    }
    public double calcularArea(Figura figura){
        double area = figura.getBase() * figura.getAltura();
        System.out.println("El area es "+ area+ ".");
        return area;
    }
}
