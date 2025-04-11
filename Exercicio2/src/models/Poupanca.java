package models;
import java.util.Date;

public class Poupanca extends Conta{
    private double rendimentoMensal;

    public Poupanca(String cliente, Date dataAbertura, double saldo, double rendimentoMensal) {
        super(cliente, dataAbertura, saldo);
        this.rendimentoMensal = rendimentoMensal;
    }

    public double getRendimentoMensal(){
        return rendimentoMensal;
    }
    public void setRendimentoMensal(double rendimentoMensal) {
        this.rendimentoMensal = rendimentoMensal;
    }

    public void calcularRendimento() {
        double rendimento = getSaldo() * (rendimentoMensal / 100);
        setSaldo(getSaldo() + rendimento);
        System.out.println("Rendimento mensal de " + rendimentoMensal + "% aplicado. Valor: " + rendimento);
    }
}
