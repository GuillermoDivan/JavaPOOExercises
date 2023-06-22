import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Cadena c1 = new Cadena();
        //c1.setFrase("Hace mucho frio");

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una palabra o frase");
        c1.setFrase(input.next());

        ServicioCadena sc1 = new ServicioCadena();
        sc1.mostrarVocales(c1);
        sc1.invertirFrase(c1);
        sc1.vecesRepetido(c1);
        sc1.compararLongitud(c1, "Fuego, mantenlo prendido fuego.");
        sc1.unirFrase(c1, "Fuego, mantenlo prendido fuego.");
        sc1.reemplazarLetraA(c1);
        sc1.contieneCaracter(c1);

    }
}
