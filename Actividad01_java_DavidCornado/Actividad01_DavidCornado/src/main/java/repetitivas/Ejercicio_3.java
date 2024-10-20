package repetitivas;

import java.util.Scanner;

public class Ejercicio_3 {

    private int numero;
    private boolean running = true;
    private int contadorNumeros = 0;
    private int getContadorNumerosMultiplosDos = 0;
    private int getContadorNumerosMultiplosTres = 0;
    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Ejercicio_3 ejercicio_3 = new Ejercicio_3();
        ejercicio_3.leerNumeros();

    }

    private void leerNumeros() {
        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
            contadorNumeros++;

            if (i % 2 == 0) {
                getContadorNumerosMultiplosDos++;
            }
            if (i % 3 == 0) {
                getContadorNumerosMultiplosTres++;
            }
        }

        System.out.println("La cantidad de numeros es: " + contadorNumeros);
        System.out.println("La cantidad de multiplos de 2 es: " + getContadorNumerosMultiplosDos);
        System.out.println("La cantidad de multiplos de 3 es: " + getContadorNumerosMultiplosTres);
    }
}
