package br.edu.formasgeometricasEspaciais;

public class Cubo {
    private double aresta;
    private double areaBase;
    private double areaLateral;
    private double areaTotal;
    private double volume;

    public Cubo() {
        aresta = 10;
    }

    public void setAresta(double pAresta) {
        this.aresta = pAresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void calcAreaBase() {
        areaBase = aresta * aresta;
    }

    public void calcAreaLateral() {
        areaLateral = 4 * (aresta * aresta);
    }

    public void calcAreaTotal() {
        areaTotal = 6 * (aresta * aresta);
    }

    public void calcVolume() {
        volume = aresta * aresta * aresta;
    }

    public void mostrarAreaBase() {
        System.out.println("Área da base do cubo: " + areaBase);
    }

    public void mostrarAreaLateral() {
        System.out.println("Área lateral do cubo: " + areaLateral);
    }

    public void mostrarAreaTotal() {
        System.out.println("Área total do cubo: " + areaTotal);
    }

    public void mostrarVolume() {
        System.out.println("Volume do cubo: " + volume);
    }
}
