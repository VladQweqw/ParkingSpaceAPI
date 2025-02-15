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
        return List.of(
                new ParkingSpace()
        );
    }
}
