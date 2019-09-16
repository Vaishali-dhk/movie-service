package com.practice.imdc.movieservice.constants;

import com.practice.imdc.movieservice.model.Movie;
import java.util.ArrayList;
import java.util.List;

public class DataUtil {

  public static List<Movie> movies = new ArrayList<>();

  public static List<Movie> getMovies() {
     return movies;
  }

  public static Movie add(Movie movie) {
    movies.add(movie);
    return movie;
  }
}
