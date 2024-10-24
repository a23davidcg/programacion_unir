package org.example.ejercicios;

public class Ejercicio_3 {
    
    private int contador =0 ;
    private int contadorPares = 0;
    private int sumaNumerosEscritos = 0;

    public static void main(String[] args) {
        Ejercicio_3 ejercicio = new Ejercicio_3();
        ejercicio.escribirNumeros();
        System.out.println("La suma de los 100 primeros números pares es: " + ejercicio.sumaNumerosEscritos);
        System.out.println("El número de los 100 primeros números pares es: " + ejercicio.contadorPares);
        System.out.println("Se han escrito " + ejercicio.contador + " números");
    }
    
    private void escribirNumeros(){
        
        //Uso de u for para recorrer los 100 primeros numeros y dentro del mismo se compruba si es par o no para proceder  amostrarlo por consola
        for (int i = 0; i < 100; i+=7) {
            System.out.print(i + ", ");
            if (i % 2 == 0) {
                //Auemnto el contador de numeros pares
                contadorPares++;
            }
            //Suma de los numeros que se han mostrado por la consola
            sumaNumerosEscritos += i;
            //aumento del contador que se usa para seber el numero de iteraciones que lleva el for 
            contador++;
        }
    }
}
