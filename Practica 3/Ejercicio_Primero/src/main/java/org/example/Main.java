package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese número de horas trabajadas: ");
        int hrs = reader.nextInt();

        System.out.println("Ingresa coste por hora: ");
        int cost = reader.nextInt();
        reader.close();

        System.out.println("Tu paga corresponde a: " + hrs * cost);
        }
}