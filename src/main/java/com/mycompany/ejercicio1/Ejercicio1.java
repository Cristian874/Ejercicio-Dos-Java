package com.mycompany.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Dame un número");
        num1 = dato.nextInt();
        System.out.println("Dame otro número");
        num2 = dato.nextInt();

        if (num1 >= num2) {

            if (num1 == num2) {
                System.out.println("los números son iguales ");
                
                

            } else {
                System.out.println("El número " + num1 + " es mayor que el número " + num2);

            }

        } else {
            System.out.println("El número " + num1 + " es menor que el número " + num2);

        }
 
    }
    
   

}
