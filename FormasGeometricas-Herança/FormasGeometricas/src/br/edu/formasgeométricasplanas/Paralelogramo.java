package br.edu.formasgeométricasplanas;

public class Paralelogramo {
    private double base;
    private double altura;
    private double area;

    public Paralelogramo() {
        base = 10;
        altura = 10;
    }

    public void setBase(double pBase) {
        this.base = pBase;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double pAltura) {
        this.altura = pAltura;
    }

    public double getAltura() {
        return altura;
    }

    public void calcArea() {
        area = base * altura;
    }

    public void mostrarArea() {
        System.out.println("Área do paralelogramo: " + area);
    }
}
