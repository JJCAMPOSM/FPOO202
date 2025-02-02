package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saldo = 0;

        System.out.println("Ingrese las operaciones (D para depósito, R para retiro). Deje una línea vacía para finalizar:");

        while (true) {
            String linea = sc.nextLine().trim();

            if (linea.isEmpty()) {
                break;
            }

            char tipoOperacion = linea.charAt(0);
            int monto = Integer.parseInt(linea.substring(2).trim());

            if (tipoOperacion == 'D') {
                saldo += monto;
            } else if (tipoOperacion == 'R') {
                saldo -= monto;
            } else {
                System.out.println("Operación no válida. Use 'D' para depósito o 'R' para retiro.");
            }
        }

        System.out.println("Saldo final: " + saldo + " pesos.");
    }
}
