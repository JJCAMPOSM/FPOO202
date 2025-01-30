package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        System.out.println((numero % 2 == 0) ? "El número es par." : "El número es impar.");

        scanner.close();
    }
}