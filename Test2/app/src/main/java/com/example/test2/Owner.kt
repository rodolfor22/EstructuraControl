package com.example.test2
import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

data class Owner(
    val fullName: String,
    val dateOfBirth: LocalDate,
    val singleMother: Boolean){

    @RequiresApi(Build.VERSION_CODES.O)
    fun getAge(): Int {
        val currentDate = LocalDate.now()
        val currentYear = currentDate.year
        val currentMonth = currentDate.monthValue
        val currentDay = currentDate.dayOfMonth

        val year =  if (currentMonth<dateOfBirth.monthValue ||
            currentMonth==dateOfBirth.monthValue &&
            currentDay<dateOfBirth.dayOfMonth){
            currentYear-dateOfBirth.year - 1
        }else{
            currentYear-dateOfBirth.year
        }
        return year
    }
}