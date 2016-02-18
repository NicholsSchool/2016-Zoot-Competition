package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.subsystems.ArmLifter;

/**
 * MoveArm - lifts the arm
 */
public class MoveArm extends Command {

    public MoveArm() {
        requires(Robot.armLifter);
    }
    
    // called once
    protected void initialize() {
    }
    
    // called repeatedly
    protected void execute() {
    	ArmLifter.move(Robot.oi.joystick2.getY());
    }
    
    // called repeatedly
    protected boolean isFinished() {
        return false;
    }
    
    // called after isFinished() returns true
    protected void end() {
    	Robot.armLifter.stop();
    }
    
    // called when another command requires some subsystem(s)
    protected void interrupted() {
    }
}
