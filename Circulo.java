package PracticasJava;

import java.util.Scanner;

public class Circulo {

    public static void main(String[] args) {

        //Variables
        double rad, area, crf;
        System.out.println("Ingrese el radio del circulo en mts o cm");
        Scanner entrada = new Scanner(System.in);
        rad = entrada.nextFloat();

        area = (Math.PI * Math.pow(rad, 2));
        System.out.println("El área del circulo es " + area + " cm²/ mts²");

        crf = (2 * Math.PI * rad);
        System.out.println("La longitud de la circunferencia es " + crf + " cm²/ mts²");
    }

}
 