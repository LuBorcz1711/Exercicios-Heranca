package models;

public class Vendedor extends Empregado{
    private int qtdeVendas;
    private float valorVenda;

    public Vendedor(String nome, int idade, char sexo, float salario, String matricula, int qtdeVendas, float valorVenda){
        super(nome, idade, sexo, salario, matricula);
        this.qtdeVendas = qtdeVendas;
        this.valorVenda = valorVenda;
    }

    public int getQtdeVendas(){
        return qtdeVendas;
    }
    public float getValorVenda(){
        return valorVenda;
    }

    public float totalVendas(){
        return getSalario() + (qtdeVendas * valorVenda);
    }

    @Override
    public void obterInformacoesBasicas(){
        System.out.println("Nome do vendedor: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Salário do empregado: " + getSalario());
        System.out.println("Ano de Nascimento: " + getMatricula());
        System.out.println("Quantidade de vendas: " + getQtdeVendas());
        System.out.println("Total de lucro com as vendas: " + totalVendas() );

    }
}
