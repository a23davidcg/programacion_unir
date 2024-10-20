package org.example;

import java.util.Scanner;

public class Ejercicio_8 {
    private Scanner sc = new Scanner(System.in);

    int numero1;
    int numero2;

    public static void main(String[] args) {

        Ejercicio_8 ejercicio8 = new Ejercicio_8();
        ejercicio8.pedirNumeros();
        ejercicio8.menu(ejercicio8.numero1, ejercicio8.numero2);
    }

    private void pedirNumeros() {
        System.out.println("Introduce numero uno: ");
        numero1 = sc.nextInt();
        System.out.println("Introduce numero dos: ");
        numero2 = sc.nextInt();
        sc.nextLine();  // Limpiar el buffer después de leer el último entero
    }

    private void menu(int numero1, int numero2) {
        boolean running = true;

        while (running) {
            StringBuilder sb = new StringBuilder();
            sb.append("1. Sumar\n");
            sb.append("2. Restar\n");
            sb.append("3. Multiplicar\n");
            sb.append("4. Dividir\n");
            sb.append("5. Resto\n");
            sb.append("6. Salir\n");
            sb.append("Introduce una acción: ");
            System.out.println(sb);

            String palabra = sc.nextLine();

            switch (palabra) {
                case "Sumar":
                    System.out.println("La suma de los dos números es: " + sumar(numero1, numero2));
                    break;
                case "Restar":
                    System.out.println("La resta de los dos números es: " + restar(numero1, numero2));
                    break;
                case "Multiplicar":
                    System.out.println("La multiplicación de los dos números es: " + multiplicar(numero1, numero2));
                    break;
                case "Dividir":
                    if (numero2 != 0) {
                        System.out.println("La división de los dos números es: " + dividir(numero1, numero2));
                    } else {
                        System.out.println("No se puede dividir por cero.");
                    }
                    break;
                case "Resto":
                    if (numero2 != 0) {
                        System.out.println("El resto de los dos números es: " + resto(numero1, numero2));
                    } else {
                        System.out.println("No se puede calcular el resto con divisor cero.");
                    }
                    break;
                case "Salir":
                    running = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, introduce una opción válida.");
                    break;
            }
        }

        System.out.println("Programa finalizado.");
    }

    private int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    private int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

    private int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }

    private int dividir(int numero1, int numero2) {
        return numero1 / numero2;
    }

    private int resto(int numero1, int numero2) {
        return numero1 % numero2;
    }
}
