package org.example.sinLocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio hecho por David Cornado González" + System.lineSeparator());
        System.out.println("Fiesta 1 pasando parametros por el constructor: ");

        Fiesta fiesta1 = new Fiesta("Boda", "01/01/2023 20:30", "Calle 123", 10, 5, 20);
        Fiesta fiesta2 = new Fiesta();

        //Uso los setters para conformar la fiesta2
        fiesta2.setTipoFiesta("Cumpleaños");
        fiesta2.setFecha("06/03/2025 ");
        fiesta2.setHora("20:00");
        fiesta2.setDireccion("Saniago de Compostela");
        fiesta2.setBebidas(5);
        fiesta2.setBocadillos(10);
        fiesta2.setInvitados(15);

        //Muestro ambas fiestas 
        System.out.println("Fiesta 1: " + fiesta1);
        System.out.println("Fiesta 2: " + fiesta2);
        //uso lineSeparator para dar algo de formato en la salida, para que no quede todo apelotonado
        System.out.println(System.lineSeparator());

        //Hago uso de los motodos para invitar y cancelar invitaciones
        fiesta1.invitar();
        System.out.println("Invitados a la fiesta 1: " + fiesta1.getInvitados());
        fiesta1.invitar(20);
        System.out.println("Invitados a la fiesta 1 añadiendo la cantidad que quiera: " + fiesta1.getInvitados());

        fiesta1.cancelarInvitacion();
        System.out.println("Invitados a la fiesta 1: " + fiesta1.getInvitados());
        fiesta1.cancelarInvitacion(13);
        System.out.println("Invitados a la fiesta 1 cancelando la cantidad que quiera: " + fiesta1.getInvitados());
        System.out.println(System.lineSeparator());

        //Uso los mismos metodos para la fiesta 2
        fiesta2.invitar();
        System.out.println("Invitados a la fiesta 2: " + fiesta2.getInvitados());
        fiesta2.cancelarInvitacion();
        System.out.println("Invitados a la fiesta 2: " + fiesta2.getInvitados());

        fiesta2.invitar(100);
        System.out.println("Se invitan 100:" + fiesta2.getInvitados());

        fiesta2.cancelarInvitacion(50);
        System.out.println("Se cancelan 50:" + fiesta2.getInvitados());

        System.out.println(System.lineSeparator());


        //Uso de los getters para acceder a los valores de los atributos que me faltan
        System.out.println("Direccion de la fiesta 1: " + fiesta1.getDireccion());
        System.out.println("Direccion de la fiesta 2: " + fiesta2.getDireccion());
        System.out.println("Tipo de la fiesta 1: " + fiesta1.getTipoFiesta());
        System.out.println("Tipo de la fiesta 2: " + fiesta2.getTipoFiesta());
        System.out.println("Bocadillos de la fiesta 1: " + fiesta1.getBocadillos());
        System.out.println("Bocadillos de la fiesta 2: " + fiesta2.getBocadillos());
        System.out.println("Bebidas de la fiesta 1: " + fiesta1.getBebidas());
        System.out.println("Bebidas de la fiesta 2: " + fiesta2.getBebidas());
        System.out.println("fecha y hora de la fiesta 1: " + fiesta1.getFecha() + " " + fiesta1.getHora());
        System.out.println("FEcha y hora de la fiesta 2: " + fiesta2.getFecha() + " " + fiesta2.getHora());
        System.out.println(System.lineSeparator());
        

        //Precios finales de las fiesta tras todas las modificaciones en cuanto a los invitados
        System.out.println("Precio de la fiesta 1: " + fiesta1.precioFiesta() + " Euros");
        System.out.println("Precio de la fiesta 2: " + fiesta2.precioFiesta() + " Euros");

    }
}