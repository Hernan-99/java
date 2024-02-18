package org.example;

import java.util.Scanner;

public class TercerEjercicio {
    public static void main(String[] args) {
        //Crear un programa en Java que lea un número entero por teclado y obtenga y
        // muestra por pantalla el doble y el triple de ese número.

        Scanner entrada = new Scanner(System.in);
        int n, doble, triple; // variables declaradas para almacenar datos
        System.out.print("Ingrese un entero: ");
        n = entrada.nextInt();

        // operaciones
        doble = n * 2;
        triple = n * 3;
        System.out.println("El doble del entero " + n + " es: " + doble + " y el triple es: " + triple);
    }
}
