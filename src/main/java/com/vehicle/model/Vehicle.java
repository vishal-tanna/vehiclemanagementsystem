package com.vehicle.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Vehicle_Table")
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vehicleId;
	private String vehicleName;
	private String vehicleColor;
	private String vehicleModel;
	private float vehiclePrice;
	private int vehicleYear;
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getVehicleColor() {
		return vehicleColor;
	}
	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public float getVehiclePrice() {
		return vehiclePrice;
	}
	public void setVehiclePrice(float vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}
	public int getVehicleYear() {
		return vehicleYear;
	}
	public void setVehicleYear(int vehicleYear) {
		this.vehicleYear = vehicleYear;
	}
	public Vehicle(int vehicleId, String vehicleName, String vehicleColor, String vehicleModel, float vehiclePrice,
			int vehicleYear) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.vehicleColor = vehicleColor;
		this.vehicleModel = vehicleModel;
		this.vehiclePrice = vehiclePrice;
		this.vehicleYear = vehicleYear;
	}
	public Vehicle() {
		super();
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", vehicleColor=" + vehicleColor
				+ ", vehicleModel=" + vehicleModel + ", vehiclePrice=" + vehiclePrice + ", vehicleYear=" + vehicleYear
				+ "]";
	}

}
