package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;

/**
 * ShiftDown - shifts the gear down
 */
public class ShiftDown extends Command {

    public ShiftDown() {
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

