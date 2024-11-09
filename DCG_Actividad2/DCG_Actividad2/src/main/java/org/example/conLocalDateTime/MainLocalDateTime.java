package org.example.conLocalDateTime;

import java.time.LocalDateTime;

public class MainLocalDateTime {
    public static void main(String[] args) {
        // Crear un objeto FiestaLocalDateTime usando el constructor completo
        FiestaLocalDateTime fiestaCumpleaños = new FiestaLocalDateTime(
                "Cumpleaños", "Calle Falsa 123", 10, 20, 15, LocalDateTime.of(2023, 12, 24, 20, 0));

        // Crear un objeto FiestaLocalDateTime usando el constructor vacío y configurarlo con setters
        FiestaLocalDateTime fiestaNavidad = new FiestaLocalDateTime();
        fiestaNavidad.setTipoFiesta("Navidad");
        fiestaNavidad.setDireccion("Av. Navidad 456");
        fiestaNavidad.setBocadillos(30);
        fiestaNavidad.setBebidas(40);
        fiestaNavidad.setInvitados(50);
        fiestaNavidad.setFechaHora(LocalDateTime.of(2023, 12, 25, 21, 0));

        // Imprimir información de ambas fiestas
        System.out.println("Información de la fiesta de cumpleaños: ");
        System.out.println(fiestaCumpleaños.toString());
        System.out.println("Información de la fiesta de navidad: ");
        System.out.println(fiestaNavidad.toString());

        // Llamar a los métodos para agregar y cancelar invitados en la fiesta de cumpleaños
        System.out.println("\nInvitar a 1 persona más a la fiesta de cumpleaños.");
        fiestaCumpleaños.invitar();
        System.out.println("Invitados después de invitar a 1: " + fiestaCumpleaños.getInvitados());

        System.out.println("Invitar a 3 personas más a la fiesta de cumpleaños.");
        fiestaCumpleaños.invitar(3);
        System.out.println("Invitados después de invitar a 3: " + fiestaCumpleaños.getInvitados());

        System.out.println("Cancelar invitación para 1 persona en la fiesta de cumpleaños.");
        fiestaCumpleaños.cancelarInvitacion();
        System.out.println("Invitados después de cancelar 1 invitación: " + fiestaCumpleaños.getInvitados());

        System.out.println("Cancelar invitación para 2 personas en la fiesta de cumpleaños.");
        fiestaCumpleaños.cancelarInvitacion(2);
        System.out.println("Invitados después de cancelar 2 invitaciones: " + fiestaCumpleaños.getInvitados());

        // Calcular y mostrar el precio de ambas fiestas
        System.out.println("\nPrecio total de la fiesta de cumpleaños: " + fiestaCumpleaños.precioFiesta() + " euros.");
        System.out.println("Precio total de la fiesta de navidad: " + fiestaNavidad.precioFiesta() + " euros.");
    }
}
