package com.filRouge.dvdStore.service;

import com.filRouge.dvdStore.entity.Movie;
import com.filRouge.dvdStore.repository.GoLiveMovieRepositoryInterface;
import com.filRouge.dvdStore.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultMovieService implements MovieServiceInterface {
//On peut mettre cette annotation sur le stter pour forcer Spring a passer par le setter
    @Autowired(required=true)
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
    @Autowired(required=true)
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



