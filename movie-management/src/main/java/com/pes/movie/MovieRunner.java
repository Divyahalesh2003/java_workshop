package com.pes.movie;

import com.pes.movie.Entity.MovieEntity;
import com.pes.movie.repo.MovieRepo;
import com.pes.movie.repo.MovieRepoImpl;

import java.time.LocalDate;

public class MovieRunner {
    public static void main(String[] args) {
        MovieEntity movieEntity=new MovieEntity();
        movieEntity.setMovieHero("Punith");
        movieEntity.setMovieHeroin("Ramya");
        movieEntity.setLanguage("Kannada");
        movieEntity.setReleaseDate(LocalDate.of(2022,04,14));
        movieEntity.setMovieName("Appu");
        MovieRepo repo = new MovieRepoImpl();
                repo.saveMovie(movieEntity);
                repo.readMovies();
            }
        }


