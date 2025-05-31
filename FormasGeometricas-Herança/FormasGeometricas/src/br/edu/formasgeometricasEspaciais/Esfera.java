package br.edu.formasgeometricasEspaciais;

public class Esfera {
    private double raio;
    private double area;
    private double volume;

    public Esfera() {
        raio = 10;
    }

    public void setRaio(double pRaio) {
        raio = pRaio; 
    }

    public double getRaio() {
        return raio;
    }

    public void calcArea() {
        area = 4 * Math.PI * raio * raio; 
    }

    public void calcVolume() {
        volume = (4.0 / 3.0) * Math.PI * raio * raio * raio; 
    }

    public void mostrarArea() {
        System.out.println("Área da esfera: " + area);
    }

    public void mostrarVolume() {
        System.out.println("Volume da esfera: " + volume);
    }
}
