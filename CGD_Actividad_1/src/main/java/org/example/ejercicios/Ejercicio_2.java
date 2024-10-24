package org.example.ejercicios;

public class Ejercicio_2 {

    //Diseñar un programa que muestre el producto y la suma de los 10 primeros números impares.

    //Declaro las variables que voy a utilizar en los metodos
    private int sumaNumerosImpares = 0;
    private int productoNumerosImpares = 1;

    public static void main(String[] args) {
        
        //Creo un objeto de la clase Ejercicio_2 para poder llamar a los metodos
        Ejercicio_2 ejercicio = new Ejercicio_2();
        //Llamo al metodo que me permite sumar los 10 primeros numeros impares
        ejercicio.sumaImpares();
        //llamo al metodo que me perimite multiplicar los 10 primeros numeros impares
        ejercicio.productoImpares();
    }

    //metodo que me permite sumar los 10 primeros numeros impares
    private void sumaImpares() {
        //Uso del for para recorrer los 10 primeros impares es decir hacer 10 iteraciones ys sumar los numeros impares
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                sumaNumerosImpares += i;
            }
        }
        System.out.println("La suma de los 10 primeros números impares es: " + sumaNumerosImpares);
    }

    private void productoImpares() {

        //Uso del for para recorrer los 10 primeros impares es decir hacer 10 iteraciones y multiplicarlos
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                productoNumerosImpares *= i;
            }
        }
        System.out.println("El producto de los 10 primeros números impares es: " + productoNumerosImpares);
    }
}
