/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desarrollo.pkg2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Desarrollo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);

          double base;
          double altura;
          double resultado;

          System.out.print("Ingrese la base: ");
          base = teclado.nextDouble();

          System.out.print("Ingrese la altura: ");
          altura = teclado.nextDouble();

          resultado = calcularArea(base, altura);
          System.out.printf("%.2f\n ", resultado);
        
    }
    
    public static double calcularArea(double base, double altura) {

    double area;

    area = base * altura;

    return area;

}
    
}
