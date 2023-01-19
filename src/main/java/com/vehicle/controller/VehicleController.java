package com.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.model.Vehicle;
import com.vehicle.service.VehicleService;

@RestController
@RequestMapping(path = "/vehicle")
public class VehicleController {

	@Autowired
	VehicleService service;

	@GetMapping("/listAllVehicles")
	public List<Vehicle> listAllVehicles() {
		return service.listofVehicles();
	}

	@PostMapping("/saveVehicle")
	public void saveVehicle(@RequestBody Vehicle vehicle) {
		service.saveVehicle(vehicle);

	}

	@DeleteMapping("/deleteVehicleById/{vehicleID}")
	public void deleteVehicleById(@PathVariable int vehicleID) {
		service.deleteVehicleById(vehicleID);
	}

	@GetMapping("/findVehicleById/{vehicleId}")
	public List<Vehicle> findVehicleById(@PathVariable("vehicleId") int vehicleId) {
		return service.findByvehicleId(vehicleId);
	}

	@GetMapping("/findVehicleByName/{vehicleName}")
	public List<Vehicle> findVehicleByName(@PathVariable("vehicleName") String vehicleName) {
		return service.findByvehicleName(vehicleName);
	}

	@PutMapping("/updateVehicleById/{vehicleId}")
	public void updateVehicleById(@PathVariable("vehicleId") int vehicleId, @RequestBody Vehicle vehicle) {
		System.out.println(vehicle.getVehicleName());
		service.updateByvehicleId(vehicleId, vehicle);
	}
	
	@GetMapping("/findByvehicleNameOrvehicleId/{vehicleId}/{vehicleName}")
	public List<Vehicle> findByvehicleNameOrvehicleId(@PathVariable("vehicleName") String vehicleName,@PathVariable("vehicleId") int vehicleId) {
		return service.findByVehicleNameOrVehicleId(vehicleName,vehicleId);
	}
	
	
	@PutMapping("/update/{vehicleId}")
	public void update(@PathVariable("vehicleId") int vehicleId, @RequestBody Vehicle vehicle) {
		System.out.println(vehicle.getVehicleName());
		service.update(vehicleId, vehicle);
	}
	

}
