/*
        Se está realizando una calculadora grafica, y se requiere calcular algunas áreas
        y perímetros de unas figuras geométricas. Las figuras son las siguientes:
            Cuadrado
            Rectángulo
            Triangulo
            Circulo
            Hexágono
            Pentágono
            Rombo
        El usuario debe elegir la figura geométrica, luego debe ingresar el/los dato/s de la figura
        geométrica elegida y le debe
        mostrar por pantalla el área y el perímetro.
        Aclaración: Si el usuario elige una figura, se debe crear un objeto de esa figura
        seleccionada, y realizar los cálculos
        para luego mostrar en pantalla.

 */

package Entidades;

public abstract class Figura {
    private double base;
    private double altura;
    private double ladoA;
    private double ladoB;
    private double radio;
    private double apotema;
    private double perimetro;
    private double area;

    public Figura(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public Figura(double base, double altura, double ladoA, double ladoB) {
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    public Figura(double base, double altura, double apotema) {
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
    }

    public Figura(double radio) { this.radio = radio;}


    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getLadoA() {
        return ladoA;
    }
    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }
    public double getLadoB() {
        return ladoB;
    }
    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getApotema() {
        return apotema;
    }
    public void setApotema(double apotema) {
        this.apotema = apotema;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }

    public double calcularPerimetro(Figura figura){ return perimetro; }
    public double calcularArea(Figura figura){ return area; }
}

