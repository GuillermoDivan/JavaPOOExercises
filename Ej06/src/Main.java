public class Main {
    public static void main(String[] args) {
        Cafetera c1 = new Cafetera();
        c1.setCapacidadMaxima(100);
        c1.setCantidadActual(75);
        c1.mostrarCafetera();
        c1.servirTaza(25);
        c1.vaciarCafetera();
        c1.agregarCafe(15);
        c1.servirTaza(25);
        c1.llenarCafetera();
        c1.servirTaza(50);
        c1.mostrarCafetera();


    }
}