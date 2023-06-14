package Ej03;

public class Main {
    public static void main(String[] args) {
        Operacion op1 = new Operacion();
        op1.crearOperacion(25, 5);
        System.out.println(op1.sumar()+ " || "+ op1.restar()+ " || "+ op1.multiplicar()+ " || "+ op1.dividir());
        Operacion op2 = new Operacion(2, 0);
        System.out.println(op2.sumar()+ " || "+ op2.restar()+ " || "+ op2.multiplicar()+ " || "+ op2.dividir());
    }
}
