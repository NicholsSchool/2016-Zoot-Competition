package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * DriveTrain
 */
public class DriveTrain extends Subsystem {

	public void initDefaultCommand() {
	}

	public void move(double left, double right) {
		if (Robot.orientation) {
			RobotMap.driveTrainMasterMotors.tankDrive(left, right);
		} else {
			RobotMap.driveTrainMasterMotors.tankDrive(-right, -left);
		}
	}

	public void stop() {
		RobotMap.driveTrainMasterMotors.stopMotor();
	}
}
