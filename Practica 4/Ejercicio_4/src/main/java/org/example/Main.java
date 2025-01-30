package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        String palabra = sc.nextLine();

        String reverso ="";

        for (int i = palabra.length()-1; i>=0;--i) {
            reverso = reverso + palabra.charAt(i);
        }
        if (palabra.equals(reverso)){
            System.out.println(palabra + "es palindromo");
        }
        else{
            System.out.println(palabra + " no es palindromo");
        }

    }
}