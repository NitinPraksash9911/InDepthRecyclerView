package com.example.indepthrecyclerview.linearrv.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.indepthrecyclerview.linearrv.data.model.User
import com.example.indepthrecyclerview.databinding.UserItemLayoutBinding
import com.example.indepthrecyclerview.base.BaseViewHolder
import com.example.indepthrecyclerview.linearrv.ui.UserAdapter.UserViewHolder

class UserAdapter(private var userAdapterClickEvent: UserAdapterClickEvent) :
    ListAdapter<User, UserViewHolder>(User.UserDiffUtil) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {

        val itemLayoutBinding = UserItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return UserViewHolder(
            itemLayoutBinding, userAdapterClickEvent
        )
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

        holder.bind(getItem(position))
    }

    class UserViewHolder(private val binding: UserItemLayoutBinding, userAdapterClickEvent: UserAdapterClickEvent) :
        BaseViewHolder<User>(binding) {

        init {

            binding.rootLayout.setOnClickListener {
                userAdapterClickEvent.onItemClick(binding.user!!)
            }

        }

       override fun bind(item: User) {
            binding.user = item
        }

    }

    interface UserAdapterClickEvent {

        fun onItemClick(name: User)
    }

}