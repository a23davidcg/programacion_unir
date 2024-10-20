package repetitivas;

import java.util.Scanner;

public class Ejercicio_2 {

    //Atributos de la clase privados para que no se pueda modificar desde fuera de la clase
    private int numero1;
    private int numero2;
    private boolean running = true;
    private int contadorIguales = 0;
    private int contadorMayores = 0;
    private int contadorMenores = 0;
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Ejercicio_2 ejercicio_2 = new Ejercicio_2();
        ejercicio_2.leerNumeros();
    }

    private void leerNumeros() {
        while (running) {
            System.out.println("Introduce el primer número: ");
            numero1 = scanner.nextInt();
            System.out.println("Introduce el segundo número: ");
            numero2 = scanner.nextInt();
            System.out.println();

            if (numero1 == -1 || numero2 == -1) {
                System.out.println("La cantidad de numeros iguales ha sido: " + contadorIguales);
                System.out.println("La cantidad de numeros mayores ha sido: " + contadorMayores);
                System.out.println("La cantidad de numeros menores ha sido: " + contadorMenores);
                running = false;
            } else if (numero1 == numero2) {
                contadorIguales++;
            } else if (numero1 > numero2) {
                contadorMayores++;
            } else {
                contadorMenores++;
            }
        }
    }
}
