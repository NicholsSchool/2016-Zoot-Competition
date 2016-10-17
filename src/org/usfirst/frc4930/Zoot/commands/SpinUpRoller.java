package org.usfirst.frc4930.Zoot.commands;

import org.usfirst.frc4930.Zoot.Robot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SpinUpRoller extends Command {
	double endTime;
    public SpinUpRoller() {
        
    }
    // Called just before this Command runs the first time
    protected void initialize() {
    	endTime =Timer.getFPGATimestamp()+1;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.roller.move(1.0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (Timer.getFPGATimestamp() >= endTime);
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.intakeMotors.stop();
        Robot.roller.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}