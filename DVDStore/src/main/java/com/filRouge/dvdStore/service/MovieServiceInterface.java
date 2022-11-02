package com.filRouge.dvdStore.service;

import com.filRouge.dvdStore.entity.Movie;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


public interface MovieServiceInterface {

    void registerMovie(Movie movie);
    void registerMovieInFile(Movie movie);
}
