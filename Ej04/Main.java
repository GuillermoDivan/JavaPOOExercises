package Ej04;

public class Main {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(4, 2);
        System.out.println("Superficie:"+ r1.perimetroRectangulo());
        System.out.println("Perímetro:"+ r1.superficieRectangulo());
        System.out.println("");
        r1.mostrarRectangulo();
        System.out.println("");

        Rectangulo r2 = new Rectangulo();
        r2.setBase(3);
        r2.setAltura(6);
        System.out.println("Superficie:"+ r2.perimetroRectangulo());
        System.out.println("Perímetro:"+ r2.superficieRectangulo());
        System.out.println("");
        r2.mostrarRectangulo();

    }
}
