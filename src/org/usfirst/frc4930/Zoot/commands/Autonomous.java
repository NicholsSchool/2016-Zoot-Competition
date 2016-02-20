package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;

/**
 * Autonomous - lasts 15 seconds
 */
public class Autonomous extends Command {

	protected void initialize() {
	}

	protected void execute() {
		// @todo I like the comments below, but add a space after semi-colon
		// RobotMap.driveTrainLeftMaster.set(0.75); //Ran Left Side Backwards
		// RobotMap.driveTrainRightMaster.set(0.75);//Ran Right Side Forwards
		// RobotMap.driveTrainLeftSlave1.set(0.75);//Ran Left Side Backwards
		// RobotMap.driveTrainRightSlave1.set(0.75);//Ran Right Side Forwards
		// RobotMap.driveTrainLeftSlave2.set(0.75);//Ran Left Side Backwards
		// RobotMap.driveTrainRightSlave2.set(0.75);//Ran Right Side Forwards
		// RobotMap.hookDart.set(-0.2);//Ran Hook Down
		// RobotMap.armDart.set(0.2);//Ran Arm Up
		// RobotMap.intakeMotorsSlave.set(0.2);//Ran Counter CLockwise
		// RobotMap.intakeMotorsMaster.set(0.2);//Ran Counter Clockwise

		// example of calling a subsystem (change the ones above)
		Robot.armLifter.move(0.0);
	}

	protected boolean isFinished() {
		return true;
	}

	protected void end() {
		Robot.armLifter.stop();
		// @todo any motors set during execute need to be stopped here
	}

	protected void interrupted() {
		Robot.armLifter.stop();
		// @todo typically this should contain same logic as end()
	}
}
