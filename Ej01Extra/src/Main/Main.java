/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
NOTA: Dado lo básico del ejercicio, se optó por prescindir de paquete y clase "Servicios".*/

package Main;

import Entidades.Cancion;

public class Main {
    public static void main(String[] args) {
        Cancion c1 = new Cancion("Lo que te da terror", "Gabo Ferro");
        System.out.println(c1.toString());

        Cancion c2 = new Cancion();
        c2.setTitulo("Prófugos");
        c2.setAutor("Gustavo Cerati");
        System.out.println("Título: "+ c2.getTitulo()+ " . Autor: "+ c2.getAutor());
    }
}

/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.*/