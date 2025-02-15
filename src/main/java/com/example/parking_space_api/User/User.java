package com.example.parking_space_api.User;

import com.example.parking_space_api.ParkingSpace.ParkingSpace;
import com.example.parking_space_api.Vehicle.Vehicle;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.HashSet;

@Entity
@Table
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer age;
    private HashSet<ParkingSpace> uploaded_parking_spaces = new HashSet<>();
    private HashSet<Vehicle> vehicles_owned = new HashSet<>();

    public User() {
        
    }

    public User(String name, Integer age, HashSet<ParkingSpace> uploaded_parking_spaces, HashSet<Vehicle> vehicles_owned) {
        this.name = name;
        this.age = age;
        this.uploaded_parking_spaces = uploaded_parking_spaces;
        this.vehicles_owned = vehicles_owned;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", uploaded_parking_spaces=" + uploaded_parking_spaces +
                ", vehicles_owned=" + vehicles_owned +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setUploaded_parking_spaces(HashSet<ParkingSpace> uploaded_parking_spaces) {
        this.uploaded_parking_spaces = uploaded_parking_spaces;
    }

    public void setVehicles_owned(HashSet<Vehicle> vehicles_owned) {
        this.vehicles_owned = vehicles_owned;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public HashSet<ParkingSpace> getUploaded_parking_spaces() {
        return uploaded_parking_spaces;
    }

    public HashSet<Vehicle> getVehicles_owned() {
        return vehicles_owned;
    }
}
