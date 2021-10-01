package com.example.indepthrecyclerview.hetrogenousrv.data.repository

import com.example.indepthrecyclerview.hetrogenousrv.data.model.MoviesData.Director
import com.example.indepthrecyclerview.hetrogenousrv.data.model.MoviesData.Movie
import com.example.indepthrecyclerview.hetrogenousrv.data.model.MoviesData.Title

object MovieFakeRepository {

    val moviesList = listOf(
        Title(1, "NewMovies1"),
        Movie(1, "Krushshtra1", "https://picsum.photos/id/216/200/300", "111"),
        Director(1, "Directornam1", "https://picsum.photos/id/217/200/300", 111),

        Title(2, "NewMovies2"),
        Movie(2, "Krushshtra2", "https://picsum.photos/id/211/200/300", "22"),
        Director(2, "Directornam2", "https://picsum.photos/id/210/200/300", 33),

        Title(3, "NewMovies3"),
        Movie(3, "Krushshtra3", "https://picsum.photos/id/201/200/300", "213"),
        Director(3, "Directornam3", "https://picsum.photos/id/202/200/300", 2),

        Title(4, "NewMovies4"),
        Movie(4, "Krushshtra4", "https://picsum.photos/id/109/200/300", "213"),
        Director(4, "Directornam4", "https://picsum.photos/id/110/200/300", 2),

        Title(5, "NewMovies5"),
        Movie(5, "Krushshtra5", "https://picsum.photos/id/111/200/300", "213"),
        Director(5, "Directornam5", "https://picsum.photos/id/112/200/300", 2),

        Title(6, "NewMovies6"),
        Movie(6, "Krushshtra6", "https://picsum.photos/id/121/200/300", "213"),
        Director(6, "Directornam6", "https://picsum.photos/id/122/200/300", 2),

        Title(7, "NewMovies7"),
        Movie(7, "Krushshtra7", "https://picsum.photos/id/131/200/300", "213"),
        Director(7, "Directornam7", "https://picsum.photos/id/132/200/300", 2),

        Title(8, "NewMovies8"),
        Movie(8, "Krushshtra8", "https://picsum.photos/id/141/200/300", "213"),
        Director(8, "Directornam8", "https://picsum.photos/id/142/200/300", 2),

        )

}