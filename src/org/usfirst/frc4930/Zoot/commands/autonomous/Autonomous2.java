package org.usfirst.frc4930.Zoot.commands.autonomous;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.RobotMap;

/**
 * Autonomous - lasts 15 seconds
 */
public class Autonomous2 extends Command {

	public Autonomous2() {
		requires(Robot.driveTrain);
		requires(Robot.armLifter);
	}

	protected void initialize() {
		RobotMap.driveTrainMasterMotors.setSafetyEnabled(false);
	}

	protected void execute() {
		this.lowBarAutoNoShot();
	}

	protected boolean isFinished() {
		return true;
	}

	protected void end() {
		Robot.driveTrain.stop();
		Robot.armLifter.stop();
	}

	protected void interrupted() {
		Robot.driveTrain.stop();
		Robot.armLifter.stop();
	}

	protected void lowBarAutoNoShot() {
		Robot.armLifter.move(-0.8);
		Timer.delay(2);
		Robot.armLifter.stop();
		Robot.driveTrain.move(-0.7, -0.7);
		Timer.delay(1.5);
		Robot.driveTrain.stop();
	}
}
