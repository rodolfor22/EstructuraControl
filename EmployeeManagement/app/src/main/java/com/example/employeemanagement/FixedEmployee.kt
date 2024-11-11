package com.example.employeemanagement

class FixedEmployee(
    name: String,
    id: String,
    private val fixedSalary: Double
) : Employee(name, id) {

    override fun calculateSalary(): Double {
        return fixedSalary
    }
}
