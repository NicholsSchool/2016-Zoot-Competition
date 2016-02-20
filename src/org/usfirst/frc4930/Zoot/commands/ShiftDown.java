package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;

/**
 * ShiftDown - shifts the gear down
 */
public class ShiftDown extends Command {

	protected void initialize() {
	}

	protected void execute() {
		Robot.pneumatics.changeGear();
	}

	protected boolean isFinished() {
		return true;
	}

	protected void end() {
		Robot.pneumatics.stop();
	}

	protected void interrupted() {
		Robot.pneumatics.stop();
	}
}
