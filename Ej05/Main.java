package Ej05;

public class Main {
    public static void main(String[] args) {
    Cuenta c1 = new Cuenta();
    c1.generarCuenta();
    c1.consultarDatos();
    c1.ingresar(1000);
    c1.consultarSaldo();
    c1.extraccionRapida();
    c1.consultarSaldo();
    c1.retirar(5000);
    c1.consultarSaldo();
    c1.ingresar(1000);
    c1.consultarSaldo();
    c1.retirar(500);
    c1.consultarSaldo();



    }
}
