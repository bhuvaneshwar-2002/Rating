package com.spring.user_rating.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "StarRating" , uniqueConstraints = @UniqueConstraint(columnNames = "movieName"))
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String movieName;
   private Double rating;

    public UserModel(String movieName, Double rating) {
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
