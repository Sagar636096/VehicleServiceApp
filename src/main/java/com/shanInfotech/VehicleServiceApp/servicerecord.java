package com.shanInfotech.VehicleServiceApp;

public class servicerecord {
	private int recordId;
	private vehicles vehicleId;
	private String serviceDate;
	private String description;
	private double cost;
							
	public servicerecord() {
		
	}

	public servicerecord(int recordId, vehicles vehicleId, String serviceDate, String description, double cost) {
		this.recordId = recordId;
		this.vehicleId = vehicleId;
		this.serviceDate = serviceDate;
		this.description = description;
		this.cost = cost;
	}

	public int getRecordId() {
		return recordId;
	}

	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}

	public vehicles getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(vehicles vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getServiceDate() {
		return serviceDate;
	}

	public void setServiceDate(String serviceDate) {
		this.serviceDate = serviceDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "servicerecord [recordId=" + recordId + ", vehicleId=" + vehicleId + ", serviceDate=" + serviceDate
				+ ", description=" + description + ", cost=" + cost + "]";
	}
	
	
}
