package com.rd.mvvmshoppinglist.ui.shoppinglist

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.rd.mvvmshoppinglist.databinding.ActivityShoppingBinding

class ShoppingListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityShoppingBinding

    private lateinit var view: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShoppingBinding.inflate(layoutInflater)
        view = binding.root
        setContentView(view)

        val viewModel = ViewModelProvider(this)[ShoppingViewModel::class.java]
    }
}