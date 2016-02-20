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
			Robot.intakeMotors.moveLeft(0.3);
			Robot.intakeMotors.moveRight(0.3);
			Robot.roller.move(-0.3);
	}

	protected boolean isFinished() {
		if(RobotMap.boulderIntakeSwitch.get()) {
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
