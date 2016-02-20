package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * IntakeMotors
 */
public class IntakeMotors extends Subsystem {

	public void initDefaultCommand() {
	}

	public void intake() {
		RobotMap.intakeMotorsLeft.set(0.9);
		RobotMap.intakeMotorsRight.set(-0.9);
	}

	public void shoot() {
		RobotMap.intakeMotorsLeft.set(-0.9);
		RobotMap.intakeMotorsRight.set(0.9);
	}

	public void drop() {
		RobotMap.intakeMotorsLeft.set(-0.5);
		RobotMap.intakeMotorsRight.set(0.5);
	}

	public void move(double x) {
		RobotMap.intakeMotorsLeft.set(x);
		RobotMap.intakeMotorsRight.set(-x);
	}

	public void stop() {
		RobotMap.intakeMotorsLeft.set(0.0);
		RobotMap.intakeMotorsRight.set(0.0);
	}
}
