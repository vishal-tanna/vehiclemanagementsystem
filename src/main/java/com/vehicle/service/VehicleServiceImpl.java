package com.vehicle.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.model.Vehicle;
import com.vehicle.repository.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	VehicleRepository vehicleRepository;

	@Override
	public List<Vehicle> listofVehicles() {

		return vehicleRepository.findAll();
	}

	@Override
	public void saveVehicle(Vehicle vehicle) {
		vehicleRepository.save(vehicle);
	}

	@Override
	public void deleteVehicleById(int vehicleId) {
		vehicleRepository.deleteById(vehicleId);

	}

	@Override
	public List<Vehicle> findByvehicleId(int vehicleId) {
		return vehicleRepository.findByvehicleId(vehicleId);
	}

	@Override
	public List<Vehicle> findByvehicleName(String vehicleName) {
		return vehicleRepository.findByvehicleName(vehicleName);
	}

	@Override
	public Vehicle updateByvehicleId(int id, Vehicle vehicle) {
		Optional<Vehicle> foundVehicle = vehicleRepository.findById(id);
		Vehicle updatedVehicle = foundVehicle.get();
		updatedVehicle.setVehicleName(vehicle.getVehicleName());
		updatedVehicle.setVehicleColor(vehicle.getVehicleColor());
		updatedVehicle.setVehicleModel(vehicle.getVehicleModel());
		updatedVehicle.setVehicleYear(vehicle.getVehicleYear());
		updatedVehicle.setVehiclePrice(vehicle.getVehiclePrice());
		return vehicleRepository.save(updatedVehicle);

	}

	@Override
	public List<Vehicle> findByVehicleNameOrVehicleId(String vehicleName, int vehicleId) {
		return vehicleRepository.findByVehicleNameOrVehicleId(vehicleName, vehicleId);
	}

	@Override
	public void update(int vehicleId, Vehicle vehicle) {
		Vehicle v = new Vehicle();
		int id = 0;
		String name;
		String color;
		String model;
		int year;
		float price;
		if (vehicle.getVehicleId() == vehicleId)
		{
		
		v.setVehicleId(id);
		v.setVehicleName((String)vehicle.getVehicleName());
		v.setVehicleColor((String)vehicle.getVehicleColor());
		v.setVehiclePrice((int)vehicle.getVehiclePrice());
		}
		else {
			System.out.println("ERROR");
		}

	}
}
