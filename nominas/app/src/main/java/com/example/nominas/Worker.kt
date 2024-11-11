package com.example.nominas

data class Worker(
    val nombre: String,
    val categoria: Int,
    val horasTrabajadas: Int,
    val horasExtras: Int
) {
    companion object {
        const val precioBaseHora = 90.0
    }

    fun getPrecioHora(): Double {
        return when (categoria) {
            1 -> precioBaseHora * 1.45
            2 -> precioBaseHora * 1.25
            else -> precioBaseHora
        }
    }

    fun getPrecioHorasExtras(): Double {
        return when {
            horasExtras < 10 -> getPrecioHora() * 1.5
            horasExtras <= 20 -> getPrecioHora() * 1.4
            else -> getPrecioHora() * 1.2
        }
    }

    fun getSalarioSemanal(): Double {
        return horasTrabajadas * getPrecioHora() + horasExtras * getPrecioHorasExtras()
    }
}