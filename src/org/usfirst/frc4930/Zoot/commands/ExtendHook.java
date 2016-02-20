package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.RobotMap;

/**
 *  ExtendHook - controls the length of the hook arm
 */
public class ExtendHook extends Command {

    public ExtendHook() {
        requires(Robot.hookExtender);
    }
    
    // called once
    protected void initialize() {
    }
    
    // called repeatedly
    protected void execute() {
    	Robot.hookExtender.extend();
    }
    
    // called repeatedly
    protected boolean isFinished() {
    	if(RobotMap.hookHighExtremeSwitch.get()) {
    		return true;
    	} else {
    		return false;
    	}
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
