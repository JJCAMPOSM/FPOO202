package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la altura del triángulo (entero positivo): ");
        int altura = sc.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
