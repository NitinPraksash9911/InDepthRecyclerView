package com.example.indepthrecyclerview.nestedrv.ui

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.indepthrecyclerview.nestedrv.data.model.UserWithSubject.Subject
import com.example.indepthrecyclerview.databinding.ChildItemLayoutBinding
import com.example.indepthrecyclerview.base.BaseViewHolder
import com.example.indepthrecyclerview.nestedrv.ui.ChildAdapter.ChildViewHolder

class ChildAdapter : ListAdapter<Subject, ChildViewHolder>(Subject.SubjectDiffUtil) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder {

        val binding = ChildItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        Log.d(TAG, "child onCreateViewHolder")

        return ChildViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {

        Log.d(TAG, "child onBindViewHolder: $position")

        holder.bind(getItem(position))
    }

    inner class ChildViewHolder(private var binding: ChildItemLayoutBinding) : BaseViewHolder<Subject>(binding) {

        override fun bind(item: Subject) {

            binding.subject = item

        }

    }

}