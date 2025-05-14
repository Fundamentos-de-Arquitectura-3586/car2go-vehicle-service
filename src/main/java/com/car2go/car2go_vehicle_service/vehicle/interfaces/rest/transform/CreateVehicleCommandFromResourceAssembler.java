package com.car2go.car2go_vehicle_service.vehicle.interfaces.rest.transform;

import com.car2go.car2go_vehicle_service.vehicle.domain.model.commands.CreateVehicleCommand;
import com.car2go.car2go_vehicle_service.vehicle.interfaces.rest.resources.CreateVehicleResource;

public class CreateVehicleCommandFromResourceAssembler {

    public static CreateVehicleCommand toCommandFromResource(CreateVehicleResource resource) {
        return new CreateVehicleCommand(
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
                resource.speed()
        );
    }
}
