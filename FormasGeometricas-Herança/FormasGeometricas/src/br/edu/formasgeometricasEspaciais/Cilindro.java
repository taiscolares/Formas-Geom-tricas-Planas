package br.edu.formasgeometricasEspaciais;

public class Cilindro {
    private double raio;
    private double altura;
    private double areaBase;
    private double areaTotalBase;
    private double areaLateral;
    private double areaTotal;
    private double volume;

    public Cilindro() {
        raio = 10;
        altura = 10;
    }

    public void setRaio(double pRaio) {
        raio = pRaio;
    }

    public double getRaio() {
        return raio;
    }

    public void setAltura(double pAltura) {
        altura = pAltura;
    }

    public double getAltura() {
        return altura;
    }

    public void calcAreaBase() {
        areaBase = Math.PI * raio * raio;
    }

    public void calcAreaTotalBase() {
        areaTotalBase = 2 * areaBase;
    }

    public void calcAreaLateral() {
        areaLateral = 2 * Math.PI * raio * altura;
    }

    public void calcAreaTotal() {
        areaTotal = areaLateral + areaTotalBase;
    }

    public void calcVolume() {
        volume = Math.PI * raio * raio * altura;
    }

    public void mostrarAreaBase() {
        System.out.println("Área da base: " + areaBase);
    }

    public void mostrarAreaTotalBase() {
        System.out.println("Área total da base (2 bases): " + areaTotalBase);
    }

    public void mostrarAreaLateral() {
        System.out.println("Área lateral: " + areaLateral);
    }

    public void mostrarAreaTotal() {
        System.out.println("Área total: " + areaTotal);
    }

    public void mostrarVolume() {
        System.out.println("Volume: " + volume);
    }

    public double getAreaBase() {
        return areaBase;
    }

    public double getAreaTotalBase() {
        return areaTotalBase;
    }

    public double getAreaLateral() {
        return areaLateral;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public double getVolume() {
        return volume;
    }
}
