package com.example.indepthrecyclerview.hetrogenousrv.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.indepthrecyclerview.R
import com.example.indepthrecyclerview.hetrogenousrv.data.model.MoviesData
import com.example.indepthrecyclerview.hetrogenousrv.data.model.MoviesData.Director
import com.example.indepthrecyclerview.hetrogenousrv.data.model.MoviesData.Movie
import com.example.indepthrecyclerview.hetrogenousrv.data.model.MoviesData.MoviesDiffUtil
import com.example.indepthrecyclerview.hetrogenousrv.data.model.MoviesData.Title
import com.example.indepthrecyclerview.databinding.DirectorItemLayoutBinding
import com.example.indepthrecyclerview.databinding.MovieItemLayoutBinding
import com.example.indepthrecyclerview.databinding.TitleItemLayoutBinding
import com.example.indepthrecyclerview.base.BaseViewHolder

class HeterogenousAdapter : ListAdapter<MoviesData, BaseViewHolder<MoviesData>>(MoviesDiffUtil) {

    @Suppress("UNCHECKED_CAST")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<MoviesData> {

        return when (viewType) {

            R.layout.movie_item_layout -> {

                MovieViewHolder(
                    MovieItemLayoutBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                ) as BaseViewHolder<MoviesData>
            }
            R.layout.director_item_layout -> {
                DirectorViewHolder(
                    DirectorItemLayoutBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                ) as BaseViewHolder<MoviesData>

            }

            R.layout.title_item_layout -> {
                TitleViewHolder(
                    TitleItemLayoutBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                ) as BaseViewHolder<MoviesData>

            }
            else -> throw IllegalArgumentException("Invalid ViewType Provided")

        }
    }

    override fun onBindViewHolder(holder: BaseViewHolder<MoviesData>, position: Int) {

        holder.bind(getItem(position))
    }

    override fun getItemViewType(position: Int): Int {
        return when (getItem(position)) {
            is Movie -> R.layout.movie_item_layout
            is Director -> R.layout.director_item_layout
            is Title -> R.layout.title_item_layout
        }
    }

    class MovieViewHolder(private var binding: MovieItemLayoutBinding) : BaseViewHolder<Movie>(binding) {

        override fun bind(item: Movie) {

            binding.movie = item

        }

    }

    class TitleViewHolder(private var binding: TitleItemLayoutBinding) : BaseViewHolder<Title>(binding) {

        override fun bind(item: Title) {
            binding.title = item

        }

    }

    class DirectorViewHolder(private var binding: DirectorItemLayoutBinding) : BaseViewHolder<Director>(binding) {

        override fun bind(item: Director) {
            binding.director = item

        }
    }


}