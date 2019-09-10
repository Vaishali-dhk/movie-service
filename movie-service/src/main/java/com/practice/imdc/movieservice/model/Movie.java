package com.practice.imdc.movieservice.model;


import com.practice.imdc.movieservice.constants.Genre;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

  private int id;
  private String name;
  private LocalDate releaseDate;
  private String directorName;
  private Genre genre;
  private double rating;



}
