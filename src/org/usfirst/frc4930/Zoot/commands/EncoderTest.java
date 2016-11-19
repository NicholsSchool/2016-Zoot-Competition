package org.usfirst.frc4930.Zoot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.RobotMap;

public class EncoderTest extends Command {
    double distance;
    double endDistance;

	protected void initialize() {
		distance = Robot.DrivebaseRight.getDistance();
		endDistance = distance+(2456);
	
	}


	protected void execute() {
		/*if(Robot.DrivebaseRight.getDistance() < endDistance + 100){
			Robot.armLifter.move(0.1);
		}
		else if (Robot.DrivebaseRight.getDistance() > endDistance - 100){
			Robot.armLifter.move(-0.1);
		}*/
		RobotMap.driveTrainLeftMaster.set(-0.3);
		
	}


	protected boolean isFinished() {
//		RobotMap.driveTrainLeftMaster.enableBrakeMode( Robot.DrivebaseRight.getDistance() >= (endDistance  - 1000.0));
//		RobotMap.driveTrainLeftSlave1.enableBrakeMode( Robot.DrivebaseRight.getDistance() >= (endDistance  - 1000.0));
//		RobotMap.driveTrainLeftSlave2.enableBrakeMode( Robot.DrivebaseRight.getDistance() >= (endDistance  - 1000.0));

		return ( Robot.DrivebaseRight.getDistance() >= endDistance);
	}

	protected void end() {

		Robot.armLifter.stop();
	}

	
	protected void interrupted() {
	
		Robot.armLifter.stop();
	}

}
