package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;

/**
 * Autonomous - lasts 15 seconds
 */
public class Autonomous2 extends Command {

	protected void initialize() {
	}

	protected void execute() {
		Robot.driveTrain.move(0.7, 0.7);
		Timer.delay(5.0);
	}

	protected boolean isFinished() {
		return true;
	}

	protected void end() {
		// every subsystem used in execute() should be stopped here
		Robot.driveTrain.stop();
	}

	protected void interrupted() {
		// this needs to be the same as end()
		Robot.driveTrain.stop();
	}
}
