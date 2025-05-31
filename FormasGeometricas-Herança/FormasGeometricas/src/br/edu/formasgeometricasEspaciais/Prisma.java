package br.edu.formasgeometricasEspaciais;

public class Prisma {
    private double aresta;  // lado da base quadrada
    private double altura;  // altura do prisma

    private double areaBase;
    private double areaLateral;
    private double areaTotal;
    private double volume;

    public Prisma() {
        aresta = 10;
        altura = 10;
    }

    public void setAresta(double pAresta) {
        aresta = pAresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void setAltura(double pAltura) {
        altura = pAltura;
    }

    public double getAltura() {
        return altura;
    }

    public void calcAreaBase() {
        areaBase = aresta * aresta; // área da base quadrada
    }

    public void calcAreaLateral() {
        areaLateral = 4 * aresta * altura; // perímetro da base * altura
    }

    public void calcAreaTotal() {
        areaTotal = 2 * areaBase + areaLateral;
    }

    public void calcVolume() {
        volume = areaBase * altura;
    }

    public void mostrarAreaBase() {
        System.out.println("Área da base do prisma: " + areaBase);
    }

    public void mostrarAreaLateral() {
        System.out.println("Área lateral do prisma: " + areaLateral);
    }

    public void mostrarAreaTotal() {
        System.out.println("Área total do prisma: " + areaTotal);
    }

    public void mostrarVolume() {
        System.out.println("Volume do prisma: " + volume);
    }
}
