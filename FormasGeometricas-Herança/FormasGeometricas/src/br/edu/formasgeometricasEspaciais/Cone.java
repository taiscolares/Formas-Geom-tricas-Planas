package br.edu.formasgeometricasEspaciais;

public class Cone {
    private double raio;
    private double geratriz;
    private double altura;

    private double areaBase;
    private double areaLateral;
    private double areaTotal;
    private double volume;

    public Cone() {
        raio = 10;
        geratriz = 10;
        altura = 10;
    }

    public void setRaio(double pRaio) {
        raio = pRaio;
    }

    public double getRaio() {
        return raio;
    }

    public void setGeratriz(double pGeratriz) {
        geratriz = pGeratriz;
    }

    public double getGeratriz() {
        return geratriz;
    }

    public void setAltura(double pAltura) {
        altura = pAltura;
    }

    public double getAltura() {
        return altura;
    }

    public void calcAreaBase() {
        areaBase = Math.PI * (raio * raio);
    }

    public void calcAreaLateral() {
        areaLateral = Math.PI * raio * geratriz;
    }

    public void calcAreaTotal() {
        areaTotal = areaBase + areaLateral;
    }

    public void calcVolume() {
        volume = (1.0 / 3.0) * areaBase * altura;
    }

    public void mostrarAreaBase() {
        System.out.println("Área da base do cone: " + areaBase);
    }

    public void mostrarAreaLateral() {
        System.out.println("Área lateral do cone: " + areaLateral);
    }

    public void mostrarAreaTotal() {
        System.out.println("Área total do cone: " + areaTotal);
    }

    public void mostrarVolume() {
        System.out.println("Volume do cone: " + volume);
    }
}
