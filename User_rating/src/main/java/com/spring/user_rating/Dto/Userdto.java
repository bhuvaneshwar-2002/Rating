package com.spring.user_rating.Dto;

public class Userdto {

    private String movieName;
    private Double rating;

    public Userdto(String movieName, Double rating) {
        this.movieName = movieName;
        this.rating = rating;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
