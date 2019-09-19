package com.practice.imdc.movieservice.service;

import com.practice.imdc.movieservice.model.Movie;
import java.util.List;

public interface MovieService {

  List<Movie> getAllMovies();

  Movie getMovieById(Long id);

  Movie save(Movie movie);

  Movie updateMovie(Movie movie, Long mid);

  void deleteMovie(Long mid);
}
