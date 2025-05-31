package br.edu.formasgeométricasplanas;

public class Pentagono {
    private double perimetro;
    private double apotema;
    private double area;

    public Pentagono() {
        perimetro = 10;
        apotema = 10;
    }

    public void setPerimetro(double pPerimetro) {
        this.perimetro = pPerimetro;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setApotema(double pApotema) {
        this.apotema = pApotema;
    }

    public double getApotema() {
        return apotema;
    }

    public void calcArea() {
        area = (perimetro * apotema) / 2;
    }

    public void mostrarArea() {
        System.out.println("Área do pentágono: " + area);
    }
}
