package Servicios;

import Entidades.Curso;
import java.util.Scanner;

public class ServicioCurso {
    Scanner input = new Scanner(System.in);
    public Curso crearCurso(){
        System.out.println("Ingrese nombre del curso:");
        String nombreCurso = input.next();
        System.out.println("Ingrese cantidad de horas por día:");
        int horas = input.nextInt();
        System.out.println("Ingrese cantidad de días por semana:");
        int dias = input.nextInt();
        System.out.println("¿Turno mañana o turno tarde? Mañana = 'True', Tarde = 'False'.");
        boolean turnoManiana = input.nextBoolean();
        System.out.println("Ingrese el valor por hora:");
        int valorPorHora = input.nextInt();
        String[] alumnxs = cargarAlumnxs();
        return new Curso(nombreCurso, horas, dias, turnoManiana, valorPorHora, alumnxs);
    }

    public String[] cargarAlumnxs(){
        String[] alumnxs = new String[5];
        for (int i = 0; i < 5; i++ ){
            System.out.println("Ingrese el nombre y apellido de alumnx "+ (i+1));
            alumnxs[i] = input.next();
        }
        return alumnxs;
    }

    public void calcularGananciaSemanal(Curso curso) {
        int gananciaSemanal;
        for (int i = 0; i < 5; i++) {
            gananciaSemanal = curso.getPrecioPorHora() * curso.getCantidadHorasPorDia() * curso.getCantidadDiasPorSemana() * (i+1);
            curso.setGananciaSemanal(gananciaSemanal);}
            System.out.println("La ganancia semanal de " + curso.getNombreCurso() + " es de $" + curso.getGananciaSemanal());;
        }

}
