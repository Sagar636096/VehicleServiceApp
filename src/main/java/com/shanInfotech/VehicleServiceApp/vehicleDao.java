package com.shanInfotech.VehicleServiceApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class vehicleDao implements Ivehicles{
	private Connection con=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	Scanner sc =new Scanner(System.in);

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


	public void getvehicles() throws Exception {
		List<vehicles> list=new ArrayList<vehicles>();
		Connection con=DBConnect.dbConnect();
		PreparedStatement ps= con.prepareStatement("Select * from vehicles");
		rs=ps.executeQuery();
		while(rs.next());{
		list.add(new vehicles(
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3),
				rs.getString(4)));
	}
		return;
		
		
	}

}
