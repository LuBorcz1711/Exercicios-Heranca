package main;
import models.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlacaSolar[] placas = new PlacaSolar[5];

        placas[0] = new PlacaSolar(new EquipamentoEletrico(350, "SolarTech"), new DispositivoMonitoramento("Temperatura"));
        placas[1] = new PlacaSolar(new EquipamentoEletrico(300, "EcoSun"), new DispositivoMonitoramento("Radiação"));
        placas[2] = new PlacaSolar(new EquipamentoEletrico(400, "PhotonPower"), new DispositivoMonitoramento("Temperatura"));
        placas[3] = new PlacaSolar(new EquipamentoEletrico(320, "GreenVolt"), new DispositivoMonitoramento("Umidade"));
        placas[4] = new PlacaSolar(new EquipamentoEletrico(370, "SolarMax"), new DispositivoMonitoramento("Temperatura"));

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tipo de sensor a buscar (ex: Temperatura): ");
        String sensorBuscado = sc.nextLine();

        System.out.println("\nPlacas solares com sensor '" + sensorBuscado + "':");
        for (PlacaSolar placa : placas) {
            if (placa.getDispositivo().getTipoSensor().equalsIgnoreCase(sensorBuscado)) {
                System.out.println("- Potência: " + placa.getEquipamento().getPotencia() + "W | Fabricante: " +
                        placa.getEquipamento().getFabricante());
            }
        }

        sc.close();
    }
}