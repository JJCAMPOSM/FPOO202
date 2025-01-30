package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el operador de la operacion -,+,*,/: ");
        String operador = sc.nextLine();

        switch (operador) {
            case "+":
                System.out.println("Ingrese un numero: ");
                int num1 = sc.nextInt();
                System.out.println("Ingrese otro numero: ");
                int num2 = sc.nextInt();
                System.out.println("El resultado es: " + num1 + num2);
                break;
            case "-":
                System.out.println("Ingrese un numero: ");
                int num3 = sc.nextInt();
                System.out.println("Ingrese otro numero: ");
                int num4 = sc.nextInt();
                int restante = num3 - num4;
                System.out.println("El resultado es: " + restante);
                break;
            case "*":
                System.out.println("Ingrese un numero: ");
                int num5 = sc.nextInt();
                System.out.println("Ingrese otro numero: ");
                int num6 = sc.nextInt();
                System.out.println("El resultado es: " + num5 * num6);
                break;
            case "/":
                System.out.println("Ingrese un numero: ");
                int num7 = sc.nextInt();
                System.out.println("Ingrese otro numero: ");
                int num8 = sc.nextInt();
                System.out.println("El resultado es: " + num7 / num8);
                break;

                default:
                    System.out.println("El operador de la operacion no es valido");
        }
    }
}
