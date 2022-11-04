package com.mycompany.dvdstore.web.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import com.mycompany.dvdstore.web.entity.MovieForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Scanner;

@Controller
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

//    @GetMapping("/{id}")
//    public String displayMovieCard(@PathVariable("id") Long id, Model model){
//        model.addAttribute("movie",movieService.getMovieById(id));
//        return "movie-details";
//    }
    @PostMapping("/add")
    public String addMovie(@Valid @ModelAttribute Movie movie, BindingResult result){
        if (result.hasErrors()){
            return "add-movie-form";
        }
        movie.setTitle(movie.getTitle());
        movie.setGenre(movie.getGenre());
        movie.setDescription(movie.getDescription());
        System.out.println("addMovie1");
        movieService.registerMovie(movie);

        return "movie-added";
    }


}