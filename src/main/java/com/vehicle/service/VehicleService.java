package com.vehicle.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.vehicle.model.Vehicle;

@Service
public interface VehicleService {
	
	List<Vehicle> listofVehicles();
	void saveVehicle(Vehicle vehicle);
	void deleteVehicleById(int vehicleId);
	List<Vehicle> findByvehicleId(int vehicleId);
	List<Vehicle> findByvehicleName(String vehicleName);
	Vehicle updateByvehicleId(int id, Vehicle vehicle);
	List<Vehicle> findByVehicleNameOrVehicleId( String vehicleName ,int vehicleId);
	void update(int vehicleId, Vehicle vehicle);
	
	
}
