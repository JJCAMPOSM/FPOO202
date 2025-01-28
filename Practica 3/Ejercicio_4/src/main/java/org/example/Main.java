package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese tu completo: ");
        String name = reader.nextLine();
        String mayus = name.toUpperCase();

        System.out.println("Hola " + mayus);
        System.out.println("Tu nombre tiene: " + name.length() + " letras" );



    }
}