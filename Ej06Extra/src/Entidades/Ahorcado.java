package Entidades;

public class Ahorcado {
    String[] palabraSecreta;
    int longitudPalabra;
    String[] palabraGuiones;
    int cantidadLetrasEncontradas;
    int cantidadIntentosMaximos;

    public Ahorcado(String[] palabraABuscar, int longitudPalabra, String[] palabraGuiones, int cantidadLetrasEncontradas,
                    int cantidadIntentosMaximos) {
        this.palabraSecreta = palabraABuscar;
        this.longitudPalabra = longitudPalabra;
        this.palabraGuiones = palabraGuiones;
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
        this.cantidadIntentosMaximos = cantidadIntentosMaximos;
    }

    public Ahorcado() {}

    public String[] getPalabraABuscar() {
        return palabraSecreta;
    }

    public void setPalabraABuscar(String[] palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }

    public int getLongitudPalabra() {
        return longitudPalabra;
    }

    public void setLongitudPalabra(int longitudPalabra) {
        this.longitudPalabra = longitudPalabra;
    }

    public String[] getPalabraGuiones() {
        return palabraGuiones;
    }

    public void setPalabraGuiones(String[] palabraGuiones) {
        this.palabraGuiones = palabraGuiones;
    }

    /*
    public void setPalabraGuiones(int i, String letraBuscada) {
        this.palabraGuiones[i] = letraBuscada;
     */

    public int getCantidadLetrasEncontradas() {
        return cantidadLetrasEncontradas;
    }

    public void setCantidadLetrasEncontradas(int cantidadLetrasEncontradas) {
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
    }

    public int getCantidadIntentosMaximos() {
        return cantidadIntentosMaximos;
    }

    public void setCantidadIntentosMaximos(int cantidadIntentosMaximos) {
        this.cantidadIntentosMaximos = cantidadIntentosMaximos;
    }
}

/*
Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0.
 Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
 Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
 Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
 Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
 Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
Un ejemplo de salida puede ser así:
Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
----------------------------------------------
Ingrese una letra:
z
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 3
---------------------------------------------
Ingrese una letra:
b
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 2
----------------------------------------------
Ingrese una letra:
u
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 1
----------------------------------------------
Ingrese una letra:
q
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Mensaje: Lo sentimos, no hay más oportunidades
 */
