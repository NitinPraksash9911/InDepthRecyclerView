package com.example.indepthrecyclerview.nestedrv.ui

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.indepthrecyclerview.nestedrv.data.model.UserWithSubject
import com.example.indepthrecyclerview.databinding.ParentItemLayoutBinding
import com.example.indepthrecyclerview.base.BaseViewHolder
import com.example.indepthrecyclerview.nestedrv.data.model.UserWithSubject.UserWithSubjectDiffUtil
import com.example.indepthrecyclerview.nestedrv.ui.ParentAdapter.ParentViewHolder

const val TAG="NestedRV"
class ParentAdapter :
    ListAdapter<UserWithSubject, ParentViewHolder>(UserWithSubjectDiffUtil) {

    val viewPool = RecyclerView.RecycledViewPool()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParentViewHolder {

        val binding = ParentItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        Log.d(TAG, "Parent onCreateViewHolder Nested")


        return ParentViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ParentViewHolder, position: Int) {

        holder.bind(getItem(position))
        Log.d(TAG, "Parent onBindViewHolder: $position")

    }

    inner class ParentViewHolder(private var binding: ParentItemLayoutBinding) : BaseViewHolder<UserWithSubject>(binding) {

        override fun bind(item: UserWithSubject) {

            binding.user = item.user

            val childLayoutManager = LinearLayoutManager(binding.childRv.context, LinearLayoutManager.HORIZONTAL, false)

            /**
             * RecyclerView fetches children on demand when it’s attached and laid out.
             * This tells the system how many items to prefetch to fill the RecyclerView when it’s about to scroll on screen
             * */
            childLayoutManager.initialPrefetchItemCount = 10

            val childAdapter = ChildAdapter()
            childAdapter.submitList(item.subjects)
            binding.childRv.apply {
                layoutManager = childLayoutManager
                adapter = childAdapter

                /**
                 * Share the recyclerView pool
                 * otherwise child RecyclerView automatically creates a pool for itself if you don't provide one.
                 * */
                setRecycledViewPool(viewPool)
            }

        }

    }

}