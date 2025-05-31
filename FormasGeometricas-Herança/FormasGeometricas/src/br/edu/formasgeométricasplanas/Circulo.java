package br.edu.formasgeométricasplanas;

public class Circulo {
    private double raio;
    private double area;

    public Circulo() {
        raio = 10;
    }

    public void setRaio(double pRaio) {
        this.raio = pRaio;
    }

    public double getRaio() {
        return raio;
    }

    public void calcArea() {
        area = Math.PI * raio * raio;
    }

    public void mostrarArea() {
        System.out.println("Área do círculo: " + area);
    }
}
