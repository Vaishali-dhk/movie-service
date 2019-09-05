package com.practice.imdc.movieservice.controller;


import com.practice.imdc.movieservice.model.Movie;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {


  @RequestMapping("/getAllMovies")
  public Movie getAllMovies(){
    return new Movie(1, "Spider-Man");
  }

}
