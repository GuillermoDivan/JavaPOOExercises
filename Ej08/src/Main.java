import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Cadena c1 = new Cadena();
        //c1.setFrase("Hace mucho frio");

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una palabra o frase");
        c1.setFrase(input.next());
        c1.mostrarVocales();
        c1.invertirFrase();
        c1.vecesRepetido();
        c1.compararLongitud("Fuego, mantenlo prendido fuego.");
        c1.unirFrase("Fuego, mantenlo prendido fuego.");
        c1.reemplazarLetraA();
        c1.contieneCaracter();

    }
}
