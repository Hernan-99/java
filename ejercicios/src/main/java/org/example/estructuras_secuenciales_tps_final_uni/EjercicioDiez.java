package org.example.estructuras_secuenciales_tps_final_uni;

import java.util.Scanner;

public class EjercicioDiez {
    public static void main(String[] args) {
        // Programa Java que lea un número entero de 3 cifras y muestre por separado
        // las cifras del número.

        Scanner entrada = new Scanner(System.in);
        int entero, pCifra, sCifra, tCifra;
        System.out.print("Ingrese un entero de 3 cifras: ");
        entero = entrada.nextInt();

        pCifra = entero / 100;
        sCifra = (entero/10) % 10;
        tCifra = entero % 10;

        System.out.println("Primera cifra: " + pCifra + ".\n" +
                "Segunda cifra: " + sCifra + ".\n" +
                "Tercera cifra: " + tCifra + ".\n");
    }
}
