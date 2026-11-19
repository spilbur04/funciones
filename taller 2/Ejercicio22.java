/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2.pkg2;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        System.out.print("Tipo (1 moto, 2 carro): ");
        int tipo = teclado.nextInt();

        System.out.print("Horas: ");
        int horas = teclado.nextInt();

        System.out.print("Sello (true o false): ");
        boolean sello = teclado.nextBoolean();

        if ((tipo == 1 || tipo == 2) && horas > 0) {
            double total = Parqueadero(tipo, horas, sello);
            System.out.println("Total: " + total);
        } else {
            System.out.println("Datos incorrectos");
        }
       
    }
     static double Tarifa(int tipo, int horas) {
        if (tipo == 1) {
            if (horas <= 5) {
                return horas * 2000;
            } else {
                return 10000;
            }
        } else {
            if (horas <= 5) {
                return horas * 4500;
            } else {
                return 20000;
            }
        }
    }

    static double Descuento(double valor, boolean sello) {
        if (sello) {
            valor = valor - 3000;
        }

        if (valor < 0) {
            valor = 0;
        }

        return valor;
    }

    static double Parqueadero(int tipo, int horas, boolean sello) {
        double valor = Tarifa(tipo, horas);
        return Descuento(valor, sello);
    }
}
