package models;
import java.util.Date;

public class Conta {
    private String cliente;
    private Date dataAbertura;
    private double saldo;

    public Conta(String cliente, Date dataAbertura, double saldo) {
        this.cliente = cliente;
        this.dataAbertura = dataAbertura;

        if (saldo < 0) {
            System.out.println("O saldo inicial não pode ser negativo!");
            System.exit(1);
        }
        this.saldo = saldo;
    }

    // Getters e Setters
    public String getCliente() {
        return cliente;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente. Valor máximo para saque: " + getSaldo());
            return;
        }
        saldo -= valor;
        System.out.println("Saque de " + valor + " realizado com sucesso.");
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor do depósito deve ser positivo.");
            return;
        }
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
    }

    public void verSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

}
