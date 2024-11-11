package com.example.test2

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    val zones = listOf(
        Zone(key = "MAR","Marginado",2.00),
        Zone(key = "RUR","Rural",8.00),
        Zone(key = "URB","Urbana",10.00),
        Zone(key = "RES","Residencial",25.00),
    )
    val owners = listOf(
        Owner( fullName = "Ambrosio Cardoso Jimenez",
            dateOfBirth =  LocalDate.parse("1974-12-07"),
            singleMother = false),
        Owner(fullName = "Rosa Maria Perez Perez",
            dateOfBirth = LocalDate.parse("2000-05-07"),
            singleMother = true)
    )

    val properties = listOf(
        Property(zones[3],200.00,owners[0] ),
        Property(zones[1],500.00,owners[0] ),
        Property(zones[1],1000.00,owners[1] ),
    )

    owners.forEach { owner ->
        val tax = Tax(properties.filter { it.owner == owner }, LocalDate.now())

        println("${owner.fullName} -> paga: ${tax.getAmountWithDiscount()}" )
    }
}
