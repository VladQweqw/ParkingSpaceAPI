package com.example.parking_space_api.ParkingSpace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/parking")
public class ParkingSpaceController {
    private final ParkingSpaceService parkingSpaceService;
    @Autowired
    ParkingSpaceController(ParkingSpaceService parkingSpaceService) {
        this.parkingSpaceService = parkingSpaceService;
    }

    @GetMapping
    public List<ParkingSpace> getParkings() {
        return parkingSpaceService.getParkings();
    }

}
