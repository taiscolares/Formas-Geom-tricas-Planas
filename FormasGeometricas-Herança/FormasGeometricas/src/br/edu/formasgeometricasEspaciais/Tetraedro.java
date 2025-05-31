package br.edu.formasgeometricasEspaciais;

public class Tetraedro {
    private double aresta;
    private double altura;
    private double area;
    private double diagonal;
    private double areaTotalBase;
    private double areaTotal;
    private double areaBase;
    private double volume;

    public Tetraedro() {
        aresta = 10;
        areaBase = 0;
        volume = 0;
    }

    public void setAresta(double pAresta) {
        aresta = pAresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void calcAreaBase() {
        areaBase = (aresta * aresta) * Math.sqrt(3) / 4;
    }

    public void calcAltura() {
        altura = (aresta * Math.sqrt(6)) / 3;
    }

    public void calcVolume() {
        volume = ((aresta * aresta * aresta) * Math.sqrt(2)) / 12;
    }

    public void calcAreaTotal() {
        areaTotal = 4 * ((aresta * aresta) * Math.sqrt(3) / 4);
        area = areaTotal;
    }

    public void calcDiagonal() {
        diagonal = aresta;
    }

    public void calcAreaTotalBase() {
        areaTotalBase = areaBase;
    }

    public void mostrarAreaBase() {
        System.out.println("Área da Base: " + areaBase);
    }

    public void mostrarVolume() {
        System.out.println("Volume: " + volume);
    }

    public void mostrarAltura() {
        System.out.println("Altura: " + altura);
    }

    public void mostrarAreaTotal() {
        System.out.println("Área Total: " + areaTotal);
    }

    public double getAreaBase() {
        return areaBase;
    }

    public double getVolume() {
        return volume;
    }

    public double getAltura() {
        return altura;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public double getDiagonal() {
        return diagonal;
    }
}
