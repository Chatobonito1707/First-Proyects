package PracticasJava;

import java.util.Scanner;


public class Cambio_Dinero {
    public static void main(String[] args) {
        
        //Variables
        float cambio, precio, pago, faltante;
        
        System.out.println("Ingrese el precio del producto");
        Scanner entrada = new Scanner(System.in);
        precio = entrada.nextFloat();
        
        System.out.println("Ingrese su pago");
        Scanner entrada2 = new Scanner(System.in);
        pago = entrada2.nextFloat();
        
        cambio = pago - precio;
        faltante = precio - pago;
        
        if (pago > precio) {
            System.out.println("Su cambio es de: $" + cambio + " ¡Gracias por su compra!");     
        }else {
            if (pago == precio ) {
                System.out.println("El pago es exacto." + " ¡Gracias por su compra!");
            }else{
                if (pago < precio) {
                    System.out.println("Falta $" + faltante + " para completar su compra");
                }
            }
        }
    }
}
