package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * IntakeMotors
 */
public class IntakeMotors extends Subsystem {

	public void initDefaultCommand() {
	}

	public void move(double x) {
		RobotMap.intakeMotorsMaster.set(x);
	}

	public void stop() {
		RobotMap.intakeMotorsMaster.set(0.0);
	}
}
