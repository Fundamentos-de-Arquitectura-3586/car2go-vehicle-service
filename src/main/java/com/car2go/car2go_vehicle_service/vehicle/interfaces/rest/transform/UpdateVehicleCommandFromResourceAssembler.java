package com.car2go.car2go_vehicle_service.vehicle.interfaces.rest.transform;

import com.car2go.car2go_vehicle_service.vehicle.domain.model.commands.UpdateVehicleCommand;
import com.car2go.car2go_vehicle_service.vehicle.domain.model.valueobjects.vehicleStatus;
import com.car2go.car2go_vehicle_service.vehicle.interfaces.rest.resources.UpdateVehicleResource;

public class UpdateVehicleCommandFromResourceAssembler {

    public static UpdateVehicleCommand toCommandFromResource(UpdateVehicleResource resource) {
        return new UpdateVehicleCommand(
                resource.name(),
                resource.phone(),
                resource.email(),
                resource.brand(),
                resource.model(),
                resource.color(),
                resource.year(),
                resource.price(),
                resource.transmission(),
                resource.engine(),
                resource.mileage(),
                resource.doors(),
                resource.plate(),
                resource.location(),
                resource.description(),
                resource.images(),
                resource.fuel(),
                resource.speed(),
                vehicleStatus.valueOf(resource.status().toUpperCase())
        );
    }
}
