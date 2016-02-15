package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;

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
    }
    
    // called repeatedly
    protected boolean isFinished() {
        return false;
    }
    
    // called after isFinished() returns true
    protected void end() {
    }
    
    // called when another command requires some subsystem(s)
    protected void interrupted() {
    }
}
