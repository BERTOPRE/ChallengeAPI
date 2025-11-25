import Helpers.ConversorAPI;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static double leerDoubleValido(Scanner sc, String mensaje) {
        double valor;
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextDouble()) {
                valor = sc.nextDouble();
                sc.nextLine();
                break;
            } else {
                System.out.println("Por favor, ingresa un valor numérico válido.");
                sc.nextLine();
            }
        }
        return valor;
    }

    public static void main(String[] args) throws IOException, InterruptedException {

        int op = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\nBienvenido al conversor de Monedas");
            System.out.println("1. Dólar a Quetzales");
            System.out.println("2. Quetzales a Dólares");
            System.out.println("3. Pesos Mexicanos a Quetzales");
            System.out.println("4. Quetzales a Pesos Mexicanos");
            System.out.println("5. Pesos Colombianos a Pesos Argentinos");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            if (sc.hasNextInt()) {
                op = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Por favor, ingresa un número válido.");
                sc.nextLine();
                continue;
            }

            switch (op) {
                case 1 -> {
                    System.out.println("Has elegido Dólar a Quetzales");
                    double monto = leerDoubleValido(sc, "Ingresa la cantidad que deseas convertir: ");
                    System.out.println("Resultado: " + ConversorAPI.obtenerConversion("USD", "GTQ", monto) + " GTQ");
                }
                case 2 -> {
                    System.out.println("Has elegido Quetzales a Dólares");
                    double monto = leerDoubleValido(sc, "Ingresa la cantidad que deseas convertir: ");
                    System.out.println("Resultado: " + ConversorAPI.obtenerConversion("GTQ", "USD", monto) + " USD");
                }
                case 3 -> {
                    System.out.println("Has elegido Pesos Mexicanos a Quetzales");
                    double monto = leerDoubleValido(sc, "Ingresa la cantidad que deseas convertir: ");
                    System.out.println("Resultado: " + ConversorAPI.obtenerConversion("MXN", "GTQ", monto) + " GTQ");
                }
                case 4 -> {
                    System.out.println("Has elegido Quetzales a Pesos Mexicanos");
                    double monto = leerDoubleValido(sc, "Ingresa la cantidad que deseas convertir: ");
                    System.out.println("Resultado: " + ConversorAPI.obtenerConversion("GTQ", "MXN", monto) + " MXN");
                }
                case 5 -> {
                    System.out.println("Has elegido Pesos Colombianos a Pesos Argentinos");
                    double monto = leerDoubleValido(sc, "Ingresa la cantidad que deseas convertir: ");
                    System.out.println("Resultado: " + ConversorAPI.obtenerConversion("COP", "ARS", monto) + " ARS");
                }
                case 6 -> System.out.println("¡Gracias por usar el conversor!");
                default -> System.out.println("Opción no válida, intenta de nuevo.");
            }


        } while (op != 6);

        sc.close();
    }
}
