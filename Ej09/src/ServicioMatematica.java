public class ServicioMatematica {
    public double devolverMayor(Matematica m1){
        double mayor;
    if (m1.getNum1() > m1.getNum2()) {
        mayor = m1.getNum1();
        System.out.println(m1.getNum1() +" es mayor que "+ m1.getNum2());
    } else if (m1.getNum1() < m1.getNum2()) {
        mayor = m1.getNum2();
        System.out.println(m1.getNum1() +" es menor que "+ m1.getNum2());
    } else {
        System.out.println("¡Los números son iguales!");
        mayor = m1.getNum1();
    }
    return mayor;
    }

    public double calcularPotencia(Matematica m1){
        double potencia;

        double mayor = 0; double menor = 0;
        if (m1.getNum1() >= m1.getNum2()) {
            mayor = m1.getNum1(); menor = m1.getNum2();
        } else if (m1.getNum1() < m1.getNum2()) {
            mayor = m1.getNum2(); menor = m1.getNum1();
        }

        int mayorRedondeado = (int) mayor;
        int menorRedondeado = (int) menor;
        potencia = Math.pow(mayorRedondeado, menorRedondeado);
        System.out.println("Siendo el mayor número "+ mayorRedondeado+ " y el menor número "
                + menorRedondeado+ ", la potencia es: "+ (int) potencia+ ".");
        return potencia;
    }

    public double calcularRaiz(Matematica m1) {
        double raiz;

        double mayor = 0; double menor = 0;
        if (m1.getNum1() >= m1.getNum2()) {
            mayor = m1.getNum1(); menor = m1.getNum2();
        } else if (m1.getNum1() < m1.getNum2()) {
            mayor = m1.getNum2(); menor = m1.getNum1();
        }

        int mayorRedondeado = Math.abs((int) mayor);
        int menorRedondeado = Math.abs((int) menor);
        raiz = Math.pow(mayorRedondeado,(1.0/menorRedondeado));
        System.out.println("Siendo el mayor número "+ mayorRedondeado+ " y el menor número "
                + menorRedondeado+ ", la raiz es: "+ raiz+ ".");
        return raiz;

    }
}