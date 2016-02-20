package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.RobotMap;
import org.usfirst.frc4930.Zoot.commands.*;
import edu.wpi.first.wpilibj.CANTalon;
// @todo remove unused import
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * DriveTrain
 */
public class DriveTrain extends Subsystem {

	// @todo why create params and never use them?
	public CANTalon leftMaster = RobotMap.driveTrainLeftMaster;
	public CANTalon rightMaster = RobotMap.driveTrainRightMaster;
	// @todo there should never be a need to use the slaves directly
	public CANTalon leftSlave1 = RobotMap.driveTrainLeftSlave1;
	public CANTalon leftSlave2 = RobotMap.driveTrainLeftSlave2;
	public CANTalon rightSlave1 = RobotMap.driveTrainRightSlave1;
	public CANTalon rightSlave2 = RobotMap.driveTrainRightSlave2;
	public static RobotDrive masterMotors = RobotMap.driveTrainMasterMotors;

	public void initDefaultCommand() {
		setDefaultCommand(new TankDrive());
	}

	public static void move(double left, double right) {
		if (Robot.orientation) {
			// @todo this is wrong, use params above
			RobotMap.driveTrainLeftMaster.set(left);
			RobotMap.driveTrainRightMaster.set(-right);
		} else {
			RobotMap.driveTrainLeftMaster.set(-right);
			RobotMap.driveTrainRightMaster.set(left);
		}

	}

	public void stop() {
		// @todo should just call the two masters and set to zero
		masterMotors.tankDrive(0, 0);

	}
}
