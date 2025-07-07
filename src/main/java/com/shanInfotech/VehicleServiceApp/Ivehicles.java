package com.shanInfotech.VehicleServiceApp;

import java.util.List;

public interface Ivehicles {
	
	public List<vehicles> getvehicles() throws Exception;
	void addvehicles(vehicles v) throws Exception;
}
