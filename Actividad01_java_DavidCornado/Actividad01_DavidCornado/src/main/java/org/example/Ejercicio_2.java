package org.example;

import java.util.Scanner;

public class Ejercicio_2 {
    private Scanner sc = new Scanner(System.in);
    private int lado1, lado2;

    public static void main(String[] args) {
        Ejercicio_2 ejercicio_2 = new Ejercicio_2();
        ejercicio_2.pedirNumeros();
        ejercicio_2.menu(ejercicio_2.lado1, ejercicio_2.lado2);
    }

    //Metodo para pedir los numeros al usuario
    public void pedirNumeros() {
        System.out.println("Introduce el primer lado: ");
        lado1 = sc.nextInt();
        System.out.println("Introduce el segundo lado: ");
        lado2 = sc.nextInt();
    }

    //menu para saber que opcion quiere hacer el usuario
    public void menu(int lado1, int lado2) {

        boolean running = true;

        while (running) {
            //String builder para mostrar el menu
            StringBuilder sb = new StringBuilder();
            sb.append("Seleccione una opción:\n");
            sb.append("1. Calcular el área de un cuadrado\n");
            sb.append("2. Calcular el perimetro de un rectángulo\n");
            sb.append("3. Calcular la hipotenusa\n");
            sb.append("4. Usar otros números\n");
            sb.append("5. Salir\n");
            //muestro el menu por consola
            System.out.println(sb);//Muestro el menu por la consola


            //Creo un switch para que el usuario pueda elegir la operacion que desea
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    areaCuadrado(lado1, lado2);
                    break;
                case 2:
                    perimetroRectangulo(lado1, lado2);
                    break;
                case 3:
                    hipotenusa(lado1, lado2);
                    break;
                case 4:
                    pedirNumeros();
                    break;
                case 5:
                    running = false;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        }


    }

    //metodo para calcular el area de un cuadrado
    public void areaCuadrado(int lado1, int lado2) {
        //calculo el area del cuadrado
        int area = lado1 * lado2;
        //muestro el area por consola
        System.out.println("El área del cuadrado es: " + area);
    }

    //metodo para calcular el perimetro de un rectángulo
    public void perimetroRectangulo(int lado1, int lado2) {
        //calculo el perimetro del rectangulo
        int perimetro = 2 * (lado1 + lado2);
        //muestro el perimetro por consola
        System.out.println("El perimetro del rectángulo es: " + perimetro);
    }

    //metodo para calcular la hipotenusa
    public void hipotenusa(int lado1, int lado2) {
        //calculo la hipotenusa
        //Hipotenusa es igual a la raiz cuadrada de la suma de los cuadrados de los catetos
        double hipotenusa = Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
        //muestro la hipotenusa por consola
        System.out.println("La hipotenusa es: " + hipotenusa);
    }


}
