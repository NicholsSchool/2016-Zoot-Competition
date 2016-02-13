package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ArmExtender extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void extend( double extendVoltage ) {
    	RobotMap.armDartTwo.set( extendVoltage );
    	
    }
    
    public void retract( double retractVoltage ) {
    	RobotMap.armDartTwo.set( retractVoltage );
    	
    }
    
    public void move( double extenderVoltage ) {
    	RobotMap.armDartTwo.set( extenderVoltage );
    }
}

