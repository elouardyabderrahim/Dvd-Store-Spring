package com.filRouge.dvdStore.service;

import com.filRouge.dvdStore.entity.Movie;

public interface MovieServiceInterface {

    void registerMovie(Movie movie);
    void registerMovieInFile(Movie movie);
}
