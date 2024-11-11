package com.example.employeemanagement

abstract class Employee(
    val name: String,
    val id: String
) {
    abstract fun calculateSalary(): Double
}
