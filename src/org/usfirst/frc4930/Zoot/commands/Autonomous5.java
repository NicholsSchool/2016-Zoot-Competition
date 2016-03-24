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
	}

	protected void execute() {
		this.FrenchCroissantAuto();
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		
	}

	protected void interrupted() {
		
	}
	
	protected void FrenchCroissantAuto(){
		Robot.driveTrain.move(0.5, 0.5);
		Timer.delay(1.5);
		Robot.driveTrain.stop();
		Robot.armLifter.move(-0.6);
		Timer.delay(3.0);
		Robot.armLifter.stop();
		Robot.driveTrain.move(0.8, 0.8);
		Timer.delay(1.5);
		Robot.driveTrain.stop();
	}

}
