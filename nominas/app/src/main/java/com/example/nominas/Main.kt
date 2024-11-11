package com.example.nominas

fun main() {
    val workers = listOf(
        Worker("Pedro L.", categoria = 1, horasTrabajadas = 20, horasExtras = 1),
        Worker("Luis P.", categoria = 2, horasTrabajadas = 39, horasExtras = 5),
        Worker("Angel G.", categoria = 3, horasTrabajadas = 41, horasExtras = 20)
    )

    workers.forEach { worker ->
        println("${worker.nombre} -> Sueldo semanal: ${worker.getSalarioSemanal()}")
    }
}
