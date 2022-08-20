package com.rd.mvvmshoppinglist.ui.shoppinglist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rd.mvvmshoppinglist.data.db.entities.ShoppingItem
import com.rd.mvvmshoppinglist.data.repositories.ShoppingRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class ShoppingViewModel(private val shoppingRepository: ShoppingRepository) : ViewModel() {

    fun upsert(item: ShoppingItem) = viewModelScope.launch {
        shoppingRepository.upsert(item)
    }

    fun delete(item: ShoppingItem) = viewModelScope.launch {
        shoppingRepository.delete(item)
    }

    fun getAllShoppingItems() = viewModelScope.launch {
        shoppingRepository.getAllShoppingItem()
    }
}