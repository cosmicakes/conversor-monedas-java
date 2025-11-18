package src;

import java.io.IOException;
import java.util.Scanner;

public class Conversor {

    private static final String API_KEY = "PONER-TU-API-AQUI";
    private static final Scanner sc = new Scanner(System.in);

    public static void mostrarMenu() throws IOException, InterruptedException {

        while (true) {
            System.out.println("\n=== Conversor de Moneda ===");
            System.out.println("1. ARS → USD");
            System.out.println("2. USD → ARS");
            System.out.println("3. ARS → BRL");
            System.out.println("4. BRL → ARS");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> convertir("ARS", "USD");
                case 2 -> convertir("USD", "ARS");
                case 3 -> convertir("ARS", "BRL");
                case 4 -> convertir("BRL", "ARS");
                case 5 -> {
                    System.out.println("Adiós!");
                    return;
                }
                default -> System.out.println("Opción inválida.");
            }
        }
    }

    private static void convertir(String from, String to) throws IOException, InterruptedException {
        System.out.print("Ingrese el monto a convertir: ");
        double monto = sc.nextDouble();

        String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + from + "/" + to;

        double tasa = ApiClient.obtenerTasa(url);

        System.out.println("Tasa obtenida: " + tasa);

        double resultado = monto * tasa;
        System.out.println("Resultado: " + monto + " " + from + " = " + resultado + " " + to);
    }
}
