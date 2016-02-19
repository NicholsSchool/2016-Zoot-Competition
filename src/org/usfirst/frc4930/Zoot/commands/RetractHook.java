package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;

/**
 * RetractHook - retracts the hook
 */
public class RetractHook extends Command {

    public RetractHook() {
        requires(Robot.hookExtender);
    }
    
    // called once
    protected void initialize() {
    }
    
    // called repeatedly
    protected void execute() {
    	Robot.hookExtender.retract();
    }
    
    // called repeatedly
    protected boolean isFinished() {
        return false;
    }
    
    // called after isFinished() returns true
    protected void end() {
    	Robot.hookExtender.stop();
    }
    
    // called when another command requires some subsystem(s)
    protected void interrupted() {
    	Robot.hookExtender.stop();
    }
}
