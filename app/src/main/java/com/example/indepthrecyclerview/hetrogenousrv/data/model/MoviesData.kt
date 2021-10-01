package com.example.indepthrecyclerview.hetrogenousrv.data.model

import androidx.recyclerview.widget.DiffUtil

sealed class MoviesData {

    abstract val id: Int

    data class Title(
        val titleId: Int,
        val title: String
    ) : MoviesData() {

        override val id: Int
            get() = titleId
    }

    data class Movie(
        val movieId: Int,
        val title: String,
        val thumbnail: String,
        val release_date: String
    ) : MoviesData() {
        override val id: Int
            get() = movieId

    }

    data class Director(
        val directorId: Int,
        val name: String,
        val avatar: String,
        val movie_count: Int
    ) : MoviesData() {
        override val id: Int
            get() = directorId
    }

    object MoviesDiffUtil : DiffUtil.ItemCallback<MoviesData>() {
        override fun areItemsTheSame(oldItem: MoviesData, newItem: MoviesData): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: MoviesData, newItem: MoviesData): Boolean {
            return newItem == oldItem
        }

    }

}