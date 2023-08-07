
package main;

import java.util.Scanner;

public class IntercambioNumeros {

    public static void main(String[] args) {
        
        /*
        Intercambiar el contenido de dos variables en Java
        1.- Primero con una variable auxiliar
        2.- Sin variable auxiliar
        */

        //Con variable auxiliar 
        
        Scanner lectura = new Scanner(System.in);
        int A, B, AUX;
        
        /*System.out.print("Ingrese de la variable A: ");
        A = lectura.nextInt(); lectura.nextLine();
        System.out.print("Ingrese de la variable B: ");
        B = lectura.nextInt(); lectura.nextLine();
        System.out.println("\nValor de A: " + A);
        System.out.println("Valor de B: " + B);
        
        AUX = A;
        A = B;
        B = AUX;
        
        System.out.println("\nValor intercambiado de A: " + A);
        System.out.println("Valor intercambiado de B: " + B);*/
        
        //Sin variable auxiliar
        
        System.out.print("Ingrese de la variable A: ");
        A = lectura.nextInt(); lectura.nextLine();
        System.out.print("Ingrese de la variable B: ");
        B = lectura.nextInt(); lectura.nextLine();
        System.out.println("\nValor de A: " + A);
        System.out.println("Valor de B: " + B);
        
        /*
            A = 10
            B = 20
            B = A * B = 10 * 20 = 200
            B = B / A
            A = 200 / 10 = 20
            B = 200 / 20 = 10 
        */
        
        B = A * B;
        A = B / A;
        B = B / A;
        
        System.out.println("\nValor intercambiado de A: " + A);
        System.out.println("Valor intercambiado de B: " + B);
    }
}
