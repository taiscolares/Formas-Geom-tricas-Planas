package br.edu.formasgeométricasplanas;

public class Losango {
    private double maiorDiagonal;
    private double menorDiagonal;
    private double area;

    public Losango() {
        maiorDiagonal = 10;
        menorDiagonal = 10;
    }

    public void setMaiorDiagonal(double pMaiorDiagonal) {
        this.maiorDiagonal = pMaiorDiagonal;
    }

    public double getMaiorDiagonal() {
        return maiorDiagonal;
    }

    public void setMenorDiagonal(double pMenorDiagonal) {
        this.menorDiagonal = pMenorDiagonal;
    }

    public double getMenorDiagonal() {
        return menorDiagonal;
    }

    public void calcArea() {
        area = (maiorDiagonal * menorDiagonal) / 2;
    }

    public void mostrarArea() {
        System.out.println("Área do losango: " + area);
    }
}
