package br.edu.formasgeométricasplanas;

public class hexagono {
    private double lado;
    private double area;

    public hexagono() {
        lado = 10;
    }

    public void setLado(double pLado) {
        this.lado = pLado;
    }

    public double getLado() {
        return lado;
    }

    public void calcArea() {
        area = (3 * Math.sqrt(3) * (lado * lado)) / 2;
    }

    public void mostrarArea() {
        System.out.println("Área do hexágono: " + area);
    }
}
