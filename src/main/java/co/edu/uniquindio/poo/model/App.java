package co.edu.uniquindio.poo.model;

import java.time.LocalDate;


public class App {
    public static void main(String[] args) {
        var cliente = new Cliente("Jorge", "123456");
        var cliente2 = new Cliente("Camila", "7777777");


        Habitacion habitacion101 = new Habitacion(101, TipoHabitacion.DOBLE, 2000);
        Habitacion habitacion102 = new Habitacion(102, TipoHabitacion.SUITE, 2200);
        Habitacion habitacion103 = new Habitacion(103, TipoHabitacion.SUITE, 5000);



        GestionReservas gestorDeReservas = new GestionReservas();

        Reserva reserva1 = new Reserva(habitacion101, cliente, LocalDate.of(2024, 2, 21), LocalDate.of(2024, 3, 1));
        Reserva reserva2 = new Reserva(habitacion102, cliente, LocalDate.of(2024, 2, 21), LocalDate.of(2024, 3, 1));
        Reserva reserva3 = new Reserva(habitacion103, cliente2, LocalDate.of(2024, 2, 21), LocalDate.of(2024, 3, 1));



        gestorDeReservas.agregarReserva(reserva1);
        gestorDeReservas.agregarReserva(reserva2);
        gestorDeReservas.agregarReserva(reserva3);
        System.out.println(gestorDeReservas.obtenerReservasActivasPorCliente(cliente2));
    }
}
