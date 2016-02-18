package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * HookExtender
 */
public class HookExtender extends Subsystem {

    public void initDefaultCommand() {

    }
    
    public void extend( double extendVoltage ) {
    	RobotMap.hookDart.set( extendVoltage );
    	
    }
    
    public void retract( double retractVoltage ) {
    	RobotMap.hookDart.set( retractVoltage );
    	
    }
    
    public void move( double extenderVoltage ) {
    	RobotMap.hookDart.set( extenderVoltage );
    }
}

