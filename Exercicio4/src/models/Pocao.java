package models;

public class Pocao extends Item {

    private String efeitoEspecial;
    private String cor;

    public Pocao(String nome, int quantidade, String efeitoEspecial, String cor){
        super(nome, quantidade);
        this.efeitoEspecial = efeitoEspecial;
        this.cor = cor;
    }

    public String getEfeitoEspecial(){
        return efeitoEspecial;
    }
    public String getCor(){
        return cor;
    }

    @Override
    public void obterInformacoes(){
        System.out.println("Nome da poção: "  + getNome() + " - Quantidade: " + getQuantidade());
        System.out.println("Poção com o efeito especial de " + getEfeitoEspecial() + " . Cor representante: " + getCor());
    }

    public void usarPocao(){
        System.out.println("Voçe usou a poção " + getNome() + "! Agora está com uma habilidade especial de " + getEfeitoEspecial());
    }

}
