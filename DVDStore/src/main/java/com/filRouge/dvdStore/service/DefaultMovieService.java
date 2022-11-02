package com.filRouge.dvdStore.service;

import com.filRouge.dvdStore.entity.Movie;
import com.filRouge.dvdStore.repository.FileMovieRepository;
import com.filRouge.dvdStore.repository.GoLiveMovieRepositoryInterface;
import com.filRouge.dvdStore.repository.MovieRepositoryInterface;

public class DefaultMovieService implements MovieServiceInterface {


    private MovieRepositoryInterface movieRepository;
//    private MovieRepository movieRepository=new MovieRepository();


    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void registerMovie(Movie movie){
        movieRepository.add(movie);


    }
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



