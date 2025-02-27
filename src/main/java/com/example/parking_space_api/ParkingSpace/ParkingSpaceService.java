package com.example.parking_space_api.ParkingSpace;

import com.example.parking_space_api.User.User;
import com.example.parking_space_api.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingSpaceService {
    private ParkingSpaceRepository parkingSpaceRepository;
    private UserRepository userRepository;
    @Autowired
    ParkingSpaceService(ParkingSpaceRepository parkingSpaceRepository, UserRepository userRepository) {
        this.parkingSpaceRepository = parkingSpaceRepository;
        this.userRepository = userRepository;
    }

    public List<ParkingSpace> getParkings() {
        return parkingSpaceRepository.findAll();
    }

    public ParkingSpace getParkingById(Long id) {
        ParkingSpace found = parkingSpaceRepository.findById(id).orElseThrow(() -> {
            throw new IllegalStateException("Invalid parking space ID");
        });

        return found;
    }

    public ParkingSpace createParkingSpace(ParkingSpace parking, Long id) {
        System.out.println(id);
        User user = userRepository.findById(id).orElseThrow(() -> {
            throw new IllegalStateException("Invalid author ID");
        });

        parking.setAuthor(user);
        return parkingSpaceRepository.save(parking);
    }

    public ParkingSpace updateParkingSpace(Long id, ParkingSpaceUpdate update) {
        ParkingSpace found = parkingSpaceRepository.findById(id).orElseThrow(() -> {
            throw new IllegalStateException("Invalid parking space ID");
        });

        if(!update.getDescription().isEmpty()) {
            found.setDescription(update.getDescription());
        }

        if(!update.getLocation().isEmpty()) {
            found.setLocation(update.getLocation());
        }

        if(update.getFee_per_day() > 0) {
            found.setFee_per_day(update.getFee_per_day());
        }

        if(update.getFee_per_day() > 0) {
            found.setFee_per_day(update.getFee_per_day());
        }

        if(update.getElectric()) {
            found.setElectric(update.getElectric());
        }

        if(!update.getImage_url().isEmpty()) {
            found.setImage_url(update.getImage_url());
        }

        return parkingSpaceRepository.save(found);
    }
}
