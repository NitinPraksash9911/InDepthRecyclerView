package com.example.indepthrecyclerview.base

import android.os.Bundle
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<B : ViewBinding> : AppCompatActivity() {
    protected lateinit var mBinding: B

    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = getViewBinding()
        setContentView(mBinding.root)
    }

    abstract fun getViewBinding(): B
}