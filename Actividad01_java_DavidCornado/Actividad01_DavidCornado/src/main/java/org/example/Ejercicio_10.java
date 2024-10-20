package org.example;

import java.util.Scanner;

public class Ejercicio_10 {
    String user;
    String password;
    Scanner sc = new Scanner(System.in);

    //Creo el constructor en donde iniciaizo las variables del string para usuario y contraseña en donde se le da los valores del enunciado
    public Ejercicio_10() {
        this.user = "Sara";
        this.password = "Sarita";
    }

    public static void main(String[] args) {
        Ejercicio_10 ejercicio_10 = new Ejercicio_10();
        ejercicio_10.login();
    }

    private String pedirNombre() {
        System.out.println("Introduce tu nombre de usuario: ");
        return sc.nextLine();
    }

    private String pedirContrasenia() {
        System.out.println("Introduce tu contraseña: ");
        return sc.nextLine();
    }

    private void login() {
        //Creo este metodo para verificar si el usuario ha introducido las crendenciales de forma correcta para logearse
        //Bucle infinito para que el usuario pueda intentar logearse las veces que quiera
        //Podria hacerse con un bucle for, y limitar el nuimero de intentos
        while (true) {

            String nombre = pedirNombre();
            String contrasenia = pedirContrasenia();

            if (nombre.equals(user) && contrasenia.equals(password)) {
                System.out.println("Bienvenido " + user);
                break;
            } else {
                System.out.println("Usuario o contraseña incorrectos");
            }
        }
    }
}
