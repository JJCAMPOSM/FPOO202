package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int num = sc.nextInt();

        if (num > 0) {
            for (int i = 1; i <= num; i += 2) {
                System.out.print(i);
                if (i + 2 <= num) {
                    System.out.print(", ");
                }
            }
        } else {
            System.out.println("El número debe ser un entero positivo.");
        }
    }
}
