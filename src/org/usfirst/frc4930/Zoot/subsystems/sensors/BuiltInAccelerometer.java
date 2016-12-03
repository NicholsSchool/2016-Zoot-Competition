package org.usfirst.frc4930.Zoot.subsystems.sensors;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc4930.Zoot.RobotMap;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;

/**
 *
 */
public class BuiltInAccelerometer extends Command {
	
	public static BuiltInAccelerometer accelerometer;

    public BuiltInAccelerometer() {

    }

    
    protected void initialize() {
    	accelerometer = new BuiltInAccelerometer();
    }

   
    protected void execute() {
        SmartDashboard.putNumber("accelerometer: x value", RobotMap.accelerometer.getX());
        SmartDashboard.putNumber("accelerometer: y value", RobotMap.accelerometer.getY());
        SmartDashboard.putNumber("accelerometer: z value", RobotMap.accelerometer.getZ());
    }

    
    protected boolean isFinished() {
        return false;
    }

    
    protected void end() {
    }

    protected void interrupted() {
    }
}
