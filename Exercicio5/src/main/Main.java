package main;
import models.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BD banco = new BD();


        while (true) {
            System.out.println("----- SISTEMA DE MONITORAMENTO DE QUALIDADE DO AR -----");
            System.out.println(" 1. Adicionar Estação");
            System.out.println(" 2. Listar todas as Estações registradas");
            System.out.println(" 3. Calcular média de indíces");
            System.out.println(" 4. Sair");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a localização:");
                    String localizacao = sc.nextLine();
                    System.out.println("Digite o índice de qualidade do ar dessa localizade: ");
                    int indice = sc.nextInt();
                    sc.nextLine();
                    EstacaoMonitoramento estacao = new EstacaoMonitoramento(localizacao, indice);
                    banco.adicionarIndice(estacao);
                    System.out.println("Registro feito!\n");
                    break;

                case 2:
                    System.out.println("Registros já registrados:");
                    banco.listarLista();
                    break;

                case 3:
                    System.out.println("Média dos índeces de qualidade do ar já registrados:");
                    System.out.println(banco.calcularMedia());
                    break;

                case 4:
                    System.out.println("Saindo do programa...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Opção invpalida! Tente novamente.");
                    break;
            }
        }
    }
}