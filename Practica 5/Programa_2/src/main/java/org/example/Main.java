/*Escriba un programa que pida al usuario 2 palabras
y indique cual de ellas es mas larga y por cuantas letras lo es*/

package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce la primera palabra: ");
        String palabra1=sc.nextLine();

        System.out.print("Introduce la segunda palabra: ");
        String palabra2=sc.nextLine();

        if(palabra1.length()>palabra2.length()){
        System.out.println("La primera palabra es más larga por "+(palabra1.length()-palabra2.length())+" letras.");
        }else if(palabra2.length()>palabra1.length()){
        System.out.println("La segunda palabra es más larga por "+(palabra2.length()-palabra1.length())+" letras.");
        }else{
        System.out.println("Ambas palabras tienen la misma catidad de letras.");
        }
        }
    }
