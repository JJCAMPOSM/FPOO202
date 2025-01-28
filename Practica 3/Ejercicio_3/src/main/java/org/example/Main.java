package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int entero = reader.nextInt();

        for (int i = 0; i < entero; i++) {
            int resultado = i + entero;
            System.out.println(i + "+" + entero + "=" + resultado);
        }

    }}