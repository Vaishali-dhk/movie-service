package com.practice.imdc.movieservice.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@Table(name="movie")
public class Movie {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
  @GenericGenerator(name = "native",strategy = "native")
  private Long mid;

  @Column(name="title")
  private String name;

  @Column(name="year")
  private int releaseYear;

  @Column(name="director")
  private String directorName;

}
