package com.example.employeemanagement

class CommissionEmployee(
    name: String,
    id: String,
    private val baseSalary: Double,
    private val commissionRate: Double,
    private val salesGenerated: Double
) : Employee(name, id) {

    override fun calculateSalary(): Double {
        return baseSalary + (commissionRate * salesGenerated)
    }
}
