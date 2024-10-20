package org.example;

import java.util.Scanner;

//TODO: El ejercicio 5 se ha implementado en esta clase también

public class Ejercicio_4 {
    private Scanner scanner = new Scanner(System.in);
    private String hombre;
    private String mujer;
    private String letra;

    //Constructor para inicalizar lod valores de las variables
    public Ejercicio_4() {
        this.hombre = "Hombre";
        this.mujer = "Mujer";
    }

    public static void main(String[] args) {
        Ejercicio_4 ejercicio4 = new Ejercicio_4();
        ejercicio4.pedirLetra();
    }

    public void pedirLetra() {

        while (true) {
            System.out.println();
            System.out.println("Introduce una letra H o M para saber si eres hombre o mujer, S para salir del programa: ");
            letra = scanner.nextLine();

//Logica para el procesamiento de las letras que se introducen por consola
            //Se podria hacer como en los ejercicios anteriores con ele  manejo de swicth, para qie no qeude un churro de ifs
            if (letra.equals("H") || letra.equals("h")) {
                System.out.println("Eres un " + hombre);
            } else if (letra.equals("M") || letra.equals("m")) {
                System.out.println("Eres una " + mujer);
            } else if (letra.equals("S") || letra.equals("s")) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Letra no valida");
            }
        }


    }
}
