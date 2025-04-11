package models;
import java.util.Date;

public class ContaCorrente extends Conta{
    private double taxaMovimentacao;

    public ContaCorrente(String cliente, Date dataAbertura, double saldo, double taxaMovimentacao) {
        super(cliente, dataAbertura, saldo);
        this.taxaMovimentacao = taxaMovimentacao;
    }

    public double getTaxaMovimentacao() {
        return taxaMovimentacao;
    }

    public void setTaxaMovimentacao(double taxaMovimentacao) {
        this.taxaMovimentacao = taxaMovimentacao;
    }

    @Override
    public void verSaldo(){
        setSaldo(getSaldo() - taxaMovimentacao);
        System.out.println("Taxa de movimentação de " + taxaMovimentacao + " debitada.");
        super.verSaldo();
    }

}
