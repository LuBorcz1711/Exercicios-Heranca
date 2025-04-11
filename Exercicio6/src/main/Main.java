package main;
import models.*;

public class Main {
    public static void main(String[] args) {
        AlimentoOrganico[] produtos = new AlimentoOrganico[5];

        produtos[0] = new AlimentoOrganico("Maçã", 3.50, true);
        produtos[1] = new AlimentoOrganico("Macarrão", 2.20, false);
        produtos[2] = new AlimentoOrganico("Cenoura", 4.00, true);
        produtos[3] = new AlimentoOrganico("Bala Fini", 5.10, false);
        produtos[4] = new AlimentoOrganico("Alface", 3.00, true);

        System.out.println("Produtos Orgânicos Certificados:");
        for (AlimentoOrganico produto : produtos) {
            if (produto.isCertificado()) {
                System.out.println("- " + produto.getNome() + " | Preço: R$" + produto.getPreco());
            }
        }
    }
}