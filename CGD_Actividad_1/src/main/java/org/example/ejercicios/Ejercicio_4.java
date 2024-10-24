package org.example.ejercicios;

import java.util.Scanner;

public class Ejercicio_4 {

    //Declaro las variables que voy a utilizar en la clase
    private Scanner sc = new Scanner(System.in);
    private int numeroLeido;
    private boolean running = true;

    public static void main(String[] args) {
        //Creo un objeto de la clase Ejercicio_4 para poder llamar al metodo leerNumero
        Ejercicio_4 ejercicio = new Ejercicio_4();
        ejercicio.leerNumero();
    }

    private void leerNumero() {

        //Uso de un bucle while para que el programa se ejecute hasta que el usuario introduzca un 0
        while (running) {
            //Pido al usuario que introduzca un numero
            System.out.println("Introduce un número: ");
            //Recopilo el numero introducido por el usuario en la variable que creo anteriormente
            numeroLeido = sc.nextInt();

            //Comprenso si el numero introducido es 0 para salir del bucle
            if (numeroLeido == 0) {
                running = false;
            //Compruebo si el numero introducido es par o impar, y lo muestro por la consola
            } else {
                if (analizarNumero(numeroLeido)) {
                    System.out.println("El número introducido es PAR ");
                } else {
                    System.out.println("El número introducido es IMPAR");
                }
            }
        }
        
    }

    //Metodo que me permite analizar si un numero es par o impar empleando el operador de modulo de 2
    private boolean analizarNumero(int numeroIntroducido) {
        if (numeroIntroducido % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
