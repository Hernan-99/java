package org.example.estructuras_secuenciales_tps_final_uni;

import java.util.Scanner;

public class EjercicioOcho {
    public static void main(String[] args) {
        //Crear un programa que tome como dato de entrada un número que corresponda a la
        // longitud del radio de una esfera y, calcule y escriba el volumen de la
        // esfera que se corresponde con dicho radio. La fórmula para calcular el volumen de la esfera es
        //v = (4/3)*PI*r^3

        Scanner entrada = new Scanner(System.in);
        double radio, volumen;

        System.out.print("Ingrese la longitud del radio: ");
        radio = entrada.nextDouble();

        //4.0 y 3.0 porque usamos double
        volumen = Math.round((4.0/3.0) * (Math.PI * Math.pow(radio, 3)));

        System.out.println("El volumen de la esfera es de: " + volumen);
    }
}
