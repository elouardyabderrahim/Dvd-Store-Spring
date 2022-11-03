package com.filRouge.dvdStore.service;

import com.filRouge.dvdStore.entity.Movie;

import java.util.List;


public interface MovieServiceInterface {
    void registerMovie(Movie movie);
    List<Movie> getMovieList();
}