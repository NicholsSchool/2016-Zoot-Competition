package org.usfirst.frc4930.Zoot.commands;

import org.usfirst.frc4930.Zoot.Robot;
import org.usfirst.frc4930.Zoot.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class Autonomous5 extends Command {

	public Autonomous5(){
	    requires(Robot.driveTrain);
	    requires(Robot.armLifter);
	}
	protected void initialize() {
	    RobotMap.driveTrainMasterMotors.setSafetyEnabled(false);
	    RobotMap.driveTrainLeftMaster.enableBrakeMode(true);
	    RobotMap.driveTrainLeftSlave1.enableBrakeMode(true);
	    RobotMap.driveTrainLeftSlave2.enableBrakeMode(true);
	    RobotMap.driveTrainRightMaster.enableBrakeMode(true);
	    RobotMap.driveTrainRightSlave1.enableBrakeMode(true);
	    RobotMap.driveTrainRightSlave2.enableBrakeMode(true);
	}

	protected void execute() {
		this.FrenchCroissantAuto();
	}

	protected boolean isFinished() {
		return true;
	}

	protected void end() {
		Robot.driveTrain.stop();
		Robot.armLifter.stop();
	}

	protected void interrupted() {
		Robot.driveTrain.stop();
		Robot.armLifter.stop();
	}
	
	protected void FrenchCroissantAuto(){
		Robot.driveTrain.move(-0.5, -0.5);
		Timer.delay(2.5);
		Robot.driveTrain.move(-0.1, -0.1);
		Robot.armLifter.move(-0.87);
		Timer.delay(1.5);
		Robot.armLifter.stop();
		Robot.driveTrain.move(-0.8, -0.8);
		Robot.armLifter.move(1.0);
		Timer.delay(1.25);
		Robot.driveTrain.stop();
	}

}
