package repetitivas;

import java.security.PrivateKey;
import java.util.Scanner;

public class Ejercicio_1 {

    //Atributos de la claase
    //Los pongo privados para que no se puedan modificar desde fuera de la clase
    private int numero;
    private Scanner scanner = new Scanner(System.in);
    private boolean running = true;
    private int suma = 0; //Creo la varaible suma para ir sumando los numeros que se introducen
    private int contador = 0; //Creo un contador para saber cuantos numeros se han introducido, es decir el numero de veces que he repetido la secuencia del while
    private double media = 0; //Creo una variable para calcular la media de los numeros introducidos

    public static void main(String[] args) {
        Ejercicio_1 ejercicio_1 = new Ejercicio_1();
        ejercicio_1.leerNumero();
    }

    private void leerNumero() {
        while (running) {
            contador++;
            System.out.println("Introduce un numero: ");
            numero = scanner.nextInt();
            calcularSuma();
            calcularMedia();
            if (numero == 0) {
                running = false;
                System.out.println("La suma de los numeros introducidos es: " + suma);
                System.out.println("La media de los numeros introducidos es: " + media);
            }
        }
    }

    private void calcularSuma() {
        suma += numero;
    }

    private void calcularMedia() {
        media = suma / contador;
    }
}
