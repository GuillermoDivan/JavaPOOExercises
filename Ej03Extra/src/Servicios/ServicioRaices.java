package Servicios;
import Entidades.Raices;

public class ServicioRaices {
    public double getDiscriminante(Raices raices) {
        double discriminante = (Math.pow(raices.getB(), 2)) - 4
                * raices.getA() * raices.getC();
        return discriminante;
    }

    public void calcular(Raices raices) {
        if (tieneRaices(raices)) {
            obtenerRaices(raices);
        } else if (tieneRaiz(raices)) {
            obtenerRaiz(raices);
        } else {
            System.out.println("No existe solución posible.");
        }
    }

    private boolean tieneRaices(Raices raices) {
        boolean tieneRaices = false;
        if (raices.getDiscriminante() > 0) {
            tieneRaices = true;
        }
        return tieneRaices;
    }

    private boolean tieneRaiz(Raices raices) {
        boolean tieneRaiz = false;
        if (raices.getDiscriminante() == 0) {
            tieneRaiz = true;
        }
        return tieneRaiz;
    }

    private void obtenerRaices(Raices raices) {
        System.out.println("Primera solución: " + (-1* raices.getB())  + (Math.sqrt(Math.pow(raices.getB(), 2) - (4 * raices.getA()  * raices.getC())) / (2 * raices.getA()))
                + "Segunda solución: " + (raices.getB()) + (Math.sqrt(Math.pow(raices.getB(), 2)  - (4 * raices.getA() * raices.getC())) / (2 * raices.getA())));
    }

    private void obtenerRaiz(Raices raiz) {
        System.out.println("Solución: " + (-1* raiz.getB()) + Math.sqrt(Math.pow(raiz.getB(), 2)
                - (4 * raiz.getA() * raiz.getC())) / (2 * raiz.getA()));
    }
}

