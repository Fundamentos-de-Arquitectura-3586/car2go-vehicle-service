package com.car2go.car2go_vehicle_service.vehicle.domain.model.queries;

public record GetVehicleIdByProfileId(long profileId) {

    public long profileId() {
        return profileId;
    }
}
