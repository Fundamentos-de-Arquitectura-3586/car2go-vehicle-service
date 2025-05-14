package com.car2go.car2go_vehicle_service.vehicle.domain.services;

import com.car2go.car2go_vehicle_service.vehicle.domain.model.aggregates.Vehicle;
import com.car2go.car2go_vehicle_service.vehicle.domain.model.queries.*;

import java.util.List;
import java.util.Optional;

public interface VehicleQueryService {
    Optional<Vehicle> handle(GetVehicleByIdQuery query);
    List<Vehicle> handle(GetAllVehicleByLocationQuery query);
    List<Vehicle> handle(GetAllVehicleQuery query);
    Optional<Vehicle> handle(PutVehicleById query);
    List<Vehicle> handle(GetAllVehicleByProfileId query);
    List<Vehicle> handle(GetVehicleIdByProfileId query);
}
