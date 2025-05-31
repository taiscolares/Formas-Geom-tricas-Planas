package br.edu.formasgeométricasplanas;

public class Quadrado {
    private double lado;
    private double area;

    public Quadrado() {
        lado = 10;
    }

    public void setLado(double pLado) {
        this.lado = pLado;
    }

    public double getLado() {
        return lado;
    }

    public void calcArea() {
        area = lado * lado;
    }

    public void mostrarArea() {
        System.out.println("Área do quadrado: " + area);
    }
}
