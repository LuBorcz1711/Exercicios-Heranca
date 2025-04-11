package models;

public class Veiculo {
    protected double peso;
    protected double velocidadeMaxima;
    protected double preco;

    public Veiculo(double peso, double velocidadeMaxima, double preco) {
        this.peso = peso;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = preco;
    }

    //getters
    public double getPeso() {
        return peso;
    }
    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public double getPreco() {
        return preco;
    }

    //setters
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setVelocidadeMaxima(double vel) {
        this.velocidadeMaxima = vel;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void obterInformacoesBasicas() {
        System.out.println("Peso: " + getPeso());
        System.out.println("Velocidade Máxima: " + getVelocidadeMaxima());
        System.out.println("Preço R$: " + getPreco());
    }

}

