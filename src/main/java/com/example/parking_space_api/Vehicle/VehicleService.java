package com.example.parking_space_api.Vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepository;
    @Autowired
    VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public Vehicle getVehicleById(Long id) {
        return vehicleRepository.findById(id).orElseThrow(() -> {
            throw new IllegalStateException("Invalid vehicle ID");
        });
    }

    public Vehicle createVehicle(Vehicle veh) {
       return vehicleRepository.save(veh);
    }

    public void deleteVehicle(Long id) {
        Optional<Vehicle> found = vehicleRepository.findById(id);
        if(found.isPresent()) {
            vehicleRepository.deleteById(id);
        }else {
            throw new IllegalStateException("Invalid vehicle ID");
        }
    }

    public Vehicle updateVehicle(Long id, String newNick) {
        Vehicle found = vehicleRepository.findById(id).orElseThrow(() -> {
            throw new IllegalStateException("Invalid vehicle ID");
        });
        found.setNickname(newNick);

        return vehicleRepository.save(found);
    }
}
