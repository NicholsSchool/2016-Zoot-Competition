package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.RobotMap;

/**
 * MoveArm - lifts the arm
 */
public class MoveArm extends Command {
	
	private final double VERTICAL_POT_EXTREME = 1.0;
	private final double HORIZONTAL_POT_EXTREME = 0.0;
	
	public MoveArm() {
		requires(Robot.armLifter);
	}

	protected void initialize() {
	}

	protected void execute() {
		if (Timer.getMatchTime() >= 20) {
			if ((RobotMap.armPot.get() >= HORIZONTAL_POT_EXTREME) && (RobotMap.armPot.get() <= VERTICAL_POT_EXTREME)) {
				Robot.armLifter.move(Robot.oi.getJoystick2());
			}
			else {
				Robot.armLifter.stop();
			}
		}
		else {
			Robot.armLifter.move(Robot.oi.getJoystick2());
		}
	}

	protected boolean isFinished() {
		if (!Robot.limitSwitch.armUp() || !Robot.limitSwitch.armDown()) {
			return true;
		} else {
			return false;
		}
	}

	protected void end() {
		Robot.armLifter.stop();
	}

	protected void interrupted() {
		Robot.armLifter.stop();
	}
}
