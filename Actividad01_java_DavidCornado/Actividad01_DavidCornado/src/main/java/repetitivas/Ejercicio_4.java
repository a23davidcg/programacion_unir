package repetitivas;

public class Ejercicio_4 {
    private int contadorMultiplosTresYSiete = 0;
    private int contadorMultiplosTres = 0;
    private int contadorMultiplosSiete = 0;
    private int contadorNoMultiplos = 0;

    public static void main(String[] args) {
        Ejercicio_4 ejercicio_4 = new Ejercicio_4();
        ejercicio_4.escribirNumeros();
    }

    public void escribirNumeros() {
        for (int i = 250; i >= 0; i--) {
            // Verificamos si el número es múltiplo de 3 y de 7
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println(i);
                contadorMultiplosTresYSiete++;
            }
            // Verificamos si es múltiplo de 3 únicamente
            else if (i % 3 == 0) {
                contadorMultiplosTres++;
            }
            // Verificamos si es múltiplo de 7 únicamente
            else if (i % 7 == 0) {
                contadorMultiplosSiete++;
            }
            // Si no es múltiplo de ninguno
            else {
                contadorNoMultiplos++;
            }
        }

        System.out.println("La cantidad de números múltiplos de 3 y 7 es: " + contadorMultiplosTresYSiete);
        System.out.println("La cantidad de números múltiplos de 3 es: " + contadorMultiplosTres);
        System.out.println("La cantidad de números múltiplos de 7 es: " + contadorMultiplosSiete);
        System.out.println("La cantidad de números que no son múltiplos de 3 ni de 7 es: " + contadorNoMultiplos);
    }
}
