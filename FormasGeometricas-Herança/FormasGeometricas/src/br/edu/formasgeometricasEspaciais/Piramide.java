package br.edu.formasgeometricasEspaciais;

public class Piramide {
    private double lado;
    private double ladoBase;
    private double altura;

    private double areaBase;
    private double areaLateral;
    private double areaTotal;
    private double volume;

    public Piramide() {
        lado = 10;
        ladoBase = 10;
        altura = 10;
    }

    public void setLado(double pLado) {
        lado = pLado;
    }

    public double getLado() {
        return lado;
    }

    public void setLadoBase(double pLadoBase) {
        ladoBase = pLadoBase;
    }

    public double getLadoBase() {
        return ladoBase;
    }

    public void setAltura(double pAltura) {
        altura = pAltura;
    }

    public double getAltura() {
        return altura;
    }

    public void calcAreaBase() {
        areaBase = ladoBase * ladoBase;
    }

    public void calcAreaLateral() {
        areaLateral = (4 * ladoBase * lado) / 2;
    }

    public void calcAreaTotal() {
        areaTotal = areaBase + areaLateral;
    }

    public void calcVolume() {
        volume = (areaBase * altura) / 3;
    }

    public void mostrarAreaBase() {
        System.out.println("Área da base da pirâmide: " + areaBase);
    }

    public void mostrarAreaLateral() {
        System.out.println("Área lateral da pirâmide: " + areaLateral);
    }

    public void mostrarAreaTotal() {
        System.out.println("Área total da pirâmide: " + areaTotal);
    }
    
    public void mostrarVolume() {
        System.out.println("Volume da pirâmide: " + volume);
    }
}
