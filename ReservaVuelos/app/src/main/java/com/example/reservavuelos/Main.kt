package com.example.reservavuelos

fun main() {
    // Crear reservas individuales
    val reserva1 = ReservaIndividual("Juan Perez", "economica", 100.0)
    val reserva2 = ReservaIndividual("Ana Garcia", "ejecutiva", 200.0)

    // Crear una reserva grupal
    val reservaGrupal1 = ReservaGrupal(descuento = 0.1) // 10% de descuento
    reservaGrupal1.agregarReserva(reserva1)
    reservaGrupal1.agregarReserva(reserva2)

    // Crear otra reserva individual y añadirla a otra reserva grupal
    val reserva3 = ReservaIndividual("Carlos Ruiz", "economica", 150.0)
    val reservaGrupal2 = ReservaGrupal()
    reservaGrupal2.agregarReserva(reserva3)
    reservaGrupal2.agregarReserva(reservaGrupal1) // agregar reserva grupal dentro de otra grupal

    // Calcular costos
    println("Costo de la primera reserva individual: ${reserva1.calcularCosto()}")
    println("Costo de la segunda reserva individual: ${reserva2.calcularCosto()}")
    println("Costo total de la primera reserva grupal: ${reservaGrupal1.calcularCosto()}")
    println("Costo total de la segunda reserva grupal (incluye la primera grupal): ${reservaGrupal2.calcularCosto()}")
}
