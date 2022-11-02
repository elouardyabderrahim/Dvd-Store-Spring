package com.filRouge.dvdStore.repository;

import com.filRouge.dvdStore.entity.Movie;
import java.util.ArrayList;
import java.util.List;

public class MemoryMovieRepository implements MovieRepositoryInterface {
    public void add (Movie movie){

        List<Movie> movies = new ArrayList<Movie>();
        movies.add(movie);
        System.out.println("the movie "+ movie.getTitle()+" has been added.");

    }
}
