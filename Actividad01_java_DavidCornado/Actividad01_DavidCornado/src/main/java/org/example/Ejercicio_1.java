package org.example;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer número: ");
        int num1 = sc.nextInt();
        System.out.println("Ingresa el segundo número: ");
        int num2 = sc.nextInt();

        menu(num1, num2);

    }

    public static void menu(int num1, int num2) {

        //Establezco un boolean running a true apra poder cambiar el estado en la opcion 6 y salir del while
        boolean running = true;

        //Genero un bucle while para que el menu se ejecute hasta que el usuario decida salir
        while (running) {
            //Crep un StringBuilder para mostrar el menu de opciones
            StringBuilder sb = new StringBuilder();
            sb.append("1. Sumar\n");
            sb.append("2. Restar\n");
            sb.append("3. Multiplicar\n");
            sb.append("4. Dividir\n");
            sb.append("5. Resto\n");
            sb.append("6. Salir\n"); // (0¨)
            System.out.println(sb);

            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa una operación: ");
            int operacion = sc.nextInt();
            //Creo un switch para que el usuario pueda elegir la operacion que desea realizar con los dos numeros
            switch (operacion) {
                case 1:
                    System.out.println("La suma de los dos números es: " + sumar(num1, num2));
                    break;
                case 2:
                    System.out.println("La resta de los dos números es: " + restar(num1, num2));
                    break;
                case 3:
                    System.out.println("La multiplicación de los dos números es: " + multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println("La division de los dos números es: " + dividir(num1, num2));
                    break;
                case 5:
                    System.out.println("El resto de los dos números es: " + resto(num1, num2));
                    break;
                case 6:
                    running = false;
                    System.out.println("Saliendo...");
                    break;
                default:
                    
                    System.out.println("opción no valida");
                    break;

            }
        }
    }

    
    //Metodos para realizar las operaciones matematicas
    //Se podria realizar un metodo a mayores para pedir al usuario los numeros, pero he decidido hacerlo asi
    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }
    

    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static int dividir(int num1, int num2) {
        return num1 / num2;
    }

    public static int resto(int num1, int num2) {
        return num1 % num2;
    }

}
