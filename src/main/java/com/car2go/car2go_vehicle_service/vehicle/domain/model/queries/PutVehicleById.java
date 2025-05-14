package com.car2go.car2go_vehicle_service.vehicle.domain.model.queries;

public record PutVehicleById(Integer id) {
    public PutVehicleById {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("ID must be greater than zero");
        }
    }
}
