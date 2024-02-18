package org.example.estructuras_secuenciales_tps_final_uni;

import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        //Crear un programa en Java que lea dos números enteros por teclado y los
        // muestre por pantalla.

        Scanner entrada = new Scanner(System.in);
        int n1, n2;
        System.out.print("Ingrese el primer numero: ");
        n1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        n2 = entrada.nextInt();

        System.out.print("El primer numero ingresado: " + n1 + ". El segundo numero ingresado: " + n2 + ".");

    }
}