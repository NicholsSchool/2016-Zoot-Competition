package org.usfirst.frc4930.Zoot.commands;

import org.usfirst.frc4930.Zoot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Compressor On
 */
public class CompressorOn extends Command {

	public CompressorOn() {
		requires(Robot.pneumatics);
	}

	protected void initialize() {
	}

	protected void execute() {
		Robot.pneumatics.c.setClosedLoopControl(true);
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		Robot.pneumatics.c.setClosedLoopControl(false);
	}

	protected void interrupted() {
		Robot.pneumatics.c.setClosedLoopControl(false);
	}
}
