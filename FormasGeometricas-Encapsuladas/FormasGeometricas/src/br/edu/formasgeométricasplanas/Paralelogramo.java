
package br.edu.formasgeométricasplanas;
public class Paralelogramo {
    private double base;
    private double altura;
    private double area;

    public Paralelogramo() {
    	base = 10;
    	altura = 10;
    	area = 0;
    	
    } public void setBase(double pBase) {
        base = base;
    } public void setAltura(double pAltura) {
        altura = altura;
    } public void calcArea() {
        area = base * altura;
    } public void mostrarArea() {
        System.out.println("Área: " + area);
    } public double getArea() {
        System.out.println("Área com retorno: " + area);
        return area;
    }
}
