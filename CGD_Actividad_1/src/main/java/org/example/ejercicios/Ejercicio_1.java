package org.example.ejercicios;

/*Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien, Notable y sobresaliente. 
Si la nota introducida no está en el rango mostrar el mensaje “Nota errónea”.*/

import java.util.Scanner;

public class Ejercicio_1 {
    private Scanner sc = new Scanner(System.in);
    private int nota;
    private boolean running = true;


    public static void main(String[] args) {
        Ejercicio_1 ejercicio = new Ejercicio_1();
        ejercicio.pedirNotaSwitch();
    }

    //TODO: Solucion 1 con switch
    private void pedirNotaSwitch() {
        while (running) {
            System.out.println("Introduce una nota del 0 al 10 \n Para salir introduce 11");
            nota = sc.nextInt();

            switch (nota) {
                case 0:
                case 1:
                case 2:
                case 3:
                    System.out.println("Insuficiente");
                    break;
                case 4:
                case 5:
                    System.out.println("Suficiente");
                    break;
                case 6:
                    System.out.println("Bien");
                    break;
                case 7:
                case 8:
                    System.out.println("Notable");
                    break;
                case 9:
                case 10:
                    System.out.println("Sobresaliente");
                    break;
                case 11:
                    running = false;
                    break;
                default:
                    //Uso system.err para que el mensaje de error se muestre en rojo como un error propiamente dicho
                    // y no usar el codigo ascii para cambiar el color de la consola
                    System.err.println("nota errónea");
            }
        }
    }

    //TODO: Solucion 2 con if
    private void pedirNotaIf() {
        while (running) {
            System.out.println("Introduce una nota del 0 al 10 \n Para salir introduce 11");
            nota = sc.nextInt();

            if (nota >= 0 && nota <= 10) {
                if (nota >= 0 && nota <= 3) {
                    System.out.println("Insuficiente");
                } else if (nota >= 4 && nota <= 5) {
                    System.out.println("Suficiente");
                } else if (nota == 6) {
                    System.out.println("Bien");
                } else if (nota >= 7 && nota <= 8) {
                    System.out.println("Notable");
                } else {
                    System.out.println("Sobresaliente");
                }
            } else if (nota == 11) {
                running = false;
            } else {
                System.err.println("nota errónea");
            }
        }
    }
}
