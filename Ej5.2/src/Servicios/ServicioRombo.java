package Servicios;
import Entidades.Rombo;
import Entidades.Figura;
import java.util.Scanner;

public class ServicioRombo {

    public Rombo crearRombo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del lado del rombo");
        int base = input.nextInt();
        return new Rombo(base, base);
    }
    public double calcularPerimetro(Figura figura){
        double perimetro = figura.getBase() * 4;
        System.out.println("El perimetro es "+ perimetro+ ".");
        return perimetro;
    }
    public double calcularArea(Figura figura){
        double area = (figura.getBase() * figura.getAltura()) / 2;
        System.out.println("El area es "+ area+ ".");
        return area;
    }
}
