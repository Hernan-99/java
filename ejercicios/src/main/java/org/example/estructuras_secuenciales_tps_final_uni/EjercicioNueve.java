package org.example.estructuras_secuenciales_tps_final_uni;

import java.util.Scanner;

public class EjercicioNueve {
    public static void main(String[] args) {
        //Crear un programa que calcule el área de un triángulo en función de las longitudes
        //de sus lados (a, b, c), según la siguiente fórmula:
        //area = RaizCuadrada(p*(p-a)*(p-b)*(p-c)) donde p = (a+b+c)/2
        //Para calcular la raíz cuadrada se utiliza el método Math.sqrt()

        Scanner entrada = new Scanner(System.in);
        int a, b, c, p;
        System.out.print("Inrese la longitud para a: ");
        a = entrada.nextInt();

        System.out.print("Inrese la longitud para b: ");
        b = entrada.nextInt();

        System.out.print("Inrese la longitud para c: ");
        c = entrada.nextInt();

        p = (a + b + c) / 2;

        //si uso int tengo que castear
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println("El area del triangulo es: " + area);
    }
}
