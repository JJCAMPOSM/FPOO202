package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pesoPayaso = 112;
        int pesoMuneca = 75;

        System.out.print("Ingrese el número de payasos vendidos: ");
        int numPayasos = scanner.nextInt();

        System.out.print("Ingrese el número de muñecas vendidas: ");
        int numMunecas = scanner.nextInt();

        int pesoTotal = (numPayasos * pesoPayaso) + (numMunecas * pesoMuneca);

        System.out.println("El peso total del paquete es: " + pesoTotal + " gramos.");
    }
}