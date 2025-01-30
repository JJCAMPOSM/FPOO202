package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la edad del cliente: ");
        int edad = scanner.nextInt();

        int precio = (edad < 4) ? 0 : (edad <= 18) ? 110 : 190;

        System.out.println("El precio de la entrada es: $" + precio);
        }
    }
