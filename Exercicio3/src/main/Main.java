package main;
import models.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Informaações de pessoa:");
        Pessoa pessoa = new Pessoa("Tiana", 24, 'f');
        pessoa.obterInformacoesBasicas();

        System.out.println("\nInformações de Cliente:");
        Cliente cliente = new Cliente("João Vitor", 56, 'm', 5000F, 1969);
        cliente.obterInformacoesBasicas();

        System.out.println("\nInformações de Empregado:");
        Empregado emp = new Empregado("Luccas Spineli", 22, 'm', 15600F, "ABC-001");
        emp.obterInformacoesBasicas();

        System.out.println("\nInformações de Gerente:");
        Gerente gerente = new Gerente("Framsiele da Silva", 42, 'f', 25700F, "ABC-002", "Framsiele da Silva");
        gerente.obterInformacoesBasicas();

        System.out.println("\nInformações de Vendedor:");
        Vendedor vend = new Vendedor("Rafael", 25, 'm', 1000, "ABC-003", 150, 50.99F);
        vend.obterInformacoesBasicas();
    }
}