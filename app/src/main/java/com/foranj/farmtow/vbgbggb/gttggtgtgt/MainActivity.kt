package com.foranj.farmtow.vbgbggb.gttggtgtgt

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.foranj.farmtow.R
import com.foranj.farmtow.hnhjujujuuj.JIjrfjrfirfijrf
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named

class MainActivity : AppCompatActivity() {

    val gt5gt5gt5gt by viewModel <JIjrfjrfirfijrf>(named("MainModel"))

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gt5gt5gt5gt.gttghyhyhy(this@MainActivity)
    }
}