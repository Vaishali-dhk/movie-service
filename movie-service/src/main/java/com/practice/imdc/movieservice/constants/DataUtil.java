package com.practice.imdc.movieservice.constants;

import com.practice.imdc.movieservice.model.Movie;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataUtil {

  public static List<Movie> movies = new ArrayList<>();

  public static List<Movie> getMovies() {

    movies.add(new Movie(1, "Start is born", LocalDate.now(), "Steven spliberg", Genre.DRAMA, 0));
    movies.add(new Movie(2, "e. t.", LocalDate.now(), "Steven spliberg", Genre.FICTION, 0));
    movies.add(new Movie(3, "Yes Man", LocalDate.now(), "Steven spliberg", Genre.COMEDY, 0));
    movies.add(new Movie(4, "born ultimate", LocalDate.now(), "Steven spliberg", Genre.DRAMA, 0));
    movies.add(new Movie(5, "Start wars", LocalDate.now(), "Steven spliberg", Genre.FICTION, 0));
    return movies;
  }

  public static Movie add(Movie movie) {
    movies.add(movie);
    return movie;
  }
}
