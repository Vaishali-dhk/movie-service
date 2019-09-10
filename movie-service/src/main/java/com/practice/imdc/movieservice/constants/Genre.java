package com.practice.imdc.movieservice.constants;

public enum Genre {
  DRAMA("Drama"),
  FICTION("Fiction"),
  SCI_FI("Sci-fi"),
  COMEDY("Comedy"),
  ROMANCE("Romance"),
  ACTION("Action");

  private String value;


  Genre(String value) {
    this.value = value;
  }
}
