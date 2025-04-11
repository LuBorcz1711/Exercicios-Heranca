package models;

public class Escudo extends Item{
    private double resistencia;

    public Escudo(String nome, int quantidade, double resistencia){
        super(nome, quantidade);
        this.resistencia = resistencia;
    }

    public double getResistencia(){
        return resistencia;
    }

    public void setResistencia(double resistencia){
        this.resistencia = resistencia;
    }

    @Override
    public void obterInformacoes(){
        System.out.println("Nome do escudo: "  + getNome() + " - Quantidade: " + getQuantidade());
        System.out.println("Resistência do escudo (Entre 0 a 100 pontos): " + getResistencia());
    }

    public void defenderComEscudo(double ataqueInimigo){
        setResistencia(getResistencia() - ataqueInimigo);
        System.out.println("Voçe utilizou um escudo para defender esse ataque inimigo! A sua resistência baixou!");
        System.out.println("Resistência restante: " + getResistencia());
    }
}
