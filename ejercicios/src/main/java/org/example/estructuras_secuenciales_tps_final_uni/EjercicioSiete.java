package org.example.estructuras_secuenciales_tps_final_uni;

import java.util.Scanner;

public class EjercicioSiete {
    public static void main(String[] args) {
        //crear un programa que lea la longitud de los catetos de un triángulo rectángulo
        // y calcule la longitud de la hipotenusa según el teorema de Pitágoras.

        Scanner entrada = new Scanner(System.in);
        int catetoOpuesto, catetoAdyacente, hipotenusa;
        System.out.print("Ingrese el cateto opuesto: ");
        catetoOpuesto = entrada.nextInt();

        System.out.print("Ingrese el cateto adyacente: ");
        catetoAdyacente = entrada.nextInt();

        //casteo
        hipotenusa = (int) Math.pow(catetoOpuesto, 2) + (int) Math.pow(catetoAdyacente,2);

        System.out.println("la longitud de la hipotenusa según el teorema de Pitágoras es de : " + hipotenusa);
    }
}
