package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.RobotMap;

/**
 * RetractHook - retracts the hook
 */
public class RetractHook extends Command {

	protected void initialize() {
	}

	protected void execute() {
		Robot.hookExtender.move(0.7);
	}

	protected boolean isFinished() {
		if (!RobotMap.hookLowExtremeSwitch.get()) {
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
