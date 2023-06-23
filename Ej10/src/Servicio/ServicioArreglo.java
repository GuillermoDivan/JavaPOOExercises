package Servicio;
import Entidades.Arreglo;
import java.util.Arrays;
import java.util.Scanner;

public class ServicioArreglo {
    ServicioArreglo sa1 = new ServicioArreglo();
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Arreglo crearArreglo() {
        System.out.println("Ingrese el tamaño del arreglo");
        int tamanio = input.nextInt();
        return new Arreglo(tamanio);
    }

    public void llenarAleatorio(Arreglo array){
        int random;
        int[] a1 = array.getArray();
        for (int i = 0; i < 50; i++){
            random = (int) Math.random() *100;
            Arrays.fill(a1, i, i+1, random);
        }
        array.setArray(a1);
    }

    public void mostrarArreglo(Arreglo array) {
        int[] a1 = array.getArray();
        for (int i = 0; i < array.getTamanio(); i++) {
            System.out.print("[" + a1[i] + "]");
        }
    }

    public void ordenarArreglo(Arreglo array) {
        int[] a1 = array.getArray();
        Arrays.sort(a1);
        array.setArray(a1);
    }

/*    public Arreglo llenarCopiando(Arreglo array){
        System.out.println("Ingrese el tamaño del arreglo");
        int tamanio = input.nextInt();
        int[] arrayB = new int[tamanio];
        for (int i = 0; i < tamanio; i++){
            arrayB[i] = array[i];
        }
        return arrayB;
    }

    public void llenarMitad05(Arreglo array) {
        Arrays.fill(array, 10, array.getTamanio(), 0.5);
    }
*/
}

/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.*/
