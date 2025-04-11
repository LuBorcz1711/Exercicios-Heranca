package models;

public class Cliente extends Pessoa{
    private float valorDivida;
    private int anoNascimento;

    public Cliente(String nome, int idade, char sexo, float valorDivida, int anoNascimento){
        super(nome, idade, sexo);
        this.valorDivida = valorDivida;
        this.anoNascimento = anoNascimento;
    }

    public float getValorDivida(){
        return valorDivida;
    }
    public int getAnoNascimento(){
        return anoNascimento;
    }

    @Override
    public void obterInformacoesBasicas(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Valor da dívida: " + getValorDivida());
        System.out.println("Ano de Nascimento: " + getAnoNascimento());
    }
}
