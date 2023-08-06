package com.iamjohnnysam.personalfinancetracker.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Transaction(

    val date: Int,
    val category: Int,
    val currency: String,
    val amount: Double,
    val vendor: Int,
    val investment: Int,
    val comment: String,
    val rate: Float,
    val f_amount: Double,

    @PrimaryKey(autoGenerate = true)
    val id: Int? = 0,
    )
