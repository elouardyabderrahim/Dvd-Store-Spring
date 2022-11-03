package com.filRouge.dvdStore.repository;

import com.filRouge.dvdStore.entity.Movie;

import java.util.List;


public interface MovieRepositoryInterface {
    void add(Movie movie);
    List<Movie> list();
}