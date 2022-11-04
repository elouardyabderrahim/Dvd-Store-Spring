package com.mycompany.dvdstore.web.api;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import com.mycompany.dvdstore.web.entity.MovieForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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

    @GetMapping("/{id}")
    public String displayMovieCard(@PathVariable("id") Long id, Model model){
        model.addAttribute("movie",movieService.getMovieById(id));
        return "movie-details";
    }
    @PostMapping
    public String addMovie(@Valid @ModelAttribute MovieForm movieForm, BindingResult result){
        if (result.hasErrors()){
            return "add-movie-form";
        }
        Movie movie =new Movie();
        movie.setTitle(movieForm.getTitle());
        movie.setGenre(movieForm.getGenre());
        movie.setDescription(movieForm.getDescription());
        System.out.println("addMovie1");
        movieService.registerMovie(movie);
        System.out.println("addMovie2");
        return "movie-added";
    }


}