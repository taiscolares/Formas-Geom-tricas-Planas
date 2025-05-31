package br.edu.formasgeométricasplanas;

public class Triangulo {
    private double base;
    private double altura;
    private double area;

    public Triangulo() {
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
        area = (base * altura) / 2;
    }

    public void mostrarArea() {
        System.out.println("Área do triângulo: " + area);
    }
}
