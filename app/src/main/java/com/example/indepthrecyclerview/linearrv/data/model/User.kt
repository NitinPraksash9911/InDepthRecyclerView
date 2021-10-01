package com.example.indepthrecyclerview.linearrv.data.model

import androidx.recyclerview.widget.DiffUtil

data class User(var userId: Int, var name: String, var age: Int) {





    companion object {

        val UserDiffUtil = object : DiffUtil.ItemCallback<User>() {
            override fun areItemsTheSame(oldItem: User, newItem: User) = oldItem.userId == newItem.userId

            override fun areContentsTheSame(oldItem: User, newItem: User) =
                oldItem.name == newItem.name && oldItem.age == oldItem.age

        }
    }

}
