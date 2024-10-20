package org.example;

import java.util.Scanner;

public class Ejercicio_3 {
    private final Scanner scanner = new Scanner(System.in);
    private int radio;


    public static void main(String[] args) {
        
        Ejercicio_3 ejercicio_3 = new Ejercicio_3();
        ejercicio_3.pedirRadio();
        ejercicio_3.calculoCircunferencia(ejercicio_3.radio);
        ejercicio_3.calcloArea(ejercicio_3.radio);
    }

    public void calculoCircunferencia(int radio) {
        //la formula para calcular la circunferencia de un circulo es 2*pi*r
        double circunferencia = 2 * Math.PI * radio;
        System.out.println("La circunferencia del circulo es: " + circunferencia);
    }

    public void calcloArea(int radio) {
        //la formula para calcular el area de un circulo es pi*r^2

        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es: " + area);
    }

    public void pedirRadio() {
        System.out.println("Introduce el radio del circulo: ");
        radio = scanner.nextInt();
    }
}
