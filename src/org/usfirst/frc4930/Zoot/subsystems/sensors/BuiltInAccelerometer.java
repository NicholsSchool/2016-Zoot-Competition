package org.usfirst.frc4930.Zoot.subsystems.sensors;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc4930.Zoot.RobotMap;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;

/**
 *
 */
public class BuiltInAccelerometer extends Command {

	public static BuiltInAccelerometer accelerometer;
	
	public double[][] accelHistory = new double[3][10];

    public BuiltInAccelerometer() {
    	accelerometer = new BuiltInAccelerometer();
    }

    public int xValue() {
    	return accelerometer.getX();
    }
    
    public int yValue() {
    	return accelerometer.getY();
    }
    
    public int zValue() {
    	return accelerometer.getZ();
    }
    
    public double[][] history() {
    	
    	while((int)(Timer.get() *100) % 50 == 0 ){
    		
    		for(int i = 0; i < accelHistory[0].length;  i++) {
    			accelHistory[0][i] = this.xValue();
    			accelHistory[1][i] = this.yValue();
    			accelHistory[2][i] = this.zValue();
    		}
    		
    		
    	}
    }
    
}