package com.example.parking_space_api.User;

import com.example.parking_space_api.ParkingSpace.ParkingSpace;
import com.example.parking_space_api.Vehicle.Vehicle;
import jakarta.persistence.*;

import java.util.HashSet;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer age = 18;
    private String email;
    private String password;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private HashSet<ParkingSpace> uploaded_parking_spaces = new HashSet<>();

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private HashSet<Vehicle> vehicles_owned = new HashSet<>();

    public User() {
        
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", uploaded_parking_spaces=" + uploaded_parking_spaces +
                ", vehicles_owned=" + vehicles_owned +
                '}';
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;

    }

    public User(String name, Integer age, String email, String password, HashSet<ParkingSpace> uploaded_parking_spaces, HashSet<Vehicle> vehicles_owned) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
        this.uploaded_parking_spaces = uploaded_parking_spaces;
        this.vehicles_owned = vehicles_owned;
    }

    public Boolean checkPassword(String input_password) {
        return this.password.equals(input_password);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
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
