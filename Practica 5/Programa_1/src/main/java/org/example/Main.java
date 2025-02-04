

package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese un número dependiendo de la conversión de temperatura deseada:");
        System.out.println("1) Convertir de Fahrenheit a Celsius");
        System.out.println("2) Convertir de Celsius a Fahrenheit");
        System.out.println("3) Convertir de Celsius a Kelvin");


        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> {

                System.out.println("Ingrese la temperatura en Fahrenheit:");
                double fahrenheit = scanner.nextDouble();
                System.out.println("Resultado: " + fahrenheitToCelsius(fahrenheit) + " °C");
            }
            case 2 -> {

                System.out.println("Ingrese la temperatura en Celsius:");
                double celsius = scanner.nextDouble();
                System.out.println("Resultado: " + celsiusToFahrenheit(celsius) + " °F");
            }
            case 3 -> {
                // Conversion de Celsius a Kelvin
                System.out.println("Ingrese la temperatura en Celsius:");
                double celsius = scanner.nextDouble();
                System.out.println("Resultado: " + celsiusToKelvin(celsius) + " K");
            }
            default -> System.out.println("Opción no válida.");
        }
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
}


