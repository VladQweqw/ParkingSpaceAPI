package com.example.parking_space_api.ParkingSpace;

import com.example.parking_space_api.User.User;
import jakarta.persistence.*;

@Entity
@Table
public class ParkingSpace {

    @Id
    @GeneratedValue
    private Long id;
    private String location;
    private Double fee_per_hour;
    private Double fee_per_day;
    private Boolean isElectric;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User author;
    private String image_url;

    private String description;

    public ParkingSpace() {

    }

    public ParkingSpace(String location, Double fee_per_hour, Double fee_per_day, Boolean isElectric, User author, String image_url, String description) {
        this.location = location;
        this.fee_per_hour = fee_per_hour;
        this.fee_per_day = fee_per_day;
        this.isElectric = isElectric;
        this.author = author;
        this.image_url = image_url;
        this.description = description;
    }

    @Override
    public String toString() {
        return "ParkingSpace{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", fee_per_hour=" + fee_per_hour +
                ", fee_per_day=" + fee_per_day +
                ", isElectric=" + isElectric +
                ", author=" + author +
                ", image_url='" + image_url + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setFee_per_hour(Double fee_per_hour) {
        this.fee_per_hour = fee_per_hour;
    }

    public void setFee_per_day(Double fee_per_day) {
        this.fee_per_day = fee_per_day;
    }

    public void setElectric(Boolean electric) {
        isElectric = electric;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public Double getFee_per_hour() {
        return fee_per_hour;
    }

    public Double getFee_per_day() {
        return fee_per_day;
    }

    public Boolean getElectric() {
        return isElectric;
    }

    public String getDescription() {
        return description;
    }
}
