package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * IntakeMotors
 */
public class IntakeMotors extends Subsystem {

	public void initDefaultCommand() {
	}

	public void moveLeft(double x) {
		RobotMap.intakeMotorsLeft.set(x);
	}
	
	public void moveRight(double x) {
		RobotMap.intakeMotorsRight.set(-x);
	}

	public void stop() {
		RobotMap.intakeMotorsLeft.set(0.0);
		RobotMap.intakeMotorsRight.set(0.0);
	}
}