package models;

public class Empregado extends Pessoa {
    private float salario;
    private String matricula;

    public Empregado(String nome, int idade, char sexo, float salario, String matricula){
        super(nome, idade, sexo);
        this.salario = salario;
        this.matricula = matricula;
    }

    public float getSalario(){
        return salario;
    }
    public String getMatricula(){
        return matricula;
    }

    @Override
    public void obterInformacoesBasicas(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Salário do empregado: " + getSalario());
        System.out.println("Ano de Nascimento: " + getMatricula());
        System.out.println("Valor do INSS: " + valorINSS());
    }

    public float valorINSS(){
        return salario + (salario * 0.11F);
    }
}

