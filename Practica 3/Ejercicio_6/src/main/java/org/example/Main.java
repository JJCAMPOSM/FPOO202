package org.example;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese una frase: ");
            String frase = scanner.nextLine();

            String fraseInvertida = "";
            for (int i = frase.length() - 1; i >= 0; i--) {
                fraseInvertida += frase.charAt(i);
            }

            System.out.println("La frase invertida es: " + fraseInvertida);
        }
    }
