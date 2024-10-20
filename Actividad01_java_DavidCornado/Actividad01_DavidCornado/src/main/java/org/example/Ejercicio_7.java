package org.example;

import java.util.Scanner;

public class Ejercicio_7 {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Ejercicio_7 ejercicio_7 = new Ejercicio_7();
        ejercicio_7.imprimirNumeroString();
    }

    //Metodo private para leer los numeros, en este caos los he hecho private para solo poder acceder desde esta clase
    //no como en los anteriores que los hacia publics
    private int leerNumero() {
        System.out.print("Introduce un numero, S para salir: ");//Uso print para que no me meta salto de linea 
        return scanner.nextInt();
    }

    //Metodo para mostrar el numero como string dependiendo de la antrada qeu se le de
    private void imprimirNumeroString() {

        boolean running = true;

        /*Uso del while true podria generarme un bucle infinito si no lo controlo
        * se usa para no tener que ejecutar todas las veces que quiera probar el programa*/
        while (running) {
            switch (leerNumero()) {
                case 0:
                    System.out.println("Cero");
                    break;
                case 1:
                    System.out.println("Uno");
                    break;
                case 2:
                    System.out.println("Dos");
                    break;
                case 3:
                    System.out.println("Tres");
                    break;
                case 's' | 'S':
                    running = false;
                    System.out.println("Saliendo del programa");
                default:
                    System.out.println("Otro numero");
            }
        }
    }
}