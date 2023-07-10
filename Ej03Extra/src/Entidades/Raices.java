package Entidades;

public class Raices {
    private double A;
    private double B;
    private double C;
    private double discriminante;

    public Raices(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public double getA() {
        return A;
    }

    public void setA(double a) {
        A = a;
    }

    public double getB() {
        return B;
    }

    public void setB(double b) {
        B = b;
    }

    public double getC() {
        return C;
    }

    public void setC(double c) {
        C = c;
    }

    public double getDiscriminante() {
        return discriminante;
    }

    public void setDiscriminante(double discriminante) {
        this.discriminante = discriminante;
    }
}
