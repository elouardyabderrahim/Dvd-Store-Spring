package com.filRouge.dvdStore.repository.memory;

import com.filRouge.dvdStore.entity.Movie;
import com.filRouge.dvdStore.repository.MovieRepositoryInterface;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
//@Repository
public class MemoryMovieRepository implements MovieRepositoryInterface {

    private List<Movie> movies=new ArrayList<>();

    public void add(Movie movie){
        movies.add(movie);
        System.out.println("The movie "+movie.getTitle()+" has been added.");
    }

    @Override
    public List<Movie> list() {
        return movies;
    }

}