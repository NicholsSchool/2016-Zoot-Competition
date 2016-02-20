package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

// @todo add comments generally

/**
 * HookExtender
 */
public class HookExtender extends Subsystem {
    
    public void initDefaultCommand() {
    }
    
    public void extend() {
    	RobotMap.hookDart.set(-.4);
    }
    
    public void retract() {
    	RobotMap.hookDart.set(.4);   	
    }
    
    public void stop() {
    	RobotMap.hookDart.set(0.0);
    }
}
