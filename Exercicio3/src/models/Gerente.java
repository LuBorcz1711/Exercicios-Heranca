package models;

public class Gerente extends Empregado{
    private String nomeGerencia;

    public Gerente(String nome, int idade, char sexo, float salario, String matricula, String nomeGerencia){
        super(nome, idade, sexo, salario, matricula);
        this.nomeGerencia = nomeGerencia;
    }

    public String getNomeGerencia(){
        return nomeGerencia;
    }

    @Override
    public void obterInformacoesBasicas(){
        System.out.println("Nome de gerência: " + getNomeGerencia());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Salário do empregado: " + getSalario());
        System.out.println("Ano de Nascimento: " + getMatricula());
    }
}
