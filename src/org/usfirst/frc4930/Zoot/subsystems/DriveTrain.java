package org.usfirst.frc4930.Zoot.subsystems;

import org.usfirst.frc4930.Zoot.RobotMap;
import org.usfirst.frc4930.Zoot.commands.*;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 * DriveTrain
 */
public class DriveTrain extends Subsystem {

    public CANTalon leftMaster = RobotMap.driveTrainLeftMaster;
    public CANTalon rightMaster = RobotMap.driveTrainRightMaster;
    public CANTalon leftSlave1 = RobotMap.driveTrainLeftSlave1;
    public CANTalon leftSlave2 = RobotMap.driveTrainLeftSlave2;
    public CANTalon rightSlave1 = RobotMap.driveTrainRightSlave1;
    public CANTalon rightSlave2 = RobotMap.driveTrainRightSlave2;
    public static RobotDrive masterMotors = RobotMap.driveTrainMasterMotors;

    public void initDefaultCommand() {
        setDefaultCommand(new TankDrive());
    }

	public void takeJoystickInputs(Joystick joystick0, Joystick joystick1) {

		masterMotors.tankDrive(joystick0.getY() , joystick1.getY());
		
		
	}
	public void runMotors(double joystick0 , double joystick1){
		masterMotors.tankDrive( joystick0 , joystick1);
	}
	public void stop() {
		masterMotors.tankDrive(0, 0);
		
	}
}

