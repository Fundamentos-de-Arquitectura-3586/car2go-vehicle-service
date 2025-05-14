package com.car2go.car2go_vehicle_service.vehicle.interfaces.rest.transform;

import com.car2go.car2go_vehicle_service.vehicle.domain.model.aggregates.Vehicle;
import com.car2go.car2go_vehicle_service.vehicle.interfaces.rest.resources.VehicleResource;

public class VehicleResourceFromEntityAssembler {

    public static VehicleResource toResourceFromEntity(Vehicle entity) {
        return new VehicleResource(
                entity.getId(),
                entity.getName(),
                entity.getPhone(),
                entity.getEmail(),
                entity.getBrand(),
                entity.getModel(),
                entity.getColor(),
                entity.getYear(),
                entity.getPrice(),
                entity.getTransmission(),
                entity.getEngine(),
                entity.getMileage(),
                entity.getDoors(),
                entity.getPlate(),
                entity.getLocation(),
                entity.getDescription(),
                entity.getImages(),
                entity.getProfileId(),
                entity.getFuel(),
                entity.getSpeed(),
                entity.getStatus().name()
        );
    }
}
