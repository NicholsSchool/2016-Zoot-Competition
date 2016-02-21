package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;

/**
 * ShiftUp - shifts the gear up
 */
public class ShiftUp extends Command {

	protected void initialize() {
	}

	protected void execute() {
		Robot.pneumatics.enableHighGear();
	}

	protected boolean isFinished() {
		return true;
	}

	protected void end() {
	}

	protected void interrupted() {
	}
}
