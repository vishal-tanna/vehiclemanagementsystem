//package com.vehicle;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.vehicle.model.Vehicle;
//import com.vehicle.repository.VehicleRepository;
//
//@Component
//public class TestCommandLineRunner implements CommandLineRunner{
//
//	@Autowired
//	VehicleRepository vehicleRepository;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		Vehicle v = new Vehicle();
//		v.setVehicleId(1);
//		v.setVehicleName("7 Series gt");
//		v.setVehicleModel("BMW");
//		v.setVehicleColor("red");
//		v.setVehicleYear(2018);
//		v.setVehiclePrice(300000);
//		
//		Vehicle v1 = new Vehicle();
//		v1.setVehicleId(2);
//		v1.setVehicleName("test1");
//		v1.setVehicleModel("test1");
//		v1.setVehicleColor("test1");
//		v1.setVehicleYear(2018);
//		v1.setVehiclePrice(300000);
//		
//		vehicleRepository.save(v);
//		vehicleRepository.save(v1);
//
//		
//	}
//	
//
//}
