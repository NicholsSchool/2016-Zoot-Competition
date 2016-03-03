package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;

/**
 * Autonomous - lasts 15 seconds
 */
public class AutonomousOne extends Command {

	protected void initialize() {
	}

	protected void execute() {
		Robot.armLifter.move(0.7);
		Timer.delay(0.5);
		Robot.driveTrain.move(0.3, 0.3);
		Timer.delay(2);
		// Robot.driveTrain.stop();
		// Robot.armLifter.move(0.5);
		// Timer.delay(1);
		// Robot.armLifter.stop();
		// Robot.driveTrain.move(0.2, -0.2);
		// Timer.delay(0.5);
		// Robot.driveTrain.stop();
		// Robot.driveTrain.move(0.3, 0.3);
		// Timer.delay(1.0);
		// Robot.driveTrain.stop();
		// Robot.intakeMotors.moveLeft(1.0);
		// Robot.intakeMotors.moveRight(1.0);
		// Timer.delay(2.0);
		// Robot.roller.move(1.0);
		// Timer.delay(0.5);
		// Robot.intakeMotors.stop();
		// Robot.roller.stop();
	}

	protected boolean isFinished() {
		return true;
	}

	protected void end() {
		// every subsystem used in execute() should be stopped here
		Robot.driveTrain.stop();
		Robot.armLifter.stop();
	}

	protected void interrupted() {
		// this needs to be the same as end()
		Robot.driveTrain.stop();
		Robot.armLifter.stop();
	}
}
