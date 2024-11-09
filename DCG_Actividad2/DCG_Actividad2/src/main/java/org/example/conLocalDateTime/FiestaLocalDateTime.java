package org.example.conLocalDateTime;

import java.time.LocalDateTime;

public class FiestaLocalDateTime {
    private String tipoFiesta;
    private String direccion;
    private int bocadillos;
    private int bebidas;
    private int invitados;

    private LocalDateTime fechaHora;

    //Constantes para los precios, se usa la palabra final para establecerlos como tal
    private final int PRECIO_BOCADILLO = 3;
    private final int PRECIO_BEBIDA = 2;
    private final int PRECIO_INVITADO = 5;

    public FiestaLocalDateTime(String tipoFiesta, String direccion, int bocadillos, int bebidas, int invitados, LocalDateTime fechaHora) {
        this.tipoFiesta = tipoFiesta;
        this.direccion = direccion;
        this.bocadillos = bocadillos;
        this.bebidas = bebidas;
        this.invitados = invitados;
        this.fechaHora = fechaHora;
    }

    public FiestaLocalDateTime() {
    }

    public String getTipoFiesta() {
        return tipoFiesta;
    }

    public void setTipoFiesta(String tipoFiesta) {
        this.tipoFiesta = tipoFiesta;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getBocadillos() {
        return bocadillos;
    }

    public void setBocadillos(int bocadillos) {
        this.bocadillos = bocadillos;
    }

    public int getBebidas() {
        return bebidas;
    }

    public void setBebidas(int bebidas) {
        this.bebidas = bebidas;
    }

    public int getInvitados() {
        return invitados;
    }

    public void setInvitados(int invitados) {
        this.invitados = invitados;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    //Metodos del enunciado

    //Metodo que cuando se le hace una llamada, aumenta 1 a la cantidad de invitados que tenemos
    public int invitar() {
        return invitados += 1;
    }

    //Metodo que resta 1 a la cantidad e invitados que tenemos, lo  he personalizado para evitar negativos
    public int cancelarInvitacion() {
        if (invitados == 0) {
            return 0;
        }
        return invitados -= 1;
    }

    //Con este metodo se suma la cantidad de invitados que queramos
    public int invitar(int cantidad) {
        return invitados += cantidad;
    }

    //Con este metodo se resta la cantidad de invitados concreta que queremos restar a los invitados
    public int cancelarInvitacion(int cantidad) {
        if (invitados == 0) {
            return 0;
        }
        return invitados -= cantidad;
    }

    //Con este metodo calculamos el precio final de la fiesta
    public int precioFiesta() {
        return (PRECIO_INVITADO * invitados) + (PRECIO_BEBIDA * bebidas) + (PRECIO_BOCADILLO * bocadillos);
    }

    //El metodo toString se hace uso del mismo cada vez que se imprime algo por la consola
    @Override
    public String toString() {
        return "FiestaLocalDateTime{" +
                "tipoFiesta='" + tipoFiesta + '\'' +
                ", direccion='" + direccion + '\'' +
                ", bocadillos=" + bocadillos +
                ", bebidas=" + bebidas +
                ", invitados=" + invitados +
                ", fechaHora=" + fechaHora +
                '}';
    }
}
