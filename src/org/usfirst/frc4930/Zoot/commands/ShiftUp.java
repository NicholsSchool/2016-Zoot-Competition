package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.subsystems.Pneumatics;

/**
 * ShiftUp - shifts the gear up
 */
public class ShiftUp extends Command {

    public ShiftUp() {
    	requires(Robot.pneumatics);
    }
    
    // called once
    protected void initialize() {
    }
    
    // called repeatedly
    protected void execute() {
    	if (!Robot.gearShift) {
    		Pneumatics.doubleSolenoid.set(DoubleSolenoid.Value.kForward);
    		Robot.gearShift = true;
    	}
    		
    }
    
    // called repeatedly
    protected boolean isFinished() {
        return true;
    }
    
    // called after isFinished() returns true
    protected void end() {
    	
    }
    
    // called when another command requires some subsystem(s)
    protected void interrupted() {
    }
}
