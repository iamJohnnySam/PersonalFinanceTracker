package com.iamjohnnysam.personalfinancetracker.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface TransactionDao {

    @Upsert
    suspend fun upsertTransaction (transaction: Transaction)

    @Delete
    suspend fun deleteTransaction (transaction: Transaction)

    @Query("SELECT * FROM `transaction` ORDER BY date ASC")
    fun getTransactionOrderedByDate(): Flow<List<Transaction>>
}