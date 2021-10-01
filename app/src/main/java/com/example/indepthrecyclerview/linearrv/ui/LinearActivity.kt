package com.example.indepthrecyclerview.linearrv.ui

import android.os.Bundle
import android.widget.Toast
import com.example.indepthrecyclerview.base.BaseActivity
import com.example.indepthrecyclerview.databinding.ActivityLinearBinding
import com.example.indepthrecyclerview.linearrv.data.model.User
import com.example.indepthrecyclerview.linearrv.data.repository.UserFakeRepository
import com.example.indepthrecyclerview.linearrv.ui.UserAdapter.UserAdapterClickEvent

class LinearActivity : BaseActivity<ActivityLinearBinding>() {

    private lateinit var userAdapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initView()
    }

    override fun getViewBinding() = ActivityLinearBinding.inflate(layoutInflater)

    private fun initView() {

        userAdapter = UserAdapter(object : UserAdapterClickEvent {
            override fun onItemClick(name: User) {
                Toast.makeText(this@LinearActivity, name.toString(), Toast.LENGTH_LONG).show()

            }

        })
        mBinding.recyclerView.adapter = userAdapter
        userAdapter.submitList(UserFakeRepository.userList)
    }

}