package com.example.employeemanagement

class HourlyEmployee(
    name: String,
    id: String,
    private val hourlyRate: Double,
    private val hoursWorked: Int
) : Employee(name, id) {

    override fun calculateSalary(): Double {
        val regularHours = minOf(hoursWorked, 40)
        val overtimeHours = maxOf(hoursWorked - 40, 0)
        return (regularHours * hourlyRate) + (overtimeHours * hourlyRate * 1.5)
    }
}
