package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;

// @todo I think maybe renaming to shootBoulder makes more sense

/**
 * Shoot - shoots the boulder
 */
public class Shoot extends Command {

	public Shoot() {
		requires(Robot.intakeMotors);
	}

	// called once
	protected void initialize() {
	}

	// called repeatedly
	protected void execute() {
		Robot.intakeMotors.shoot();
	}

	// called repeatedly
	protected boolean isFinished() {
		return false;
	}

	// called after isFinished() returns true
	protected void end() {
		Robot.intakeMotors.stop();
	}

	// called when another command requires some subsystem(s)
	protected void interrupted() {
		Robot.intakeMotors.stop();
	}
}
