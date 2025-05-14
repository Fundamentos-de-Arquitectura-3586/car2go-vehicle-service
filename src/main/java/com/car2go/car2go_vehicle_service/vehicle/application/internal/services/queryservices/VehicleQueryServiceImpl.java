package com.car2go.car2go_vehicle_service.vehicle.application.internal.services.queryservices;

import com.car2go.car2go_vehicle_service.vehicle.domain.model.aggregates.Vehicle;
import com.car2go.car2go_vehicle_service.vehicle.domain.model.queries.*;
import com.car2go.car2go_vehicle_service.vehicle.domain.services.VehicleQueryService;
import com.car2go.car2go_vehicle_service.vehicle.infrastructure.persistence.jpa.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleQueryServiceImpl implements VehicleQueryService {

    private final VehicleRepository vehicleRepository;

    public VehicleQueryServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Optional<Vehicle> handle(GetVehicleByIdQuery query) {
        return vehicleRepository.findById(query.id());
    }

    @Override
    public List<Vehicle> handle(GetAllVehicleByLocationQuery query) {
        return vehicleRepository.findAllByLocation(query.location());
    }

    @Override
    public List<Vehicle> handle(GetAllVehicleQuery query) {
        return vehicleRepository.findAll();
    }

    @Override
    public Optional<Vehicle> handle(PutVehicleById query) {
        return vehicleRepository.updateById(query.id());
    }

    @Override
    public List<Vehicle> handle(GetAllVehicleByProfileId query) {
        return vehicleRepository.findAllVehiclesByProfileId(query.profileId());
    }

    @Override
    public List<Vehicle> handle(GetVehicleIdByProfileId query) {
        return vehicleRepository.findByProfileId(query.profileId());
    }
}
