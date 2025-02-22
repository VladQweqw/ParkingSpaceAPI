package com.example.parking_space_api.ParkingSpace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(path = "{id}")
    public ParkingSpace getParkingSpaceById(
            @PathVariable("id") Long id
    ) {
        return parkingSpaceService.getParkingById(id);
    }

    @PostMapping
    public ParkingSpace createParkingSpace(
            @RequestBody ParkingSpace parking
    ) {
        return parkingSpaceService.createParkingSpace(parking);
    }

    @PutMapping(path = "{id}")
    public ParkingSpace updateParkingSpace(
            @PathVariable("id") Long id,
            @RequestBody ParkingSpaceUpdate update
    ) {
        return parkingSpaceService.updateParkingSpace(id, update);
    }


}
