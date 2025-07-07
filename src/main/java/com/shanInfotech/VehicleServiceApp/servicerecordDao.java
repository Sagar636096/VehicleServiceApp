package com.shanInfotech.VehicleServiceApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.Scanner;

public class servicerecordDao implements Iservicerecord {
	private Connection con=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	
	

	
	@Override
	public void addservicerecord(servicerecord r) throws  Exception  {
		con=DBConnect.dbConnect();
		con.setAutoCommit(false);
		
		String insertservice="insert into service_records values(?,?,?,?,?)";
		ps=con.prepareStatement(insertservice);
		ps.setInt(1, r.getRecordId());
		ps.setInt(2, r.getVehicleId().getVehicleId());
		ps.setString(3, r.getServiceDate());
		ps.setString(4, r.getDescription());
		ps.setDouble(5, r.getCost());
		ps.executeUpdate();
		con.commit();
		System.out.println("Service Record Data Inserted");
		
	}

	@Override
	public void getservicerecord() {
		// TODO Auto-generated method stub
		
	}

}
