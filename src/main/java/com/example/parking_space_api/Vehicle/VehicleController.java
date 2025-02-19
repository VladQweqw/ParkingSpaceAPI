package com.example.parking_space_api.Vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/vehicle")
public class VehicleController {

    private final VehicleService vehicleService;

    @Autowired
    VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping(path = "{vehicle-id}")
    public Vehicle getVehicleById(
            @PathVariable("vehicle-id") Long id
    ) {
        return vehicleService.getVehicleById(id);
    }

    @PostMapping
    public Vehicle createVehicle(
            @RequestBody Vehicle vehicle
    ) {
        return vehicleService.createVehicle(vehicle);
    }

    @DeleteMapping(path = "{vehicle-id}")
    public void deleteVehicle(
            @PathVariable("vehicle-id") Long id
    ) {
        vehicleService.deleteVehicle(id);
    }


    @PutMapping(path = "{vehicle-id}")
    public Vehicle updateVehicle(
            @PathVariable("vehicle-id") Long id,
            @RequestParam("nickname") String new_nick
    ) {
        return vehicleService.updateVehicle(id, new_nick);
    }
}
