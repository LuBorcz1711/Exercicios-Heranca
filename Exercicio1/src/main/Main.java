package main;
import models.Caminhao;
import models.CarroPasseio;

public class Main {
    public static void main(String[] args) {

        CarroPasseio carro1 = new CarroPasseio(500, 190, 70.500, "Onix", "Branco");

        System.out.println("Informações do carro:");
        carro1.obterInformacoesBasicas();
        System.out.println("");
        carro1.obterInfomacoesCarro();
        System.out.println("");

        Caminhao cam1 = new Caminhao(500, 190, 70,550, 2.30, 15.20);

        System.out.println("Informações do caminhão:");
        cam1.obterInformacoesBasicas();
        System.out.println("");
        cam1.obterInformacoesCaminhao();

    }
}