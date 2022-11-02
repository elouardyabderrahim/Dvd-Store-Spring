package com.filRouge.dvdStore.service;

import com.filRouge.dvdStore.entity.Movie;
import com.filRouge.dvdStore.repository.GoLiveMovieRepositoryInterface;
import com.filRouge.dvdStore.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultMovieService implements MovieServiceInterface {

    @Autowired
    private MovieRepositoryInterface movieRepository;



    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void registerMovie(Movie movie){
        movieRepository.add(movie);


    }
    @Autowired
    private GoLiveMovieRepositoryInterface goLiveMovieRepository;

    public GoLiveMovieRepositoryInterface getGoLiveMovieRepository() {
        return goLiveMovieRepository;
    }

    public void setGoLiveMovieRepository(GoLiveMovieRepositoryInterface goLiveMovieRepository) {
        this.goLiveMovieRepository = goLiveMovieRepository;
    }

    public void registerMovieInFile(Movie movie) {
        goLiveMovieRepository.save(movie);
    }


}



