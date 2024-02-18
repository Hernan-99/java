package org.example.estructuras_secuenciales_tps_final_uni;

import java.util.Scanner;

public class EjercicioSeis {
    public static void main(String[] args) {
        // Crear un programa que pase una velocidad en Km/h a m/s.
        // La velocidad se lee por teclado.
        Scanner entrada = new Scanner(System.in);
        int velodicadKm, conversionMs;
        System.out.print("Introduzca la velocidad: ");
        velodicadKm = entrada.nextInt();
        conversionMs = (velodicadKm * 1000) / 1;

        System.out.print(velodicadKm + "km/h equivalen a: " + conversionMs + "m/s");

    }
}
