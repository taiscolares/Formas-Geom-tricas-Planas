package br.edu.formasgeométricasplanas;
public class Circulo {
    private double raio;
    private double area;

    public Circulo() {
    	raio = 10;
    	area = 0;
    	
    } public void setRaio(double pRaio) {
        raio = raio;
    } public double getRaio() {
        return raio;
    } public void calcArea() {
        area = Math.PI * raio * raio;
    } public void mostrarArea() {
        System.out.println("Área: " + area);
    } public double getArea() {
        System.out.println("Área com retorno: " + area);
        return area;
    }
}