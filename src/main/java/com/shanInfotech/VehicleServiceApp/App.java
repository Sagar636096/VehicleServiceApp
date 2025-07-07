package com.shanInfotech.VehicleServiceApp;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    	Scanner sc=new Scanner(System.in);
    	
    	vehicleDao vd=new vehicleDao();
    	System.out.println("Enter the values for vehicle");
    	
    	vd.getvehicles();
    }
}
