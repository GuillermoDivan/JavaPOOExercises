import java.util.Scanner;

public class ServicioCadena {

    public int mostrarVocales(Cadena cadena) {
        String auxiliar = cadena.getFrase();
        int contadorVocales = 0;
        String letra;

        for (int i = 0; i < cadena.getLongitud(); i++) {
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

    public String invertirFrase(Cadena cadena) {
        String auxiliar = cadena.getFrase();
        String letra = "";
        String inversa = "";

        for (int i = cadena.getLongitud(); i > 0; i--) {
            letra = auxiliar.substring(i - 1, i);
            inversa = inversa.concat(letra);
        }
        System.out.println("La frase invertida quedaría así: "+ inversa);
        return inversa;
    }

    public int vecesRepetido(Cadena cadena) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el caracter a buscar");
        String buscado = input.next();
        String auxiliar = cadena.getFrase();
        String letra = "";
        int contadorBuscado = 0;

        for (int i = 0; i < cadena.getLongitud(); i++) {
            letra = auxiliar.substring(i, i + 1);
            if (letra.equalsIgnoreCase(buscado)) {
                contadorBuscado++;
            }
        }
        System.out.println("El caracter buscado se encontró " + contadorBuscado + " veces en la frase.");
        return contadorBuscado;
    }

    public void compararLongitud(Cadena cadena, String frase2) {
        int longitud2 = frase2.length();
        int diferencia = 0;
        if (cadena.getLongitud() > longitud2) {
            diferencia = cadena.getLongitud() - longitud2;
            System.out.println("La frase original es " + diferencia + " caracteres más larga que la segunda frase.");
        } else if (cadena.getLongitud() < longitud2) {
            diferencia = longitud2 - cadena.getLongitud();
            System.out.println("La segunda frase es " + diferencia + " caracteres más larga que la frase original.");
        } else {
            System.out.println("Las frases tienen igual cantidad de caracteres.");
        }
    }

    public void unirFrase(Cadena cadena, String frase2) {
        String unida = cadena.getFrase().concat(frase2);
        System.out.println("Así quedan las frases unidas: " + unida);
    }

    public void reemplazarLetraA(Cadena cadena) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el caracter con que deseas reemplazar las letras A");
        String reemplazo = input.next();
        String auxiliar = cadena.getFrase();
        String letra = "";
        String nuevaCadena = "";

        for (int i = 0; i < cadena.getLongitud(); i++) {
            letra = auxiliar.substring(i, i + 1);
            if (letra.equalsIgnoreCase("a")) {
                letra = reemplazo;
            }
            nuevaCadena = nuevaCadena.concat(letra);

        }
        System.out.println("La cadena reemplazando a es: " + nuevaCadena);


    }

    public boolean contieneCaracter(Cadena cadena) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el caracter que deseas buscar en la frase");
        String buscado = input.next();
        boolean contiene = false;
        String auxiliar = cadena.getFrase();
        String letra = "";

        for (int i = 0; i < cadena.getLongitud(); i++) {
            letra = auxiliar.substring(i, i + 1);
            if (letra.equalsIgnoreCase(buscado)) { contiene = true; break; }
        }

        if (contiene) { System.out.println("La frase contiene el caracter buscado."); }
        else { System.out.println("La frase NO contiene el caracter buscado."); }

        return contiene;
    }

}

