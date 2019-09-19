package com.practice.imdc.movieservice.controller;


import static com.practice.imdc.movieservice.controller.MovieController.BASE_URL;

import com.practice.imdc.movieservice.model.Movie;
import com.practice.imdc.movieservice.service.MovieService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(BASE_URL)
public class MovieController {

  static final String BASE_URL = "/api/service/v1/movie";

  private final MovieService movieService;

  @Autowired
  public MovieController(MovieService movieService) {
    this.movieService = movieService;
  }


  @RequestMapping("/getAll")
  public List<Movie> getAllMovies() {
    return movieService.getAllMovies();
  }

  @PostMapping("/movie")
  public Movie add(@RequestBody Movie movie){
    return movieService.save(movie);
  }

  @RequestMapping("/movie/{id}")
  public Movie getById(@PathVariable("id") Long mid) {
     return movieService.getMovieById(mid);
  }

  @PutMapping("/movie/{id}")
  public Movie updateMovie(@RequestBody Movie movie, @PathVariable("id") Long mid){
    return movieService.updateMovie(movie, mid);
  }

  @DeleteMapping("/movie/{id}")
  public void deleteMovie(@PathVariable("id") Long mid){
    movieService.deleteMovie(mid);
  }

}
