package org.example.estructuras_secuenciales_tps_final_uni;

import java.util.Scanner;

public class EjercicioCuatro {
    public static void main(String[] args) {
        //Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit.
        //La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:
        //F = 32 + ( 9 * C / 5)

        Scanner entrada = new Scanner(System.in);
        double gradosC, gradosF;
        System.out.print("Ingrese una cantidad de grados °C: ");
        gradosC = entrada.nextDouble();
        gradosF = 32 + (9 * gradosC / 5);

        System.out.println("La cantidad de: " + gradosC + "°C grados centigrados corresponden a: " + gradosF + " grados Fahrenhite");

    }
}
