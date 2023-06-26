package Servicios;
import Entidades.Figura;
import Entidades.Circulo;
import java.util.Scanner;

public class ServicioCirculo {

    public Circulo crearCirculo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo");
        int radio = input.nextInt();
        return new Circulo(radio);
    }
    public double calcularPerimetro(Figura figura){
        double perimetro = figura.getRadio() * 2 * Math.PI;
        System.out.println("El perimetro es "+ perimetro+ ".");
        return perimetro;
    }
    public double calcularArea(Figura figura){
        double area = Math.PI * Math.pow(figura.getRadio(),2);
        System.out.println("El area es "+ area+ ".");
        return area;
    }
}
