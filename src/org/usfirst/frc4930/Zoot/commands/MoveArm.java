package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.RobotMap;

/**
 * MoveArm - lifts the arm
 */
public class MoveArm extends Command {

	// private static double highPotVal = 0.75;
	// private static double lowPotVal = 0.25;
	// private static double armPotVal;

	protected void initialize() {
	}

	protected void execute() {
		Robot.armLifter.move(Robot.oi.getJoystick2());
	}

	protected boolean isFinished() {
		if (!RobotMap.armHighExtremeSwitch.get() || !RobotMap.armLowExtremeSwitch.get()) {
			return true;
		} else {
			return false;
		}
	}

	protected void end() {
		Robot.armLifter.stop();
	}

	protected void interrupted() {
		Robot.armLifter.stop();
	}
}
