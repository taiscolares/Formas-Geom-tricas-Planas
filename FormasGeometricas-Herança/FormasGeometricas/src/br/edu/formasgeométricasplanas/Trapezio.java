package br.edu.formasgeométricasplanas;

public class Trapezio {
    private double maiorBase;
    private double menorBase;
    private double altura;
    private double area;

    public Trapezio() {
        maiorBase = 10;
        menorBase = 10;
        altura = 10;
    }

    public void setMaiorBase(double pMaiorBase) {
        this.maiorBase = pMaiorBase;
    }

    public double getMaiorBase() {
        return maiorBase;
    }

    public void setMenorBase(double pMenorBase) {
        this.menorBase = pMenorBase;
    }

    public double getMenorBase() {
        return menorBase;
    }

    public void setAltura(double pAltura) {
        this.altura = pAltura;
    }

    public double getAltura() {
        return altura;
    }

    public void calcArea() {
        area = ((maiorBase + menorBase) * altura) / 2;
    }

    public void mostrarArea() {
        System.out.println("Área do trapézio: " + area);
    }
}
