package com.example.kinozippy.model;

import jakarta.persistence.Id;

import java.util.Date;

public class Movie {

  @Id
  private int movieId;
  private String title;
  private Date releaseDate;
  private double rating;
  private double length;
  private String genre;
  private double showTime;
  private String movieTheater;
  private int ageLimit;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Date getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
  }

  public double getRating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public double getShowTime() {
    return showTime;
  }

  public void setShowTime(double showTime) {
    this.showTime = showTime;
  }

  public String getMovieTheater() {
    return movieTheater;
  }

  public void setMovieTheater(String movieTheater) {
    this.movieTheater = movieTheater;
  }

  public int getAgeLimit() {
    return ageLimit;
  }

  public void setAgeLimit(int ageLimit) {
    this.ageLimit = ageLimit;
  }
}
