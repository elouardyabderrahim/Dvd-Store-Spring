package com.filRouge.dvdStore.DVDStore.repository;

import com.filRouge.dvdStore.DVDStore.entity.Movie;

import java.util.List;


public interface MovieRepositoryInterface {
    void add(Movie movie);
    List<Movie> list();
}