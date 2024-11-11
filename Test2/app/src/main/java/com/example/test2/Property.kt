package com.example.test2

data class Property(
    val zone: Zone,
    val extensionInSquareMeters: Double,
    val owner: Owner
){
    fun getAmountToPay() = zone.cost * extensionInSquareMeters
}