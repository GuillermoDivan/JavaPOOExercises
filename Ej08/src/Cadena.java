/*Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
 String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
        una frase que puede ser una palabra o varias palabras separadas por un espacio en
        blanco y a través de los métodos set, se guardará la frase y la longitud de manera
        automática según la longitud de la frase ingresada. Deberá además implementar los
        siguientes métodos:
        a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
        frase ingresada.
        b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
        ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
        c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
        contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
        d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
        e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
        compone la clase con otra nueva frase ingresada por el usuario.
        f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
        con una nueva frase ingresada por el usuario y mostrar la frase resultante.
        g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
        encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
        la frase resultante.
        h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
        ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/

import java.util.Scanner;

public class Cadena {
    private String frase;
    private int longitud;

    public Cadena() {
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        setLongitud(frase);
    }

    public void setLongitud(String frase) {
        this.longitud = frase.length();
    }

    public int mostrarVocales() {
        String auxiliar = frase;
        int contadorVocales = 0;
        String letra;

        for (int i = 0; i < longitud; i++) {
            letra = auxiliar.substring(i, i + 1);
            if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u")) {
                contadorVocales++;
            }
        }
        System.out.println("La palabra/frase tiene " + contadorVocales + " vocales.");
        return contadorVocales;
    }

    public String invertirFrase() {
        String auxiliar = frase;
        String letra = "";
        String inversa = "";

        for (int i = longitud; i > 0; i--) {
            letra = auxiliar.substring(i - 1, i);
            inversa = inversa.concat(letra);
        }
        System.out.println("La frase invertida quedaría así: "+ inversa);
        return inversa;
    }

    public int vecesRepetido() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el caracter a buscar");
        String buscado = input.next();
        String auxiliar = frase;
        String letra = "";
        int contadorBuscado = 0;

        for (int i = 0; i < longitud; i++) {
            letra = auxiliar.substring(i, i + 1);
            if (letra.equalsIgnoreCase(buscado)) {
                contadorBuscado++;
            }
        }
        System.out.println("El caracter buscado se encontró " + contadorBuscado + " veces en la frase.");
        return contadorBuscado;
    }

    public void compararLongitud(String frase2) {
        int longitud2 = frase2.length();
        int diferencia = 0;
        if (longitud > longitud2) {
            diferencia = longitud - longitud2;
            System.out.println("La frase original es " + diferencia + " caracteres más larga que la segunda frase.");
        } else if (longitud < longitud2) {
            diferencia = longitud2 - longitud;
            System.out.println("La segunda frase es " + diferencia + " caracteres más larga que la frase original.");
        } else {
            System.out.println("Las frases tienen igual cantidad de caracteres.");
        }
    }

    public void unirFrase(String frase2) {
        String unida = frase.concat(frase2);
        System.out.println("Así quedan las frases unidas: " + unida);
    }

    public void reemplazarLetraA() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el caracter con que deseas reemplazar las letras A");
        String reemplazo = input.next();
        String auxiliar = frase;
        String letra = "";
        String nuevaCadena = "";

        for (int i = 0; i < longitud; i++) {
            letra = auxiliar.substring(i, i + 1);
            if (letra.equalsIgnoreCase("a")) {
                letra = reemplazo;
            }
            nuevaCadena = nuevaCadena.concat(letra);

        }
        System.out.println("La cadena reemplazando a es: " + nuevaCadena);


    }

    public boolean contieneCaracter() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el caracter que deseas buscar en la frase");
        String buscado = input.next();
        boolean contiene = false;
        String auxiliar = frase;
        String letra = "";

        for (int i = 0; i < longitud; i++) {
            letra = auxiliar.substring(i, i + 1);
            if (letra.equalsIgnoreCase(buscado)) { contiene = true; break; }
        }

        if (contiene) { System.out.println("La frase contiene el caracter buscado."); }
        else { System.out.println("La frase NO contiene el caracter buscado."); }

        return contiene;
    }
}
