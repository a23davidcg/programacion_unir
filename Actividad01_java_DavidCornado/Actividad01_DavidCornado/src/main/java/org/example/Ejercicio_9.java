package org.example;

import java.awt.geom.Area;
import java.util.Scanner;

public class Ejercicio_9 {
    int numero1;
    int numero2;
    double resultado;
    String palabra;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Se crea una instancia de la clase para poder llamar a los metodos de la misma, para mi gusto en este y todos los ejercicios los estructuraria de otra forma en varias clases
        Ejercicio_9 ejercicio_9 = new Ejercicio_9();
        ejercicio_9.leerPalabra();
        ejercicio_9.analizarPalabra();
    }

    private void leerPalabra() {
        StringBuilder sb = new StringBuilder();
        sb.append("Seleccione una opción:\n");
        sb.append("Triangulo\n");
        sb.append("Rectangulo\n");
        sb.append("Circulo\n");
        sb.append("Salir\n");
        System.out.println(sb);
        System.out.println("Introduce la palabra: \n");
        palabra = scanner.nextLine();
    }

    private void leerNumeros() {
        System.out.println("Introduce el primer numero: ");
        numero1 = scanner.nextInt();
        System.out.println("Introduce el segundo numero: ");
        numero2 = scanner.nextInt();
    }

    private void analizarPalabra() {
        switch (palabra) {
            case "Triangulo":
                leerNumeros();
                System.out.println("El area del triangulo es: " + calcularAreaTriangulo());
                break;
            case "Rectangulo":
                leerNumeros();
                System.out.println("El area del rectangulo es: " + calcularAreaRectangulo());
                System.out.println("El perimetro del rectangulo es: " + calcularPerimetroRectangulo());
                break;
            case "Circulo":
                leerNumeros();
                System.out.println("El area del circulo es: " + calcularAreaCirculo());
                System.out.println("El perimetro del circulo es: " + calcularPerimetroCirculo());
                break;
            case "Salir":
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Palabra no valida");
        }
    }

    private double calcularAreaTriangulo() {
        //Para el calculo del area de un triangulo se multiplica la base por la altura y se divide entre 2
        resultado = (double) (numero1 * numero2) / 2;
        return resultado;
    }

    private double calcularAreaRectangulo() {
        //Para el calculo del area del rectangulo se multiplica la base por la altura
        resultado = numero1 * numero2;
        return resultado;
    }

    private double calcularPerimetroRectangulo() {
        //Para el calculo del perimetro de un rectangulo se suman los lados
        resultado = (numero1 * 2) + (numero2 * 2);
        return resultado;
    }

    private double calcularAreaCirculo() {
        //Para el calculo del area de un circulo se multiplica el radio por si mismo y se multiplica por PI
        resultado = Math.PI * Math.pow(numero1, 2);
        return resultado;
    }

    private double calcularPerimetroCirculo() {
        //Para el calculo del perimetro de un circulo se multiplica el radio por 2 y por PI
        resultado = 2 * Math.PI * numero1;
        return resultado;
    }

}
