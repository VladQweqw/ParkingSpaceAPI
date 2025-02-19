package com.example.parking_space_api.ParkingSpace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingSpaceService {
    private ParkingSpaceRepository parkingSpaceRepository;
    @Autowired
    ParkingSpaceService(ParkingSpaceRepository parkingSpaceRepository) {
        this.parkingSpaceRepository = parkingSpaceRepository;
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

    public ParkingSpace createParkingSpace(ParkingSpace parking) {
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
