package com.example.main.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "movie_hall", schema = "SE2", catalog = "")
public class MovieHall {
    private String hallId;
    private String hallName;
    private String size;
    private String category;

    @Id
    @Column(name = "hall_id")
    public String getHallId() {
        return hallId;
    }

    public void setHallId(String hallId) {
        this.hallId = hallId;
    }

    @Basic
    @Column(name = "hall_name")
    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    @Basic
    @Column(name = "size")
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Basic
    @Column(name = "category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieHall movieHall = (MovieHall) o;
        return Objects.equals(hallId, movieHall.hallId) &&
                Objects.equals(hallName, movieHall.hallName) &&
                Objects.equals(size, movieHall.size) &&
                Objects.equals(category, movieHall.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hallId, hallName, size, category);
    }
}
