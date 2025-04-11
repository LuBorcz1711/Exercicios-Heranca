package models;

public class Caminhao extends Veiculo{
    protected double toneladas;
    protected double alturaMaxima;
    protected double comprimento;

    public Caminhao(double peso, double velocidadeMaxima, double preco, double toneladas, double alturaMaxima, double comprimento) {
        super(peso, velocidadeMaxima, preco);
        this.toneladas = toneladas;
        this.alturaMaxima = alturaMaxima;
        this.comprimento = comprimento;
    }

    //getters
    public double getToneladas() {
        return toneladas;
    }
    public double getAlturaMaxima() {
        return alturaMaxima;
    }
    public double getComprimento() {
        return comprimento;
    }

    //setters
    public void setToneladas(double toneladas) {
        this.toneladas = toneladas;
    }
    public void setAlturaMaxima(double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }
    public void setComprimento() {
        this.comprimento = comprimento;
    }

    public void obterInformacoesCaminhao() {
        System.out.println("Peso: " + getPeso());
        System.out.println("Velocidade Máxima: " + getVelocidadeMaxima());
        System.out.println("Preço R$: " + getPreco());
        System.out.println("Toneladas: " + getToneladas());
        System.out.println("Altura máxima: " + getAlturaMaxima());
        System.out.println("Comprimento: " + getComprimento());
    }
}