package org.example.ejercicios;

import java.util.Scanner;

public class Ejercicio_5 {

    /**
     * declaro las variables que voy a utilizar
     * dos de ellas son final (constantes) ya que no van a cambiar y son las que me da el enunciado del ejercicio para
     * hacer las comprobacions necesarias
     */
    private Scanner sc = new Scanner(System.in);
    private final String NOMBRE_CONST = "sara";
    private final String CONTRASENIA_CONST = "sarita";

    public static void main(String[] args) {
        Ejercicio_5 ejercicio = new Ejercicio_5();
        ejercicio.pedirNombre();

    }

    //Metodo que me permite pedir el nombre y comprobar si es correcto
    private void pedirNombre() {
        System.out.println("Introduce tu nombre: ");
        String nombreIntroducido = sc.nextLine();
        if (nombreIntroducido.equals(NOMBRE_CONST)) {//Se hace uso del nombre constante para hacer la comprobacion
            pedirContrasenia();
        } else {
            System.out.println("El nombre introducido no es correcto");
        }

    }

    //Metodo que me permite pedir la contraseña y comprobar si es correcta
    private void pedirContrasenia() {
        System.out.println("Introduce tu contraseña: ");
        String contraseniaIntroducida = sc.nextLine();
        if (contraseniaIntroducida.equals(CONTRASENIA_CONST)) { //Se hace uso de la contraseñá constante para hacer la comprobacion
            System.out.println("Bienvenid@ " + NOMBRE_CONST);
        } else {
            System.out.println("La contraseña introducida no es correcta");
        }
    }
}
