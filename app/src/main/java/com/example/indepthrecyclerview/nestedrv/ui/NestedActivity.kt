package com.example.indepthrecyclerview.nestedrv.ui

import android.os.Bundle
import com.example.indepthrecyclerview.base.BaseActivity
import com.example.indepthrecyclerview.databinding.ActivityNestedBinding
import com.example.indepthrecyclerview.nestedrv.data.repository.UserWithSubjectFakeRepository

class NestedActivity : BaseActivity<ActivityNestedBinding>() {

    private lateinit var parenAdapter: ParentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initView()
    }

    override fun getViewBinding() = ActivityNestedBinding.inflate(layoutInflater)

    private fun initView() {

        parenAdapter = ParentAdapter()
        mBinding.recyclerView.adapter = parenAdapter
        parenAdapter.submitList(UserWithSubjectFakeRepository.userWithSubjectList)
    }

}