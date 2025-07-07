package com.shanInfotech.VehicleServiceApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



public class vehicleDao implements Ivehicles{
	private Connection con=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	Scanner sc =new Scanner(System.in);

	
	@Override
	public void addvehicles(vehicles v) throws Exception {
		con=DBConnect.dbConnect();
		con.setAutoCommit(false);
		String insertvehicle="insert into vehicles values(?,?,?,?)";
		ps=con.prepareStatement(insertvehicle);
		
		ps.setInt(1, v.getVehicleId());
		sc.nextLine();
		ps.setString(2, v.getOwnerName());
		ps.setString(3, v.getModel());
		ps.setString(4, v.getRegistrationNumber());
		ps.executeUpdate();
		con.commit();
		System.out.println("Data inserted successfully");
		
	}

	@Override
	public void getvehicles() {
		// TODO Auto-generated method stub
		
	}

}
