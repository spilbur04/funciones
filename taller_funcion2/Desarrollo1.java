/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desarrollo.pkg1;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Desarrollo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        adivinar();
    }
    
    public static void adivinar (){
        int intentos=0; 
        int num = 0; 
        int numer;
        
    Scanner teclado = new Scanner(System.in);
    Random random = new Random();

       numer = (int) (Math.random() * 20) + 1;
        
       
       while (num !=numer) {

    System.out.print("Adivina el numero: ");
    num = teclado.nextInt();
    intentos++;
    
    if(num > numer) {
        System.out.println("El numero random es MENOR");
    } else if (num < numer){
        System.out.println("El numero random es MAYOR");
    } else {
        System.out.println("Adivinaste el numero, el cual era: " +numer);
        System.out.println("La cantidad de intentos requerida fue de " +intentos);
    }

}
       
       
    
    }
    
}
