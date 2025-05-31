package br.edu.principal;

import br.edu.formasgeométricasplanas.*;
import br.edu.formasgeometricasEspaciais.*;

public class Principal {
    public static void main(String[] args) {

        System.out.println("FIGURAS GEOMÉTRICAS PLANAS");

        System.out.println("\nTriângulo");
        Triangulo fg1 = new Triangulo();
        fg1.setAltura(5);
        fg1.setBase(5);
        fg1.calcArea();
        fg1.mostrarArea();

        System.out.println("\nQuadrado");
        Quadrado fg2 = new Quadrado();
        fg2.setLado(5);
        fg2.calcArea();
        fg2.mostrarArea();

        System.out.println("\nRetângulo");
        Retangulo fg3 = new Retangulo();
        fg3.setAltura(5);
        fg3.setBase(5);
        fg3.calcArea();
        fg3.mostrarArea();

        System.out.println("\nCírculo");
        Circulo fg4 = new Circulo();
        fg4.setRaio(5);
        fg4.calcArea();
        fg4.mostrarArea();

        System.out.println("\nLosango");
        Losango fg5 = new Losango();
        fg5.setMaiorDiagonal(5);
        fg5.setMenorDiagonal(5);
        fg5.calcArea();
        fg5.mostrarArea();

        System.out.println("\nTrapézio");
        Trapezio fg6 = new Trapezio();
        fg6.setMaiorBase(5);
        fg6.setMenorBase(5);
        fg6.setAltura(5);
        fg6.calcArea();
        fg6.mostrarArea();

        System.out.println("\nParalelogramo");
        Paralelogramo fg7 = new Paralelogramo();
        fg7.setAltura(5);
        fg7.setBase(5);
        fg7.calcArea();
        fg7.mostrarArea();

        System.out.println("\nHexágono");
        hexagono fg8 = new hexagono();
        fg8.setLado(5);
        fg8.calcArea();
        fg8.mostrarArea();

        System.out.println("\nPentágono");
        Pentagono fg9 = new Pentagono();
        fg9.setPerimetro(5);
        fg9.setApotema(5);
        fg9.calcArea();
        fg9.mostrarArea();

        System.out.println("\nFIGURAS GEOMÉTRICAS ESPACIAIS");

        System.out.println("\nCubo");
        Cubo fg10 = new Cubo();
        fg10.setAresta(5);
        fg10.calcAreaBase();
        fg10.calcAreaLateral();
        fg10.calcAreaTotal();
        fg10.calcVolume();
        fg10.mostrarAreaBase();
        fg10.mostrarAreaLateral();
        fg10.mostrarAreaTotal();
        fg10.mostrarVolume();

        System.out.println("\nPrisma");
        Prisma fg11 = new Prisma();
        fg11.setAresta(5);
        fg11.calcAreaBase();
        fg11.calcAreaLateral();
        fg11.calcAreaTotal();
        fg11.calcVolume();
        fg11.mostrarAreaBase();
        fg11.mostrarAreaLateral();
        fg11.mostrarAreaTotal();
        fg11.mostrarVolume();

        System.out.println("\nEsfera");
        Esfera fg12 = new Esfera();
        fg12.setRaio(5);
        fg12.calcArea();
        fg12.mostrarVolume();

        System.out.println("\nPirâmide");
        Piramide fg13 = new Piramide();
        fg13.setLado(5);
        fg13.setLadoBase(5);
        fg13.setAltura(5);
        fg13.calcAreaBase();
        fg13.calcAreaLateral();
        fg13.calcAreaTotal();
        fg13.calcVolume();
        fg13.mostrarAreaBase();
        fg13.mostrarAreaLateral();
        fg13.mostrarAreaTotal();

        System.out.println("\nCone");
        Cone fg14 = new Cone();
        fg14.setRaio(5);
        fg14.setGeratriz(5);
        fg14.setAltura(5);
        fg14.calcAreaBase();
        fg14.calcAreaLateral();
        fg14.calcAreaTotal();
        fg14.calcVolume();
        fg14.mostrarAreaBase();
        fg14.mostrarAreaLateral();
        fg14.mostrarAreaTotal();
        fg14.mostrarVolume();

        System.out.println("\nCilindro");
        Cilindro fg15 = new Cilindro();
        fg15.setRaio(5);
        fg15.setAltura(5);
        fg15.calcAreaBase();
        fg15.calcAreaTotalBase();
        fg15.calcAreaLateral();
        fg15.calcAreaTotal();
        fg15.calcVolume();
        fg15.mostrarAreaBase();
        fg15.mostrarAreaTotalBase();
        fg15.mostrarAreaLateral();
        fg15.mostrarAreaTotal();
        fg15.mostrarVolume();

        System.out.println("\nParalelepípedo");
        Paralelepipedo fg16 = new Paralelepipedo();
        fg16.setComprimento(5);
        fg16.setLargura(5);
        fg16.setAltura(5);
        fg16.calcAreaBase();
        fg16.calcAreaTotal();
        fg16.calcVolume();
        fg16.mostrarAreaBase();
        fg16.mostrarAreaTotal();
        fg16.mostrarVolume();

        System.out.println("\nTetraedro");
        Tetraedro fg17 = new Tetraedro();
        fg17.setAresta(5);
        fg17.calcAreaBase();
        fg17.calcVolume();
        fg17.mostrarAreaBase();
        fg17.mostrarVolume();
    }
}