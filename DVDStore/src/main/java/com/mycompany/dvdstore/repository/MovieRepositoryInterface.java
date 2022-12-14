package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepositoryInterface extends CrudRepository<Movie,Long> {
    /*Movie add(Movie movie);
    List<Movie> list();

    Movie getById(long id);*/
    @EntityGraph(value = "movie.actor-and-reviews", type = EntityGraph.EntityGraphType.FETCH)
     Movie getMovieById(long id);



}
