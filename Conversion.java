/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticasJava;

import java.util.Scanner;

/**
 *
 * @author Santiago BM
 */
public class Conversion {
    public static void main(String[] args) {
        double dolar, conversion, cop;
        
        System.out.println("Ingrese la cantidad de dólares:");
        Scanner entrada1 = new Scanner(System.in);
        dolar = entrada1.nextDouble();
        
        System.out.println("Ingrese el precio actual del Dolar en COP:");
        Scanner entrada2 = new Scanner(System.in);
        cop = entrada2.nextDouble();
        
        conversion = (dolar * cop);
        System.out.println("En pesos colobianos, $" + dolar + " equivalen a $" + conversion + " pesos.");
            
    }
    
}
