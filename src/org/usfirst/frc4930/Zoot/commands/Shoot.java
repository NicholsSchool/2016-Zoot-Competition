package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;

/**
 * Shoot - shoots the boulder
 */
public class Shoot extends Command {

	public Shoot() {
		requires(Robot.intakeMotors);
		requires(Robot.roller);
	}

	// called once
	protected void initialize() {
	}

	// called repeatedly
	protected void execute() {
		Robot.intakeMotors.shoot();
		Robot.roller.shoot();
	}

	// called repeatedly
	protected boolean isFinished() {
		return true;
	}

	// called after isFinished() returns true
	protected void end() {
		Robot.intakeMotors.stop();
		Robot.roller.stop();
	}

	// called when another command requires some subsystem(s)
	protected void interrupted() {
		Robot.intakeMotors.stop();
		Robot.roller.stop();
	}
}
