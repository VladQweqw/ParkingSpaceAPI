package com.example.parking_space_api.ParkingSpace;

import com.example.parking_space_api.User.User;
import jakarta.persistence.*;

public class ParkingSpaceUpdate {
    private String location;
    private Double fee_per_hour;
    private Double fee_per_day;
    private Boolean isElectric;
    private String image_url;
    private String description;

    public ParkingSpaceUpdate() {

    }

    public ParkingSpaceUpdate(String location, Double fee_per_hour, Double fee_per_day, Boolean isElectric, String image_url, String description) {
        this.location = location;
        this.fee_per_hour = fee_per_hour;
        this.fee_per_day = fee_per_day;
        this.isElectric = isElectric;
        this.image_url = image_url;
        this.description = description;
    }

    @Override
    public String toString() {
        return "ParkingSpaceUpdate{" +
                "location='" + location + '\'' +
                ", fee_per_hour=" + fee_per_hour +
                ", fee_per_day=" + fee_per_day +
                ", isElectric=" + isElectric +
                ", image_url='" + image_url + '\'' +
                ", description='" + description + '\'' +
                '}';
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

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getImage_url() {
        return image_url;
    }

    public String getDescription() {
        return description;
    }
}
