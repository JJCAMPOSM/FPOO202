package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad de niveles del árbol: ");
        int niveles = sc.nextInt();

        int i = 1;
        while (i <= niveles) {
            int espacios = niveles - i;
            int asteriscos = 2 * i - 1;

            int j = 0;
            while (j < espacios) {
                System.out.print(" ");
                j++;
            }

            int k = 0;
            while (k < asteriscos) {
                System.out.print("*");
                k++;
            }

            System.out.println();
            i++;
        }
    }
}
