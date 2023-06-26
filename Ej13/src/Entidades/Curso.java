package Entidades;

import java.util.Arrays;

public class Curso {
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private boolean turno; // Mañana = True; Tarde = False.
    private int precioPorHora;
    private String[] alumnxs; // Dimensionado en 5 por cupo máximo.
    private int gananciaSemanal;

    public Curso() {}
    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, boolean turno, int precioPorHora, String[] alumnxs) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnxs = alumnxs;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnxs() {
        return alumnxs;
    }

    public void setAlumnxs(String[] alumnxs) {
        this.alumnxs = alumnxs;
    }

    public int getGananciaSemanal() {
        return gananciaSemanal;
    }

    public void setGananciaSemanal(int gananciaSemanal) {
        this.gananciaSemanal = gananciaSemanal;
    }

    @Override
    public String toString() {
        return "Información del curso{" +
                "nombre del curso: '" + nombreCurso + '\'' +
                ", horas por día: " + cantidadHorasPorDia +
                ", días a la semana: " + cantidadDiasPorSemana +
                ", ¿turno mañana? =" + turno +
                ", valor por hora $" + precioPorHora +
                ", lista de alumnxs -> " + Arrays.toString(alumnxs) +
                ", ganancia semanal: " + gananciaSemanal +
                '}';
    }
}
