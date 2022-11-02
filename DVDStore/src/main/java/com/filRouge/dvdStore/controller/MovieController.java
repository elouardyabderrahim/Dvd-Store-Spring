package com.filRouge.dvdStore.controller;

import com.filRouge.dvdStore.entity.Movie;

import com.filRouge.dvdStore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class MovieController {
//    private MovieService movieService=new MovieService();
    @Autowired(required=true)
    private MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    Movie movie=new Movie();

    public void addUsingConsole(){


        Scanner scn=new Scanner(System.in);
        System.out.println( "Le titre de film" );
        movie.setTitle(scn.nextLine());

        System.out.println( "Le genre du Film" );
        movie.setGenre(scn.nextLine());

        movieService.registerMovie(movie);



    }
    public void addUsingFile(){

        Movie movie=new Movie();
        Scanner scn=new Scanner(System.in);
        System.out.println("le titre du film");
        movie.setTitle(scn.nextLine());

        System.out.println( "Le genre du Film" );
        movie.setGenre(scn.nextLine());

        movieService.registerMovieInFile(movie);


    }


}
