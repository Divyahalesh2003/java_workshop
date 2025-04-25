package com.pes.movie.Entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter

public class MovieEntity {
    private String movieHero;
    private String movieHeroin;
    private String language;
    private LocalDate releaseDate;
    private String movieName;
}
