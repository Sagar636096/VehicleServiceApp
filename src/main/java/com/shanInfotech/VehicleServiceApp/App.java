package com.shanInfotech.VehicleServiceApp;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    	Scanner sc=new Scanner(System.in);
    	
    	vehicleDao vd=new vehicleDao();
    	System.out.println("Enter the values for vehicle");
    	
    	vehicles v=new vehicles(sc.nextInt(), sc.next(), sc.next(), sc.next());
        vd.addvehicles(v);
        
        servicerecordDao s=new servicerecordDao();
        System.out.println("Enter The Value For Service");
        
        
        servicerecord r=new servicerecord(sc.nextInt(),v, sc.next(), sc.next(), sc.nextDouble());
        
        s.addservicerecord(r);
    }
}
