package org.usfirst.frc4930.Zoot.commands;

import org.usfirst.frc4930.Zoot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Compressor On
 */
public class CompressorOn extends Command {

	protected void initialize() {
	}

	protected void execute() {
		Robot.pneumatics.startCompressing();
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		Robot.pneumatics.endCompressing();
	}

	protected void interrupted() {
		Robot.pneumatics.endCompressing();
	}
}
