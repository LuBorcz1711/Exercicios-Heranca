package main;
import java.util.Date;
import models.*;

public class Main {
    public static void main(String[] args) {

        Date hoje = new Date();

        System.out.println("Conta Poupança:");
        Poupanca poupanca = new Poupanca("João Vitor da Silva", hoje, 2500, 15);

        poupanca.verSaldo();
        poupanca.calcularRendimento();
        poupanca.verSaldo();

        poupanca.depositar(500);
        poupanca.sacar(100);
        poupanca.sacar(5000);
        poupanca.verSaldo();

        System.out.println("\nConta Corrente:");
        ContaCorrente corrente = new ContaCorrente("Robson Clentin Gançalves", hoje, 200, 10);

        System.out.println("Valor atual do saldo inicial: " + corrente.getSaldo());
        corrente.verSaldo();
        System.out.println("Valor do saldo após movimentação: " + corrente.getSaldo());

        corrente.depositar(500);
        corrente.sacar(100);
        corrente.sacar(5000);
        corrente.verSaldo();

        System.out.println("\nTestando conta com saldo negativo na instânciação:");
        try {
            Conta contaInvalida = new Conta("Gustavo", hoje, -100.0);
        } catch (Exception e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }

    }
}