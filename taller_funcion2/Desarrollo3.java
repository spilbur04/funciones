/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desarrollo.pkg3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Desarrollo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner teclado = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Ingrese el primer numero: ");
        num1 = teclado.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        num2 = teclado.nextInt();

        if (Amigos(num1, num2)) {

            System.out.println("Los numeros son amigos");

        } else {

            System.out.println("Los numeros son amigos");

        }
        
        
    }
     public static boolean Amigos(int num1, int num2) {

        int suma1 = 0;
        int suma2 = 0;

        for (int i = 1; i < num1; i++) {

            if (num1 % i == 0) {

                suma1 = suma1 + i;

            }

        }

        for (int i = 1; i < num2; i++) {

            if (num2 % i == 0) {

                suma2 = suma2 + i;

            }

        }

        return suma1 == num2 && suma2 == num1;
    }
}
