package Servicios;
import Entidades.Raices;

public class ServicioRaices {
    public double getDiscriminante(Raices raices){
        double discriminante = (Math.pow(raices.getCoeficienteB(), 2)) - 4
                * raices.getCoeficienteA() * raices.getCoeficienteC();
        return discriminante;
    }

    public boolean tieneRaices(Raices raices){
        boolean tieneRaices = false;
        if (raices.getDiscriminante() > 0){ tieneRaices = true; }
        return tieneRaices;
    }

    public boolean tieneRaiz(Raices raices){
        boolean tieneRaiz = false;
        if (raices.getDiscriminante() == 0){ tieneRaiz = true; }
        return tieneRaiz;
    }

    public void obtenerRaices(Raices raices){
        if (tieneRaices(raices)) { System.out.println("Las dos posibles soluciones."); }
    }

    public void obtenerRaiz(Raices raiz){
        if (tieneRaices(raiz)) { System.out.println("Las única solución posible."); }
    }

    public void calcular(Raices raices){
        if (tieneRaices(raices)) { obtenerRaices(raices); }
        else if (tieneRaiz(raices)) { obtenerRaiz(raices); }
        else {
            System.out.println("No existe solución posible.");
        }
    }

}


/*
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
 */
