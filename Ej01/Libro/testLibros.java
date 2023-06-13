package Ej01.Libro;

public class testLibros {
    public static void main(String[] args) {
        Libro l1 = new Libro();
        Libro l2 = new Libro("123456789", "Rayuela", "Julio Cortázar", 700);

        System.out.println(l2.mostrarLibro());
        System.out.println("---------------------------------");
        l1.cargarLibro();
        System.out.println(l1.mostrarLibro());
    }
}
