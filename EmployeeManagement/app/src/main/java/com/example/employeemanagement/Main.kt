package com.example.employeemanagement

fun main() {
    val employees = listOf(
        FixedEmployee(name = "Juan Perez", id = "E001", fixedSalary = 3000.0),
        HourlyEmployee(name = "Ana Garcia", id = "E002", hourlyRate = 20.0, hoursWorked = 45),
        CommissionEmployee(name = "Luis Lopez", id = "E003", baseSalary = 1500.0, commissionRate = 0.10, salesGenerated = 5000.0)
    )

    employees.forEach { employee ->
        println("${employee.name} (ID: ${employee.id}) -> Salario mensual: ${employee.calculateSalary()}")
    }
}
