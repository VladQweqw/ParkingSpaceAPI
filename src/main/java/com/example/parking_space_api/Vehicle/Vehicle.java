package com.example.parking_space_api.Vehicle;

import com.example.parking_space_api.ParkingSpace.ParkingSpace;
import com.example.parking_space_api.User.User;
import jakarta.persistence.*;

import java.util.HashSet;

@Entity
@Table
public class Vehicle {

    @Id
    @GeneratedValue
    private Long id;
    private String model;
    private String type;
    private String vehicle_type;
    private String fuel_type;
    private String nickname;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User owner;

    public Vehicle() {
        
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", vehicle_type='" + vehicle_type + '\'' +
                ", fuel_type='" + fuel_type + '\'' +
                ", nickname='" + nickname + '\'' +
                ", owner=" + owner +
                '}';
    }

    public Vehicle(User owner, String nickname, String fuel_type, String vehicle_type, String type, String model) {
        this.owner = owner;
        this.nickname = nickname;
        this.fuel_type = fuel_type;
        this.vehicle_type = vehicle_type;
        this.type = type;
        this.model = model;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setVehicle_type(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public User getOwner() {
        return owner;
    }
}
