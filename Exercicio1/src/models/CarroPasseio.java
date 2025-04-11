package models;

public class CarroPasseio extends Veiculo {
    protected String marca;
    protected String cor;

    public CarroPasseio(double peso, double velocidadeMaxima, double preco, String marca, String cor) {
        super(peso, velocidadeMaxima, preco);
        this.marca = marca;
        this.cor = cor;
    }

    //getters
    public String getMarca() {
        return marca;
    }
    public String getCor() {
        return cor;
    }

    //setters
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void obterInfomacoesCarro() {
        System.out.println("Peso: " + getPeso());
        System.out.println("Velocidade Máxima: " + getVelocidadeMaxima());
        System.out.println("Preço R$: " + getPreco());
        System.out.println("Marca: " + getMarca());
        System.out.println("Cor: " + getCor());
    }

}