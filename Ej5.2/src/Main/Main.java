package Main;
import Entidades.*;
import Servicios.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Elija una figura geométrica: 1. Cuadrado | 2. Rectángulo | 3. Triángulo" +
                " | 4. Círculo | 5. Pentágono | 6. Hexágono | 7. Rombo. ");
        int opcion = input.nextInt();

        switch(opcion){
            case 1:
                ServicioCuadrado sc1 = new ServicioCuadrado();
                Cuadrado c1= sc1.crearCuadrado();
                sc1.calcularPerimetro(c1);
                sc1.calcularArea(c1);
                break;
            case 2:
                ServicioRectangulo sr1 = new ServicioRectangulo();
                Rectangulo r1= sr1.crearRectangulo();
                sr1.calcularPerimetro(r1);
                sr1.calcularArea(r1);
                break;
            case 3:
                ServicioTriangulo st1 = new ServicioTriangulo();
                Triangulo t1= st1.crearTriangulo();
                st1.calcularPerimetro(t1);
                st1.calcularArea(t1);
                break;
            case 4:
                ServicioCirculo sc2 = new ServicioCirculo();
                Circulo c2= sc2.crearCirculo();
                sc2.calcularPerimetro(c2);
                sc2.calcularArea(c2);
                break;
            case 5:
                ServicioPentagono sp1 = new ServicioPentagono();
                Pentagono p1= sp1.crearPentagono();
                sp1.calcularArea(p1);
                break;
            case 6:
                ServicioHexagono sh1 = new ServicioHexagono();
                Hexagono h1= sh1.crearHexagono();
                sh1.calcularArea(h1);
                break;
            case 7:
                ServicioRombo sr2 = new ServicioRombo();
                Rombo r2 = sr2.crearRombo();
                sr2.calcularPerimetro(r2);
                sr2.calcularArea(r2);
                break;
            default:
                System.out.println("Opción no válida.");
        }

    }
}
