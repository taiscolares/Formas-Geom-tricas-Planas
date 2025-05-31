package br.edu.formasgeometricasEspaciais;

public class Paralelepipedo {
    private double comprimento;
    private double largura;
    private double altura;

    private double areaBase;
    private double areaTotal;
    private double volume;

    public Paralelepipedo() {
        comprimento = 10;
        largura = 10;
        altura = 10;
    }

    public void setComprimento(double pComprimento) {
        comprimento = pComprimento;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setLargura(double pLargura) {
        largura = pLargura;
    }

    public double getLargura() {
        return largura;
    }

    public void setAltura(double pAltura) {
        altura = pAltura;
    }

    public double getAltura() {
        return altura;
    }

    public void calcAreaBase() {
        areaBase = comprimento * largura;
    }

    public void calcAreaTotal() {
        areaTotal = 2 * (comprimento * largura + comprimento * altura + largura * altura);
    }

    public void calcVolume() {
        volume = comprimento * largura * altura;
    }

    public void mostrarAreaBase() {
        System.out.println("Área da base: " + areaBase);
    }

    public void mostrarAreaTotal() {
        System.out.println("Área total: " + areaTotal);
    }

    public void mostrarVolume() {
        System.out.println("Volume: " + volume);
    }
}
