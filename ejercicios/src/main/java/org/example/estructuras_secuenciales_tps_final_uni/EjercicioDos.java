package org.example.estructuras_secuenciales_tps_final_uni;

import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        //Crear un programa en Java que lea un nombre y muestre por pantalla:
        // “Buenos dias nombre_introducido”

        Scanner entrada = new Scanner(System.in); // inicializo el escaner para entrada de datos
        String nombre; // declaro la variable donde voy guardo el nombre
        System.out.print("Ingrese su nombre: "); // pido nombre al usuario
        nombre = entrada.nextLine(); // iguale el nombre al dato proporcionado por teclado

        System.out.println("Buenos dias " + nombre); // imprimo
    }
}
