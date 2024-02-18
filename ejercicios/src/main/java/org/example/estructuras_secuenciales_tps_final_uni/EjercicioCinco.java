package org.example.estructuras_secuenciales_tps_final_uni;

import java.util.Scanner;

public class EjercicioCinco {
    public static void main(String[] args) {
        //Crear un programa que lea por teclado el valor del radio de una
        // circunferencia. Luego que calcule y muestre por pantalla la longitud y
        // el área de la circunferencia.
        // Longitud de la circunferencia = 2*PI*Radio
        // Area de la circunferencia = PI*Radio^2

        Scanner entrada = new Scanner(System.in);
        double radio, longitud, area;
        System.out.print("Ingrese el valor del radio: ");
        radio = entrada.nextDouble();

        longitud = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio, 2);

        System.out.println("La longitud es de: " + longitud + " y el area de: " + area);

    }
}
