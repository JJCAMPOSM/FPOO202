package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el un numero positivo entero: ");
        int num = sc.nextInt();

        for(int i = num; i >= 0; i--){
            System.out.print(i + ",");
        }
    }
}