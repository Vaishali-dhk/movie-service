package com.practice.imdc.movieservice.service;

import com.practice.imdc.movieservice.MovieRestClient;
import com.practice.imdc.movieservice.constants.DataUtil;
import com.practice.imdc.movieservice.constants.Genre;
import com.practice.imdc.movieservice.model.Movie;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

  @Autowired
  private MovieRestClient movieRestClient;


  @Override
  public List<Movie> getAllMovies() {
    List<Movie> movies = DataUtil.getMovies();
    movies.stream()
        .map(movie -> updateRating(movie))
        .collect(Collectors.toList());
    return movies;
  }

  private Movie updateRating(Movie movie) {
    Double average = movieRestClient.getMovieRating(movie.getId());
    movie.setRating(average);
    return movie;
  }

  @Override
  public Movie getMovieById(int id) {
    return null;
  }

  @Override
  public Movie save(Movie movie) {
    return DataUtil.add(movie);
  }
}
