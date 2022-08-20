package com.rd.mvvmshoppinglist

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shopping_items")
data class ShoppingItem(
    @PrimaryKey val gid: Int,
    @ColumnInfo(name = "item_name") val name: String,
    @ColumnInfo(name = "item_amount") val amount: Int,
//    @ColumnInfo(name = "item_price") val price: Double,
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}
