package com.practice.imdc.movieservice.controller;


import static com.practice.imdc.movieservice.controller.MovieController.BASE_URL;

import com.practice.imdc.movieservice.model.Movie;
import com.practice.imdc.movieservice.service.MovieService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

 /* @RequestMapping("/get/{id}")
  public Movie getById(@RequestParam("id") int id) {
    Objects.nonNull(id);
    return movieService.getMovieById(id);
  }*/

}
