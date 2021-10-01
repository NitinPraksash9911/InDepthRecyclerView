package com.example.indepthrecyclerview.nestedrv.data.model

import androidx.recyclerview.widget.DiffUtil.ItemCallback
import com.example.indepthrecyclerview.linearrv.data.model.User

data class UserWithSubject(var id: Int, var user: User, var subjects: List<Subject>) {

    data class Subject(
        var id: Int,
        var subjectName: String,
        var thumnail: String
    ) {

        object SubjectDiffUtil : ItemCallback<Subject>() {

            override fun areItemsTheSame(oldItem: Subject, newItem: Subject): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Subject, newItem: Subject): Boolean {
                return oldItem == newItem
            }

        }

    }

    object UserWithSubjectDiffUtil : ItemCallback<UserWithSubject>() {

        override fun areItemsTheSame(oldItem: UserWithSubject, newItem: UserWithSubject): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: UserWithSubject, newItem: UserWithSubject): Boolean {
            return oldItem == newItem
        }

    }

}