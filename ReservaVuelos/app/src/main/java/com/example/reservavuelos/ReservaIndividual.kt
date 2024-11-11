package com.example.reservavuelos

class ReservaIndividual(
    private val pasajero: String,
    private val tarifa: String,
    private val costoBase: Double
) : Reserva {

    override fun calcularCosto(): Double {
        return when (tarifa.toLowerCase()) {
            "economica" -> costoBase
            "ejecutiva" -> costoBase * 1.5
            else -> costoBase
        }
    }
}