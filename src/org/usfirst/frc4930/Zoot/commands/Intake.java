package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;

/**
 * Intake - intakes the boulder
 */
public class Intake extends Command {

	public Intake() {
		requires(Robot.intakeMotors);
		requires(Robot.roller);
	}

	protected void initialize() {
	}

	protected void execute() {
		Robot.intakeMotors.intake();
		Robot.roller.intake();
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		Robot.intakeMotors.stop();
		Robot.roller.stop();
	}

	protected void interrupted() {
		Robot.intakeMotors.stop();
		Robot.roller.stop();
	}
}
