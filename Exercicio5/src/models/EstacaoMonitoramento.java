package models;

public class EstacaoMonitoramento {
    private String localizacao;
    private double indiceQualidadeAr;

    public EstacaoMonitoramento(String localizacao, double indiceQualidadeAr){
        this.localizacao = localizacao;
        this.indiceQualidadeAr = indiceQualidadeAr;
    }

    public String getLocalizacao(){
        return localizacao;
    }
    public double getIndiceQualidadeAr(){
        return indiceQualidadeAr;
    }
    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }
    public void setIndiceQualidadeAr(int indice){
        this.indiceQualidadeAr = indice;
    }

    public String toString(){
        return "Localização: " + localizacao + " - Indice de Qualidade do Ar: " + indiceQualidadeAr + "\n";
    }
}
