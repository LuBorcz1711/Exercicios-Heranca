package models;
import java.util.ArrayList;

public class BD {
    private ArrayList<EstacaoMonitoramento> lista;

    public BD(){
        this.lista = new ArrayList<>();
    }

    public void adicionarIndice(EstacaoMonitoramento indice){
        lista.add(indice);
    }

    public double calcularMedia(){
        double valorMedia = 0;
        if (lista.isEmpty()){
            System.out.println("A lista está vazia\n");
        } else{
            for (EstacaoMonitoramento indice : lista){
                valorMedia += indice.getIndiceQualidadeAr();
            }
        }
        return valorMedia / lista.size();
    }

    public void listarLista(){
        if (lista.isEmpty()){
            System.out.println("A lista está vazia\n");
        }
        else {
            for (EstacaoMonitoramento indice : lista){
                System.out.println(indice.toString());
            }
        }
    }

}
