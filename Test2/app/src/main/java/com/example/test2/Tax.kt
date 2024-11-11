package com.example.test2

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.time.Month

data class Tax(val properties:List<Property>,
               val paymentDate: LocalDate){

    fun getAmount():Double{
        return properties.sumOf { it.getAmountToPay() }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun getDiscount(): Double{
        val owner= this.properties[0].owner
        val total = this.getAmount()
        return (if (owner.getAge()>=70 || owner.singleMother){
            if (paymentDate.month <= Month.FEBRUARY)
                total * 0.70
            else
                total * 0.50
        } else if (paymentDate.month <= Month.FEBRUARY)
            total * 0.40
        else
            0.0
                )
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun getAmountWithDiscount():Double{
        return getAmount()-getDiscount()
    }
}
