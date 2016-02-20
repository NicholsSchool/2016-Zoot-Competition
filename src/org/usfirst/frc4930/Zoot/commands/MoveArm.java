package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.RobotMap;

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
		Robot.armLifter.move(Robot.oi.getJoystick2());
	}

	// called repeatedly
	protected boolean isFinished() {
		if(RobotMap.armHighExtremeSwitch.get() || RobotMap.armLowExtremeSwitch.get()) {
			return true;
		} else {
			return false;
		}
	}

	// called after isFinished() returns true
	protected void end() {
		Robot.armLifter.stop();
	}

	// called when another command requires some subsystem(s)
	protected void interrupted() {
		Robot.armLifter.stop();
	}
}
