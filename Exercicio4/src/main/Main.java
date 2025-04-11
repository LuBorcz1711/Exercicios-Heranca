package main;
import models.*;

public class Main {
    public static void main(String[] args) {

        Pocao pocao1 = new Pocao("Astalavista", 4, "Invisibilidade", "Azul claro");
        pocao1.obterInformacoes();
        pocao1.usarPocao();

        System.out.println(" ");
        Escudo escudo = new Escudo("Aladin", 1, 50);
        escudo.obterInformacoes();
        escudo.defenderComEscudo(25);

        System.out.println(" ");
        Espada espada = new Espada("Escalibur", 1, "Diamente", 100);
        espada.obterInformacoes();
        espada.atacarInimigo();
    }
}