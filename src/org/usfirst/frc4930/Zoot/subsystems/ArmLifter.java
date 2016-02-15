package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 * ArmLifter
 */
public class ArmLifter extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand()); 	
    }
    
    public void up( double yAxis ) {
    	RobotMap.armDart.set( yAxis );
    }
    
    public void down( double yAxis ) {
    	RobotMap.armDart.set( yAxis );
    }
    
    public void move(double yAxis ) {
    	RobotMap.armDart.set( yAxis );
    }
       
}

