package org.example;

import java.util.Scanner;

public class Ejercicio_6 {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Ejercicio_6 ejercicio6 = new Ejercicio_6();
        int numero = ejercicio6.pedirNumero();
        ejercicio6.calcularParImpar(numero);
    }

    public int pedirNumero() {
        System.out.println("Introduce un numero: ");
        return scanner.nextInt();
    }

    public void calcularParImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }
}
