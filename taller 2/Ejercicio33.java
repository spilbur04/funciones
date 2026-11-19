/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3.pkg3;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner(System.in);

        System.out.print("Inicio: ");
        int inicio = teclado.nextInt();

        System.out.print("Fin: ");
        int fin = teclado.nextInt();

        if (inicio > 0 && inicio < fin) {
            int suma = rangoPrimos(inicio, fin);
            System.out.println("La suma total de los numeros primos en el rango es: " + suma);
        } else {
            System.out.println("Rango incorrecto");
        }
    }
  
    static boolean numeroPrimo(int numero) {

        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    static int rangoPrimos(int inicio, int fin) {

        int suma = 0;

        for (int i = inicio; i <= fin; i++) {

            if (numeroPrimo(i)) {
                System.out.println(i);
                suma = suma + i;
            }
        }

        return suma;
    }

}
