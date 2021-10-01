package com.example.indepthrecyclerview.hetrogenousrv.ui

import android.os.Bundle
import com.example.indepthrecyclerview.base.BaseActivity
import com.example.indepthrecyclerview.databinding.ActivityHeterogenousBinding
import com.example.indepthrecyclerview.hetrogenousrv.data.repository.MovieFakeRepository

class HeterogenousActivity : BaseActivity<ActivityHeterogenousBinding>() {


    private lateinit var heterogenousAdapter: HeterogenousAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initView()
    }

    private fun initView() {

        heterogenousAdapter = HeterogenousAdapter()
        mBinding.recyclerView.adapter = heterogenousAdapter
        heterogenousAdapter.submitList(MovieFakeRepository.moviesList)
    }

    override fun getViewBinding() = ActivityHeterogenousBinding.inflate(layoutInflater)
}