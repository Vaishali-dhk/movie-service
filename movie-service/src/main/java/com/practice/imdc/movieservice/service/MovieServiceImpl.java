package com.practice.imdc.movieservice.service;

import com.practice.imdc.movieservice.MovieRestClient;
import com.practice.imdc.movieservice.constants.DataUtil;
import com.practice.imdc.movieservice.model.Movie;
import com.practice.imdc.movieservice.repo.MovieRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

  private final MovieRestClient movieRestClient;

  private final MovieRepository movieRepository;

  public MovieServiceImpl(MovieRestClient movieRestClient,
      MovieRepository movieRepository) {
    this.movieRestClient = movieRestClient;
    this.movieRepository = movieRepository;
  }


  @Override
  public List<Movie> getAllMovies() {
    return movieRepository.findAll();
  }

  private Movie updateRating(Movie movie) {
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
