package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Roller - Subsystem that controls the Roller Motor
 */

public class Roller extends Subsystem {

	protected void initDefaultCommand() {
	}

	public void move(double x) {
		RobotMap.roller.set(-x);
	}

	public void stop() {
		RobotMap.roller.set(0.0);
	}
}
