package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;

/**
 * Drop - slowly drop boulder
 */
public class Drop extends Command {

	protected void initialize() {
	}

	protected void execute() {
		Robot.intakeMotors.moveLeft(-0.3);
		Robot.intakeMotors.moveRight(0.3);
		Robot.roller.move(0.3);
		Timer.delay(2.0);
	}

	protected boolean isFinished() {
		return true;
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
