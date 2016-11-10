package org.usfirst.frc4930.Zoot.subsystems.sensors;

import edu.wpi.first.wpilibj.Encoder;

public class Encoders {
	

	public Encoder DrivebaseRight;
	public Encoder DrivebaseLeft;
	private int countRight;
	private double rawDistanceRight;
	private double distanceRight;
	private double periodRight;
	private double rateRight;
	private boolean directionRight;
	private boolean stoppedRight;
	
	private int countLeft;
	private double rawDistanceLeft;
	private double distanceLeft;
	private double periodLeft;
	private double rateLeft;
	private boolean directionLeft;
	private boolean stoppedLeft;
	
	public Encoders() {
		DrivebaseRight = new Encoder(0,1, false, Encoder.EncodingType.k4X);
		DrivebaseLeft = new Encoder(2,3, false, Encoder.EncodingType.k4X);
		
	}
	
	public void setValues() {
		countRight = DrivebaseRight.get();
		rawDistanceRight = DrivebaseRight.getRaw();
		distanceRight = DrivebaseRight.getDistance();
		periodRight = DrivebaseRight.getPeriod();
		rateRight = DrivebaseRight.getRate();
		directionRight = DrivebaseRight.getDirection();
		stoppedRight = DrivebaseRight.getStopped();
		
		countLeft = DrivebaseLeft.get();
		rawDistanceLeft = DrivebaseLeft.getRaw();
		distanceLeft = DrivebaseLeft.getDistance();
		periodLeft = DrivebaseLeft.getPeriod();
		rateLeft = DrivebaseLeft.getRate();
		directionLeft = DrivebaseLeft.getDirection();
		stoppedLeft = DrivebaseLeft.getStopped();

		
	} 
	
     public void printValues() {
    	 System.out.println("DrivebaseRight:");
    	 System.out.println("count: "+countRight);
    	 System.out.println("rawDistance: "+rawDistanceRight);
    	 System.out.println("distance: "+distanceRight);
    	 System.out.println("period: "+periodRight);
    	 System.out.println("rate: "+rateRight);
    	 System.out.println("direction: "+directionRight);
    	 System.out.println("stopped: "+stoppedRight);
    	 
    	 System.out.println("DrivebaseRight:");
    	 System.out.println("count: "+countLeft);
    	 System.out.println("");
     }

}
