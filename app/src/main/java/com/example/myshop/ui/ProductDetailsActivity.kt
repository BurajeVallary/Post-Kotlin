package com.example.myshop.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myshop.databinding.ActivityProductDetailsBinding


class ProductDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProductDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val productId = intent.getStringExtra("PRODUCT_ID")
        val title = intent.getStringExtra("PRODUCT_TITLE")
        val body = intent.getStringExtra("PRODUCT_IMAGE")


        populateProductDetails(
            productId, title,body
        )
    }

    private fun populateProductDetails(
        productId: String?,
        title: String?,
        body: String?,

    ) {
        binding.tvtitl.text = title
        binding.tvid.text = productId
        binding.tvbody.text = body.toString()


    }
}
