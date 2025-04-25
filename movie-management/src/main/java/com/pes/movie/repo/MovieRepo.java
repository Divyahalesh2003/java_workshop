package com.pes.movie.repo;

import com.pes.movie.Entity.MovieEntity;

public interface MovieRepo {
    void saveMovie(MovieEntity entity);
    void readMovies();
}
