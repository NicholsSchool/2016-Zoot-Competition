package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;

/**
 * Drop - slowly drop boulder
 */
public class Drop extends Command {

	public Drop() {
		requires(Robot.intakeMotors);
		requires(Robot.roller);
	}

	// called once
	protected void initialize() {
	}

	// called repeatedly
	protected void execute() {
		Robot.intakeMotors.move(-0.3);
		Robot.roller.move(0.3);
		Timer.delay(2.0);
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
