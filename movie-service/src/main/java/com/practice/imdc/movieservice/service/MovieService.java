package com.practice.imdc.movieservice.service;

import com.practice.imdc.movieservice.model.Movie;
import java.util.List;

public interface MovieService {

  List<Movie> getAllMovies();

  Movie getMovieById(int id);

  Movie save(Movie movie);
}
