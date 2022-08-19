package com.rd.mvvmshoppinglist.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.rd.mvvmshoppinglist.ShoppingItem

@Dao
interface ShoppingDao {
    @Insert(entity = ShoppingItem::class)
    fun upsert()
}