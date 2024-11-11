package com.example.reservavuelos

class ReservaGrupal(
    private val reservas: MutableList<Reserva> = mutableListOf(),
    private val descuento: Double = 0.0
) : Reserva {

    fun agregarReserva(reserva: Reserva) {
        reservas.add(reserva)
    }

    override fun calcularCosto(): Double {
        val costoTotal = reservas.sumOf { it.calcularCosto() }
        return costoTotal * (1 - descuento)
    }
}