package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;
//@todo remove unused import
import org.usfirst.frc4930.Zoot.RobotMap;

/**
 * Autonomous - lasts 15 seconds
 */
public class Autonomous extends Command {

	public Autonomous() {
		requires(Robot.driveTrain);
	}

	// called once
	protected void initialize() {
	}

	// called repeatedly
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
	}

	// called repeatedly
	protected boolean isFinished() {
		return false;
	}

	// called after isFinished() returns true
	protected void end() {
		// @todo any motors set during execute need to be stopped here
	}

	// called when another command requires some subsystem(s)
	protected void interrupted() {
		// @todo typically this should contain same logic as end()
	}
}
