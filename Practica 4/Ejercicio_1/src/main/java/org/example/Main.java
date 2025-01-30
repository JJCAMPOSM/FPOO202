package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String contra = "upq1233";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la contraseña: ");
        String passwordIngresada = scanner.nextLine();

        if (contra.equalsIgnoreCase(passwordIngresada)) {
            System.out.println("La contraseña es correcta.");
        } else {
            System.out.println("La contraseña es incorrecta.");
        }
    }
}

