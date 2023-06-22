/*Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual
 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
*/

public class Cafetera {
    private double capacidadMaxima;
    private double cantidadActual;

    public Cafetera() {
    }

    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
        System.out.println("La cafetera está llena.");
    }

    public void servirTaza(int taza) {
        if (cantidadActual < taza) {
            double porcentajeTaza = (cantidadActual * 100) / taza;
            cantidadActual = 0;
            System.out.println("Se ha servido lo que quedaba en la cafetera, aunque sólo alcanzó para llenar el "+ porcentajeTaza+ "% de la taza.");} else
        {cantidadActual -= taza;
            System.out.println("Se ha llenado la taza al 100%.");}
    }

    public void vaciarCafetera() {
        cantidadActual = 0;
        System.out.println("La cafetera está vacía.");
    }

    public void agregarCafe(double cafe) {
        cantidadActual += cafe;
        System.out.println("Se agregó "+ cafe + " de café a la cafetera, que ahora tiene "+ cantidadActual+ ".");
    }

    public String mostrarCafetera() {
        return "La cafetera actual tiene una capacidad máxima de " + capacidadMaxima +
                ", y la cantidad actual de café es de " + cantidadActual + ".";
    }
}
