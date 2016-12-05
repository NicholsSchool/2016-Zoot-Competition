package org.usfirst.frc4930.Zoot.subsystems.sensors;

import edu.wpi.first.wpilibj.command.Subsystem;

import java.util.ArrayList;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.interfaces.*;
import edu.wpi.first.wpilibj.Timer;

public class BuiltInAccel extends Subsystem {

private static Accelerometer accel = new BuiltInAccelerometer();

private Timer timer = new Timer();

protected void initDefaultCommand() {

	}

public BuiltInAccel() {

	}

public double xValue() {
	return accel.getX();
    }

public double yValue() {
	return accel.getY();
    }

	public double zValue() {
		return accel.getZ();
    }
	
	public void history() {
		
	ArrayList<Double> xHistory = new ArrayList<Double>();
	ArrayList<Double> yHistory = new ArrayList<Double>();
	ArrayList<Double> zHistory = new ArrayList<Double>();
             
    }
}
