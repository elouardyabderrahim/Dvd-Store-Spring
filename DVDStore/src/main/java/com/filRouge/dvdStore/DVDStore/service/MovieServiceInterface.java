package com.filRouge.dvdStore.DVDStore.service;

import com.filRouge.dvdStore.DVDStore.entity.Movie;

import java.util.List;


public interface MovieServiceInterface {
    void registerMovie(Movie movie);
    List<Movie> getMovieList();
}