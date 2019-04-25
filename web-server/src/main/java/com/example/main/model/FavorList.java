package com.example.main.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "favor_list", schema = "SE2", catalog = "")
public class FavorList {
    private String favorId;
    private String movieId;
    private String userId;

    @Id
    @Column(name = "favor_id")
    public String getFavorId() {
        return favorId;
    }

    public void setFavorId(String favorId) {
        this.favorId = favorId;
    }

    @Basic
    @Column(name = "movie_id")
    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    @Basic
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FavorList favorList = (FavorList) o;
        return Objects.equals(favorId, favorList.favorId) &&
                Objects.equals(movieId, favorList.movieId) &&
                Objects.equals(userId, favorList.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(favorId, movieId, userId);
    }
}
