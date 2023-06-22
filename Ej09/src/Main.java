public class Main {
    public static void main(String[] args) {
        Matematica m1 = new Matematica();
        m1.setNum1(Math.random() * 10);
        m1.setNum2(Math.random() * 10);

        ServicioMatematica sm = new ServicioMatematica();
        sm.devolverMayor(m1);
        sm.calcularPotencia(m1);
        sm.calcularRaiz(m1);
    }
}

