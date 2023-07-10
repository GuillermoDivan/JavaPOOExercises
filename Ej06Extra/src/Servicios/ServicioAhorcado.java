package Servicios;
import Entidades.Ahorcado;
import java.util.Scanner;


public class ServicioAhorcado {
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego(){
        System.out.println("Ingrese la palabra a adivinar.");
        String palabraAdivinar = input.next();
        System.out.println("Ingrese la cantidad de intentos que desea tener.");
        int intentos = input.nextInt();
        int cantidadEncontradas = 0;
        int longitudPalabra = palabraAdivinar.length();
        String[] palabraGuiones = new String[longitudPalabra];
        String[] palabraSecreta = new String[longitudPalabra];
        for (int i = 0; i < longitudPalabra; i++){
            palabraSecreta[i] = palabraAdivinar.substring(i,i+1);
            palabraGuiones[i] = " _ ";
        }
        return new Ahorcado(palabraSecreta, longitudPalabra, palabraGuiones,
                cantidadEncontradas, intentos);
    }

   public void buscarLetra(Ahorcado ahorcado) {
       longitud(ahorcado);
       int intentos = ahorcado.getCantidadIntentosMaximos();
       for (int i = 0; i < intentos; i++) {
           intentos(ahorcado);
           String[] auxiliar = ahorcado.getPalabraGuiones();
           boolean hallada = false;
           System.out.println("Ingrese una letra.");
           String letraBuscada = input.next();

           for (int j = 0; j < ahorcado.getLongitudPalabra(); j++) {
               if (letraBuscada.equalsIgnoreCase(ahorcado.getPalabraABuscar()[j])) {
                   auxiliar[j] = letraBuscada;
                   hallada = true;
               }
           }
           ahorcado.setPalabraGuiones(auxiliar);
           if (hallada) {
               System.out.println("¡La letra se encuentra en la palabra!");
               completarGuiones(ahorcado);
               i--;
           } else {
               System.out.println("La letra no se encuentra...");
               completarGuiones(ahorcado);
               ahorcado.setCantidadIntentosMaximos(ahorcado.getCantidadIntentosMaximos() - 1);
           }

           boolean confirma = false;
           for (int k = 0; k < ahorcado.getLongitudPalabra(); k++) {
               if (ahorcado.getPalabraABuscar()[k].equals(ahorcado.getPalabraGuiones()[k])) {
                   confirma = true;
               } else { confirma = false; break;}
           }

           if (confirma) {
               System.out.println("¡FELICIDADES! Has ganado.");
               return;
           }
       }

   }

    private void longitud(Ahorcado ahorcado){
        System.out.println("La palabra tiene "+ ahorcado.getLongitudPalabra()+ " letras." );
    }

    private void intentos(Ahorcado ahorcado){
        System.out.println("Te quedan "+ ahorcado.getCantidadIntentosMaximos()+ " intentos. " +
                "Usalos sabiamente." );
    }
    private void completarGuiones(Ahorcado ahorcado){
        for (int i = 0; i < ahorcado.getLongitudPalabra(); i++){
            System.out.print(ahorcado.getPalabraGuiones()[i]);
        }
        System.out.println("");
    }


}
