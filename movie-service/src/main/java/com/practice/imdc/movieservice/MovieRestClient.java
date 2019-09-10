package com.practice.imdc.movieservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MovieRestClient {

  @Autowired
  RestTemplate restTemplate;

  public Double getMovieRating(int id) {
    return restTemplate.getForObject("http://localhost:8083/rating/"+id, Double.class);
  }
}
