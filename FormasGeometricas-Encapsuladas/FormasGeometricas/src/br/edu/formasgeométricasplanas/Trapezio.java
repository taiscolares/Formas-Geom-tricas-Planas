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
    	area = 0;
    }
    
    public void setMaiorBase(double pMaiorBase) {
        maiorBase = maiorBase;
    } public void setMenorBase(double pMenorBase) {
        menorBase = menorBase;
    } public void setAltura(double pAltura) {
        altura = altura;
    } public void calcArea() {
        area = ((maiorBase + menorBase) * altura) / 2;
    } public void mostrarArea() {
        System.out.println("Área: " + area);
    } public double getArea() {
        System.out.println("Área com retorno: " + area);
        return area;
    }
}