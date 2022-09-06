/*
Crear un programa que, al recibir como datos dos numeros enteros, calcule la
suma, resta y multiplicación
 */
package PracticasJava;

import java.util.Scanner;

public class Operaciones {

    public static void main (String[] args) {
        //Variables54
        int num1, num2;
        
        //Solicitud de los numeros
        System.out.println("Digite el primer número:");
        Scanner entrada = new Scanner(System.in);
        num1 = entrada.nextInt();
        
        System.out.println("Digite el segundo número:");
        Scanner lectura = new Scanner(System.in);
        num2 = lectura.nextInt();
        
        //Operaciones
        int suma = (num1 + num2) ;
        int resta = (num1 - num2) ;
        int multiplicacion = (num1 * num2) ;
        int division = (num1 / num2) ;
        int resto = (num1 % num2) ;
        
        System.out.println("La suma es: " + suma + "\n" + "La resta es: " + resta + "\n" + "La multiplicación es: " + multiplicacion + "\n" + "La división es: " + division + "\n" + "El resto es: " + resto);
        
        
        
    }
}
