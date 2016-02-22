package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;

/**
 * ExtendHook - controls the length of the hook arm
 */
public class ExtendHook extends Command {

	protected void initialize() {
	}

	protected void execute() {
		Robot.hookExtender.move(-1.0);
	}

	protected boolean isFinished() {
		if (!Robot.limitSwitch.hookExtended()) {
			return true;
		} else {
			return false;
		}
	}

	protected void end() {
		Robot.hookExtender.stop();
	}

	protected void interrupted() {
		Robot.hookExtender.stop();
	}
}
