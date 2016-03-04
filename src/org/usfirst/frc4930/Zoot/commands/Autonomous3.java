package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.RobotMap;

/**
 * Autonomous - lasts 15 seconds
 */
public class Autonomous3 extends Command {

	protected void initialize() {
	}

	protected void execute() {
		RobotMap.driveTrainLeftMaster.set(0.5);
		// RobotMap.driveTrainRightMaster.set(0.5);
		// RobotMap.intakeMotorsLeft.set(0.5);
		// RobotMap.intakeMotorsRight.set(0.5);
		// RobotMap.roller.set(0.5);
		// RobotMap.armDart.set(0.5);
		// RobotMap.hookDart.set(0.5);
	}

	protected boolean isFinished() {
		return true;
	}

	protected void end() {
		// every subsystem used in execute() should be stopped here
		Robot.driveTrain.stop();
	}

	protected void interrupted() {
		// this needs to be the same as end()
		Robot.driveTrain.stop();
	}
}
