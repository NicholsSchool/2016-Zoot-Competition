package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.RobotMap;

/**
 * Intake - intakes the boulder
 */
public class Intake extends Command {

	protected void initialize() {
	}

	protected void execute() {
		Robot.intakeMotors.moveLeft(1.0);
		Robot.intakeMotors.moveRight(1.0);
		Robot.roller.move(-1.0);
	}

	protected boolean isFinished() {
		if (RobotMap.boulderIntakeSwitch.get()) {
			return false;
		} else {
			return true;
		}
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
