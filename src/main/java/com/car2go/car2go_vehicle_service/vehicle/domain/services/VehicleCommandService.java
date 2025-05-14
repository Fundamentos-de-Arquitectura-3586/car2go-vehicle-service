package com.car2go.car2go_vehicle_service.vehicle.domain.services;

import com.car2go.car2go_vehicle_service.vehicle.domain.model.aggregates.Vehicle;
import com.car2go.car2go_vehicle_service.vehicle.domain.model.commands.CreateVehicleCommand;
import com.car2go.car2go_vehicle_service.vehicle.domain.model.commands.UpdateVehicleCommand;

import java.util.Optional;

public interface VehicleCommandService {

    Optional<Vehicle> handle(CreateVehicleCommand command);

    Optional<Vehicle> handle(UpdateVehicleCommand command, int vehicleId);

    void deleteVehicle(int vehicleId, long userId);

    Optional<Vehicle> findById(int vehicleId);
}
