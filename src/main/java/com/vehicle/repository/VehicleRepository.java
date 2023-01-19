package com.vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicle.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

	List<Vehicle> findByvehicleId(int vehicleId);
	List<Vehicle> findByvehicleName(String vehicleName);

	List<Vehicle> findByVehicleNameOrVehicleId(String vehicleName , int vehicleId);	
	
}
