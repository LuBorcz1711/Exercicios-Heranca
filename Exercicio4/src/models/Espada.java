package models;

public class Espada  extends  Item{
    private String material;
    private double forcaEspada;

    public Espada(String nome, int quantidade, String material, double forcaEspada){
        super(nome, quantidade);
        this.material = material;
        this.forcaEspada = forcaEspada;
    }

    public String getMaterial(){
        return material;
    }
    public double getForcaEspada(){
        return forcaEspada;
    }

    @Override
    public void obterInformacoes(){
        System.out.println("Nome da espada: "  + getNome() + " - Quantidade: " + getQuantidade());
        System.out.println("Material da Espada: "  + getMaterial() + " - Força (0 a 100): " + getForcaEspada());
    }

    public void atacarInimigo(){
        System.out.println("Voce atacou o inimigo! O inimigo perdeu " + getForcaEspada() + " pontos de vida!");
    }
}
